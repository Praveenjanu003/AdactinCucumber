package com.Properties;

public class FileReaderManager {

	private FileReaderManager() {

	}
	
	public static FileReaderManager fileReaderMethod() {
		
		FileReaderManager frm = new FileReaderManager();
		
		return frm;
	
}
	
	public ConfigurationManager ConfigurationManagermethod() throws Exception {
		
		ConfigurationManager cm = new ConfigurationManager();
		
		return cm;

	}
	
}

