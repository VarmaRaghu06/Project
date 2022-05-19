package com.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2Toolsqa {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		
		
		Thread.sleep(2000);


		WebElement scroldown = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Object executeScript = js.executeScript("arguments[0].scrollIntoView(true)",scroldown);
		
		
		
	
	}

}
