package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicibank{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse"
				+ "\\SD-1\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement UserId= driver.findElement(By.name("q"));
		
		UserId.sendKeys("Rv125");
		
	}
	

}