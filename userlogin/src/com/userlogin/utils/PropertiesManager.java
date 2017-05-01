package com.userlogin.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties クラスは、不変のプロパティーセットを表します。
 * Properties を、ストリームへ保管したり、ストリームからロードしたりできます。
 * プロパティーリストの各キー、およびそれに対応する値は文字列です。
 * 
 * @author yao
 *
 */
public class PropertiesManager {

	public static Properties getProperties(String propertiesFileName) {
		Properties properties = null;
		properties = new Properties();
		try {
			properties.load(PropertiesManager.class.getClassLoader().getResourceAsStream(propertiesFileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	
	public static void main(String[] args) {
		Properties p = getProperties("com/userlogin/utils/jdbc.properties");
		System.out.println(p.getProperty("jdbcUrl"));
	}
}
