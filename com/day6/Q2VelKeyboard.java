package com.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2VelKeyboard {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
	 WebElement	 SearchBx= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
	 SearchBx.sendKeys("VelMurugan");
		 Actions ac=new Actions(driver);
		 //to select a words from searchbox
		 ac.doubleClick(SearchBx).perform();
		 
		 
		 
		 
		 
		 Robot robo=new Robot();	
		
		 robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_X);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_X);
			
				 
	

}


}
