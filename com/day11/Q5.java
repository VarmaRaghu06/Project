package com.day11;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	
	WebElement tableD = driver.findElement(By.xpath("//table[@border='l']"));
	
	
	List<WebElement> allD = tableD.findElements(By.tagName("tr"));
	
	for (int i = 0; i <allD.size(); i++) {
		
		if(i%2==1) {
			
			WebElement ele = allD.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		
	}

}

}
