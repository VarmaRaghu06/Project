package com.day6;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1Facebook {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//find and verify the locator of the username field
		
	 WebElement	 Uname= driver.findElement(By.id("email"));
		
		 Uname.sendKeys("email");
		 Actions ac=new Actions(driver);
		 
		 ac.doubleClick(Uname).perform();
		 
		 
		 
		 
		 Robot robo=new Robot();	
		 WebElement	 Uname1= driver.findElement(By.id("email"));
		 robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_X);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_X);
			
			 WebElement	 passwrd= driver.findElement(By.id("pass"));
			ac.click(passwrd).perform();
			 robo.keyPress(KeyEvent.VK_CONTROL);
				robo.keyPress(KeyEvent.VK_V);
				robo.keyRelease(KeyEvent.VK_CONTROL);
				robo.keyRelease(KeyEvent.VK_V);

		 
	
}

}
