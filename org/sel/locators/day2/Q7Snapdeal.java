package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7Snapdeal {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse"
				+ "\\SD-1\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
	WebElement logId= driver.findElement(By.name("username"));
		
		logId.sendKeys("Elonmusk");
}
}
