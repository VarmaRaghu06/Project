package com.day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2ToolsQa {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://toolsqa.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement scrldwn = driver.findElement(By.xpath("//a[text()='Katalon'][1]"));
		WebElement scrlup = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", scrldwn);
		Thread.sleep(1000);
		
	js.executeScript("arguments[0].scrollIntoView(false)", scrlup);
		
		
	}

}
