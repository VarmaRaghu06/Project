package com.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4Facebook {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				WebElement pwd = driver.findElement(By.id("pass"));
				WebElement email = driver.findElement(By.id("email"));

			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].setAttribute('value','varma')", email,pwd);
			js.executeScript("arguments[1].setAttribute('value','rrr')", pwd,email);

				
}

}
