package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintFve {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Eclipse\\SD-1\\"
					+ "Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.Sprint.com/");
			
			Thread.sleep(5000);
			
			WebElement cls1=driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
			cls1.click();
			
			WebElement accept=driver.findElement(By.xpath("//button[@class='phx-button phx-button--primary']"));
			accept.click();
		
			WebElement fiveg=driver.findElement(By.xpath("//a[@href='/cell-phones?INTNAV=tNav%3ADevices']"));
			Actions actions=new Actions(driver);
			actions.moveToElement(fiveg).perform();
			
			WebElement Phones=driver.findElement(By.xpath("//a[@href='/devices/5g-phones?INTNAV=tNav%3ADevices%3A5GPhones']"));
			Phones.click();
			Thread.sleep(5000);
			WebElement txt=driver.findElement(By.id("digital-footer-bottom-link-bottom-9"));
			
			String tx=txt.getText();
			System.out.println(tx);
		
			
		
		
		
		
		
		
		//id("digital-footer-bottom-link-bottom-9")

	}

}
