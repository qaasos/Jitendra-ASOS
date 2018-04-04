package com.demoqa.utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {
	
	
	public WebDriver driver;
	public Properties property;
	public ConfigUtils Config;
	public  WebDriver getDriver(String browser) throws Exception
	{
		Config = new ConfigUtils();
		property = new Properties(); 
		property = Config.getConfig();
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty(property.getProperty("ChromeDriver"),"D:\\Jitendra\\Jitendra_ASOS\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-extensions");
			options.addArguments("disable-infobars");
			options.addArguments("incognito");
		
			driver = new ChromeDriver(options);
			
			return driver;
			
		}
		
		else if(browser.equalsIgnoreCase("internet explorer"))
		{
			return driver;
		}
		
		else
		{
			return driver;
		}
		
				
	}

}