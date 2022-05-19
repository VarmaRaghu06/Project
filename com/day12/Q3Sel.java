package com.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3Sel {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://greenstech.in/selenium-course-content.html");


				
				WebElement scrld = driver.findElement(By.id("heading304"));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].scrollIntoView(true)", scrld);
}
}