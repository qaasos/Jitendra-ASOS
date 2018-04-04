package com.demoqa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {

	Properties property;
	
	
	
	public Properties getConfig() throws Exception
	{
		String FilePath = System.getProperty("user.dir") + "\\config\\config.properties";
		
		 property = new Properties();
		 
		 property.load(new FileInputStream(new File(FilePath)));
		 
		 return property;
		 
			
	}
	
}
