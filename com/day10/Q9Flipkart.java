package com.day10;

import java.time.Duration;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Q9Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement clz = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clz.click();
		
		  WebElement bx  = driver.findElement(By.name("q"));
		  bx.sendKeys("redmi",Keys.ENTER);
		  
		  WebElement clk = driver.findElement(By.xpath("//div[text()='REDMI Note 10T 5G (Metallic Blue, 64 GB)']"));
		  clk.click();
		  
			String prt = driver.getWindowHandle();
			System.out.println(prt);
			
			java.util.Set<String> allwin = driver.getWindowHandles();
			
			System.out.println(allwin);
			
			for (String string : allwin) {
				if(prt.equals(string)) {
					driver.switchTo().window(string);
				}
				
			}
		  
		  WebElement price = driver.findElement(By.xpath("//div[text()='₹12,999']"));
		  String k = price.getText();
		  System.out.println(k);
		  
		  
	
	}

}
