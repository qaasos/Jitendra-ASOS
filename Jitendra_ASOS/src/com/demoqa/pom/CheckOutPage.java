package com.demoqa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CheckOutPage {
		
		public WebDriver driver;
		public WebDriverWait Wait;
		
		public CheckOutPage(WebDriver driver){
			
			this.driver= driver;
	        Wait = new WebDriverWait(this.driver, 180);   
			
		}
		
		public void EnterDetailsOnCheckOutPage() throws InterruptedException{
			
			driver.findElement(By.id("billing_first_name")).sendKeys("Anant");
			driver.findElement(By.id("billing_last_name")).sendKeys("Wankhade");
			driver.findElement(By.id("billing_company")).sendKeys("Cognizant");
			driver.findElement(By.id("billing_email")).sendKeys("ananta.mw@gmail.com");
			driver.findElement(By.id("billing_phone")).sendKeys("9860017702");
			driver.findElement(By.id("select2-chosen-1")).click();
			driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[103]/div")).click();
					
				
			driver.findElement(By.id("billing_address_1")).sendKeys("Dhanori road");
			driver.findElement(By.id("billing_address_2")).sendKeys("Kukreja heritage");
			driver.findElement(By.id("billing_city")).sendKeys("Pune");
			
			driver.findElement(By.id("select2-chosen-2")).click();
			driver.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]/div")).click(); 
			
			driver.findElement(By.id("billing_postcode")).sendKeys("411015");
			driver.findElement(By.id("ship-to-different-address-checkbox")).click();
			
			driver.findElement(By.xpath("//*[@id='order_comments']")).sendKeys("Please send order");
			
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)");
			
		//	Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='payment_method_cod']")));
			
			Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='payment_method_cod']")));
			
			driver.findElement(By.xpath("//input[@id='payment_method_cod']")).click();
			driver.findElement(By.xpath("//input[@id='terms']")).click();
			driver.findElement(By.id("place_order")).click();
			
		}

	}
	


