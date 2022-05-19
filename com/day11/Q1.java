package com.day11;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	
	WebElement tableD = driver.findElement(By.xpath("//table[@border='l']"));
	
	List<WebElement> allrows = tableD.findElements(By.tagName("tr"));
	
	for (int i = 0; i < allrows.size(); i++) {
		
		WebElement row = allrows.get(i);
		String text = row.getText();
		System.out.println(text);
		
	}
	
//	String text = tableD.getText();
//	System.out.println(text);
	
	
	
	
	}
	
	

}
