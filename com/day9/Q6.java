package com.day9;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6 {


	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	
	WebElement sel = driver.findElement(By.name("country"));
	
	Select s=new Select(sel);
	
	List<WebElement> options = s.getOptions();
	
	for (int i = 0; i < options.size(); i++) {
		
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
		
	}

	
	

	}
	
}
