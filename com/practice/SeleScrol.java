package com.practice;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleScrol {

	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement scrollDown = driver.findElement(By.xpath("//h3[@id='heading887']"));
		WebElement scrollUp = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Thread.sleep(2000);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)",scrollUp);

}

}
