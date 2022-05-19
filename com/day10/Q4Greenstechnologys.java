package com.day10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4Greenstechnologys {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://www.greenstechnologys.com/python-training.html");
	
	driver.manage().window().maximize();
	
//	Thread.sleep(10000);
//	WebElement clz = driver.findElement(By.xpath("//span[@aria-hidden='true']"));
//	clz.click();
	
	WebElement sele = driver.findElement(By.xpath("h3[text()='Python-Solutions-Architect-Training']"));
	sele.click();
	
	WebElement dayten = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
	dayten.click();
	
	WebElement win = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
	win.click();
	
	
	String part = driver.getWindowHandle();
	System.out.println(part);
	
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	for (String string : all) {
		if(!(part.equals(string))) {
			driver.switchTo().window(string);
			
		}
		
		//Windows Handling

		
		
	}
	
	}
	

}
