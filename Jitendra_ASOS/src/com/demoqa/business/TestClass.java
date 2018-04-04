package com.demoqa.business;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Jitendra\\Jitendra_ASOS\\drivers\\chromedriver.exe");
		driver =  new ChromeDriver();
		
		driver.get("www.google.com");
		
		
	}

}
