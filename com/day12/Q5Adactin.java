package com.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5Adactin {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://adactinhotelapp.com/");
				
				WebElement usn = driver.findElement(By.id("username"));
				
				
				WebElement pwd = driver.findElement(By.id("password"));
				
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
			js.executeScript("arguments[0].setAttribute('value','varma')", usn);
			
			js.executeScript("arguments[0].setAttribute('value','varma')", pwd);

				
				
}



}
