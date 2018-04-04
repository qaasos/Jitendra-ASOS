package com.demoqa.business;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.demoqa.pom.CheckOutPage;
import com.demoqa.pom.FilterPage;
import com.demoqa.pom.HomePage;
import com.demoqa.pom.JacketDetails;
import com.demoqa.utils.ConfigUtils;
import com.demoqa.utils.DriverUtils;

public class TestCase1 {

	
public static void main(String[] args) throws Exception  {
		
		WebDriver driver = null;
		Properties Po= new Properties();
		
		DriverUtils DU = new  DriverUtils();
		ConfigUtils Config =  new ConfigUtils();
		
		Po = Config.getConfig();
		
		driver = DU.getDriver(Po.getProperty("Browser"));
		
		HomePage HP = new HomePage(driver);
	//	FilterPage FA =new FilterPage(driver);
	//	JacketDetails JD= new JacketDetails(driver);
	//	CheckOutPage CP = new CheckOutPage(driver);
				
		
		HP.goToHomePageURL(Po.getProperty("URL"));
		HP.HoverOnWomenAndClickOnJacket();
		
	/*	FA.ClickOnFilterColor(Po.getProperty("JacketColor"));
		FA.SortByNewNess("date");
		
		FA.FILTERBYPRICE();
		FA.ClickOnMediumPriceJacket();
		JD.ClickonAddTocart();
		JD.ClickOnViewCart();
		JD.ClickOnProceedToCheckOut();
		CP.EnterDetailsOnCheckOutPage();
		
		*/
	
	}

} 
