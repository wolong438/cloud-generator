package com.dux.cloud.generator;

import com.dux.cloud.generator.util.MybatisGeneratorUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * 代码生成类
 * Created by ZhangShuzheng on 2017/1/10.
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "app-customer-provider";
	private static String DATABASE = "sino-commons";
	private static String TABLE_PREFIX = "ls_latency_customer";
	private static String PACKAGE_NAME = "com.sinosoft.sss.cloud.customer";
	private static ResourceBundle appResource = ResourceBundle.getBundle("generator");
	private static String JDBC_DRIVER = appResource.getString("generator.jdbc.driver");
	private static String JDBC_URL = appResource.getString("generator.jdbc.url");
	private static String JDBC_USERNAME = appResource.getString("generator.jdbc.username");
	private static String JDBC_PASSWORD = appResource.getString("generator.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	static {
		//LAST_INSERT_ID_TABLES.put("upms_user", "user_id");
	}

	/**
	 * 自动代码生成
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// 清除旧代码
		MybatisGeneratorUtil.clear(PACKAGE_NAME);
		// 生成新代码
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);

	}

}
