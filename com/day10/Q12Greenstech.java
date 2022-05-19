package com.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12Greenstech {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement seletest = driver.findElement(By.id("heading303"));

	seletest.click();
	
	WebElement dayten = driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']"));
	dayten.click();
	
	
	

}
}