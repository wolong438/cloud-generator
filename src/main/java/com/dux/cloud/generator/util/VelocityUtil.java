package com.dux.cloud.generator.util;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.util.Properties;

/**
 * Velocity工具类
 * Created by dux on 2019/10/23.
 */
public class VelocityUtil {

	/**
	 * 根据模板生成文件
	 * @param inputVmFilePath 模板路径
	 * @param outputFilePath 输出文件路径
	 * @param context
	 * @throws Exception
	 */
	public static void generate(String inputVmFilePath, String outputFilePath, VelocityContext context) throws Exception {
		try {
			String[] paths = getPaths(inputVmFilePath);
			Properties properties = new Properties();
			properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, paths[0]);
			Velocity.init(properties);
			//VelocityEngine engine = new VelocityEngine();
			Template template = Velocity.getTemplate(paths[1], "utf-8");
			File outputFile = new File(outputFilePath);
			FileWriterWithEncoding writer = new FileWriterWithEncoding(outputFile, "utf-8");
			template.merge(context, writer);
			writer.close();
		} catch (Exception ex) {
			throw ex;
		}
	}

	/**
	 * 拆分文件路径和名字
	 * @param filePath
	 * @return
	 */
	public static String[] getPaths(String filePath) {
		String[] paths = new String[2];
		if (StringUtils.isNotBlank(filePath)) {
			int index = filePath.lastIndexOf("/");
			paths[0] = filePath.substring(0, index);
			paths[1] = filePath.substring(index + 1);
		}
		return paths;
	}

}
