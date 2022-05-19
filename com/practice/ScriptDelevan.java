package com.practice;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptDelevan {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement txtUserName=driver.findElement(By.id("email"));
		
		WebElement pwd=driver.findElement(By.id("pass"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//setting the values
		js.executeScript("arguments[1].setAttribute('value','amazon forest')", txtUserName,pwd);
		//getting the values
		Object executeScript = js.executeScript("return arguments[1].getAttribute('value')", txtUserName,pwd);
		
		js.executeScript("arguments[0].click()",txtUserName);
		String s=(String)executeScript;
		System.out.println(s);
		
		
}

}
