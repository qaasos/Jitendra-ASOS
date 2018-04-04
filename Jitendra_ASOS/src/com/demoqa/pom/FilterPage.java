package com.demoqa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage {

	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public FilterPage(WebDriver driver){
		
		this.driver = driver;
	}
	public void ClickOnFilterColor(String JacketColor){
		
		
Select s1 = new Select(driver.findElement(By.name("filter_color")));
		
		s1.selectByVisibleText(JacketColor);
		WebDriverWait Wait = new WebDriverWait(driver,220);
		
		
		
	}

	public void SortByNewNess(String DefaultSorting){
		
		Select s2 = new Select(driver.findElement(By.className("orderby")));
		s2.selectByValue("date");
		
		
	}
	
	public void FILTERBYPRICE(){
		
		WebElement PriceBar = driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		Actions action1 = new Actions(driver);
		action1.clickAndHold(PriceBar).moveByOffset((int) -207, 0).release(PriceBar).build().perform();
		driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button")).click();
		
		
	}
	
	public void ClickOnMediumPriceJacket(){
		
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[2]/div/h3/a")).click();
		
	}
	
	
	
	
	
}
