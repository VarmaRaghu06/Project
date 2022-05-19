package com.day9;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/automation-practice-form/");
	
	WebElement drop = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']"));
	
	Select select=new Select(drop);
	List<WebElement> options = select.getOptions();
	
	for(int i=0;i<options.size();i++) {
		
		WebElement ele = options.get(i);
		
		String text = ele.getText();
		
		System.out.println(text);
		
		
	}
	
	
	
	
	
	
	}
}
