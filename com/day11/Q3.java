package com.day11;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	
	WebElement tableD = driver.findElement(By.xpath("//table[@border='l']"));
	
	List<WebElement> noOfrows = tableD.findElements(By.tagName("tr"));
	
	
	int nu=noOfrows.size();	
	System.out.println(nu);
	
	}
	

}
