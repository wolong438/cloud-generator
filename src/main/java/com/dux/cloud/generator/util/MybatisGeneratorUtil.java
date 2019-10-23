package com.dux.cloud.generator.util;

import org.apache.commons.lang.ObjectUtils;
import org.apache.velocity.VelocityContext;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.dux.cloud.generator.util.StringUtil.lineToHump;


/**
 * 代码生成类
 * Created by dux on 2019/10/23.
 */
public class MybatisGeneratorUtil {
	private static String basePath = getBasePath();

	/**
	 * 根据模板生成generatorConfig.xml文件
	 * @param jdbcDriver   驱动路径
	 * @param jdbcUrl      链接
	 * @param jdbcUsername 帐号
	 * @param jdbcPassword 密码
	 * @param module        项目模块
	 * @param database      数据库
	 * @param tablePrefix  表前缀
	 * @param packageName  包名
	 */
	public static void generator(
			String jdbcDriver,
			String jdbcUrl,
			String jdbcUsername,
			String jdbcPassword,
			String module,
			String database,
			String tablePrefix,
			String packageName,
			Map<String, String> lastInsertIdTables) throws Exception{

		// 基本路径、配置路径、项目路径
		String packagePath = basePath + "/src/main/java/" + packageName.replaceAll("\\.", "/");
		String generatorConfigXml = basePath + "/src/main/resources/generatorConfig.xml";
		String targetProject = basePath;

		System.out.println("========== 开始生成generatorConfig.xml文件 ==========");
		List<Map<String, Object>> tables = new ArrayList<>();
		try {
			VelocityContext context = new VelocityContext();
			Map<String, Object> table;

			// 查询定制前缀项目的所有表
			String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + database + "' AND table_name LIKE '" + tablePrefix + "%';";
			JdbcUtil jdbcUtil = new JdbcUtil(jdbcDriver, jdbcUrl, jdbcUsername, AESUtil.aesDecode(jdbcPassword));
			List<Map> result = jdbcUtil.selectByParams(sql, null);
			for (Map map : result) {
				System.out.println(map.get("TABLE_NAME"));
				table = new HashMap<>(2);
				table.put("table_name", map.get("TABLE_NAME"));
				table.put("model_name", lineToHump(ObjectUtils.toString(map.get("TABLE_NAME"))));
				tables.add(table);
			}
			jdbcUtil.release();

			// 构建配置文件
			context.put("tables", tables);
			context.put("generator_javaModelGenerator_targetPackage", packageName + ".entity");
			context.put("generator_sqlMapGenerator_targetPackage", ".mapper");
			context.put("generator_javaClientGenerator_targetPackage", packageName + ".respository.impl4mybatis.mapper");
			context.put("targetProject", targetProject);
			context.put("generator_jdbc_password", AESUtil.aesDecode(jdbcPassword));
			context.put("last_insert_id_tables", lastInsertIdTables);
			String generatorConfig_vm = basePath + FileType.MGB_CONFIG.getVmPath();
			VelocityUtil.generate(generatorConfig_vm, generatorConfigXml, context);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("========== 结束生成generatorConfig.xml文件 ==========");

		System.out.println("========== 开始运行MybatisGenerator ==========");
		List<String> warnings = new ArrayList<>();
		File configFile = new File(generatorConfigXml);
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			System.out.println(warning);
		}
		System.out.println("========== 结束运行MybatisGenerator ==========");

		String ctime = new SimpleDateFormat("yyyy/M/d").format(new Date());
		for (int i = 0; i < tables.size(); i++) {
			String model = lineToHump(ObjectUtils.toString(tables.get(i).get("table_name")));

			VelocityContext context = new VelocityContext();
			context.put("package_name", packageName);
			context.put("model", model);
			context.put("modelAlias", toLowerCaseFirstOne(model));
			context.put("ctime", ctime);

			//create(FileType.ENTITY, context);
			//create(FileType.MAPPER_XML, context);
			create(FileType.BASE_MAPPER, context);
			create(FileType.MAPPER, context);
			create(FileType.DAO, context);
			create(FileType.DAO_IMPL, context);
			create(FileType.SERVICE, context);
			create(FileType.SERVICE_IMPL, context);
			create(FileType.Controller, context);
			create(FileType.API1, context);
			create(FileType.API2, context);
			create(FileType.FALLBACK, context);
			create(FileType.EXTERNAL_SERVICE, context);
		}
		System.out.println("========== 文件生成完成 ==========");
	}

	public static void create(FileType fileType, VelocityContext context) {
		String inputVmFilePath = basePath + fileType.getVmPath();
		String outputFilePath = basePath + fileType.getJavaPath((String)context.get("package_name"), (String)context.get("model"));
		File file = new File(outputFilePath);
		boolean bool = file.exists();
		//System.out.println((bool ? "文件存在: 是  " : "文件存在: 否  ") + file.getAbsolutePath());

		if (!bool) {
			try {
				createNewFile(file);
			} catch (Exception e) {
				System.out.println("文件创建失败，" + e.getLocalizedMessage());
			}

			try {

				VelocityUtil.generate(inputVmFilePath, outputFilePath, context);
			} catch (Exception e) {
				System.out.println("文件写入失败，" + e.getLocalizedMessage());
			}
		}
	}

	/**
	 * 清空旧代码
	 * @param packageName 包名
	 */
	public static void clear(String packageName) {
		String packagePath = basePath + "/src/main/java/" + packageName.replaceAll("\\.", "/");
		deleteDir(new File(packagePath));
		deleteDir(new File(basePath + "/src/main/resources/mapper"));
	}

	// 递归删除非空文件夹
	public static void deleteDir(File dir) {
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (int i = 0; i < files.length; i++) {
				deleteDir(files[i]);
			}
		}
		dir.delete();
	}

	/**
	 * 创建新文件
	 * @param file
	 * @throws IOException
	 */
	public static void createNewFile(File file) throws IOException {
		if (file.isDirectory()) {
			file.mkdirs();
		} else {
			boolean bool = false;
			File dir = file.getParentFile();
			if (!dir.exists()) {
				bool = dir.mkdirs();
			}
			if (bool) {
				file.createNewFile();
			}
		}
	}

	public static String getBasePath() {
		return ClassLoader.getSystemResource("").getPath().replaceFirst("/", "").replace("/target/classes/", "");
	}

	/**
	 * 字符串首字母小写
	 * @param str
	 * @return
	 */
	public static String toLowerCaseFirstOne(String str)
	{
		if(Character.isLowerCase(str.charAt(0))) {
			return str;
		} else {
			return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
		}
	}

	/**
	 * 文件类型枚举类
	 */
	public enum FileType {
		MGB_CONFIG("generatorConfig.vm", "", "generatorConfig.xml"),
		ENTITY("Entity.vm", "{0}.entity", "{0}.java"),
		BASE_MAPPER("BaseMapper.vm", "{0}.respository.impl4mybatis.mapper", "BaseMapper.java"),
		MAPPER("Mapper.vm", "{0}.respository.impl4mybatis.mapper", "{0}Mapper.java"),
		MAPPER_XML("MapperXml.vm", "mapper", "{0}Mapper.xml"),
		DAO("Dao.vm", "{0}.respository", "{0}Dao.java"),
		DAO_IMPL("DaoImpl.vm", "{0}.respository.impl4mybatis", "{0}DaoImpl.java"),
		SERVICE("Service.vm", "{0}.service", "{0}Service.java"),
		SERVICE_IMPL("ServiceImpl.vm", "{0}.service.impl", "{0}ServiceImpl.java"),
		Controller("Controller.vm", "{0}.controller", "{0}Controller.java"),
		API1("API1.vm", "{0}.api.springmvc", "{0}Api.java"),
		API2("API2.vm", "{0}.api.primary", "{0}Api.java"),
		FALLBACK("Fallback.vm", "{0}.api.fallback", "Default{0}ApiFallback.java"),
		EXTERNAL_SERVICE("ExternalService.vm", "{0}.externalService", "{0}Service.java"),
		;

		private String vmFile;
		private String packageName;
		private String javaFile;

		FileType(String vmFile,String packageName, String javaFile) {
			this.vmFile = vmFile;
			this.packageName = packageName;
			this.javaFile = javaFile;
		}

		public String getVmPath() {
			return "/src/main/resources/templates/" + this.getVmFile();
		}

		public String getJavaPath(String packageName, String model) {
			String directory = "/src/main/java/" + getPackageName(packageName).replaceAll("\\.", "/") + "/";
			String filepath = directory + this.getJavaFile(model);
			return filepath;
		}

		public String getVmFile() {
			return vmFile;
		}

		public String getJavaFile() {
			return javaFile;
		}

		public String getJavaFile(String model) {
			return MessageFormat.format(getJavaFile(), model);
		}

		public String getPackageName() {
			return packageName;
		}

		public String getPackageName(String basePackageName) {
			return MessageFormat.format(getPackageName(), basePackageName);
		}
	}
}
