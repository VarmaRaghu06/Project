package com.day10;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11Flipkart {
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
WebElement clz = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
clz.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	search.sendKeys("hp laptop",Keys.ENTER);
	
	WebElement clklap = driver.findElement(By.xpath("//div[text()='HP Ryzen 3 Dual Core 3250U - (8 GB/256 GB SSD/Windows 10 Home) 15s-GY0501AU Thin and Light Laptop']"));
	clklap.click();
	
	
//	String prt = driver.getWindowHandle();
//	System.out.println(prt);
//	
//	Set<String> allwin = driver.getWindowHandles();
//	System.out.println(allwin);
	WebElement txt = driver.findElement(By.xpath("//div[text()='₹35,990']"));
	String text = txt.getText();
	System.out.println(text);
	
	
	
}
}
