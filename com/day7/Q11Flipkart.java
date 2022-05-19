package com.day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11Flipkart {
	//private static ChromeDriver ;

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement cloze=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cloze.click();
		
		  
		  WebElement srcBx = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		  
		  
		 // JavascriptExecutor js=(JavascriptExecutor)driver;
		  srcBx.click();
		  //js.executeScript("arguments[0].setAttribute('value','iphone')", srcBx);
		  srcBx.sendKeys("iphone");
		  
			Robot robo=new Robot();

		  
		  robo.keyPress(KeyEvent.VK_ENTER);
		  robo.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);//because it takes screenshot of previous webpage all of a sudden
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File sS=ts.getScreenshotAs(OutputType.FILE);
		  
		  File f=new File("D:\\day22.png");
		  
		  FileUtils.copyFile(sS, f);
		  
		  
		  
	}

}
