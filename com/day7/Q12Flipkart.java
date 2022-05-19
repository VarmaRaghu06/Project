package com.day7;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12Flipkart {
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


}
