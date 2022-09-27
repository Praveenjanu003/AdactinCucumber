package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationManager {

	public static Properties p;
	
	public ConfigurationManager() throws Exception {
		
		File f = new File("C:\\Users\\vidhy\\eclipse-workspace\\New folder\\Adactin_Cucumber\\src\\test\\java\\com\\Properties\\Addactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	
}
