package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Sample2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", 
				 "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		 
		 WebDriver drive=new ChromeDriver();
		 
		 drive.get("https://www.facebook.com/");
		 // id="email"--> find and verify the locator of username field
		 
		WebElement txtUsername= drive.findElement(By.id("email"));
		
		//insert
		txtUsername.sendKeys("RRR");
		 
		 
	}

	
}