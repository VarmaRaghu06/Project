package com.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		WebElement clz = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clz.click();
		WebElement src = driver.findElement(By.name("q"));
		src.sendKeys("mask",Keys.ENTER);
		
		
		WebElement msk = driver.findElement(By.xpath("//a[text()='BILDOS 3 Layer Pure Cotton Cloth Mask with Adjustable E...']"));
		msk.click();
		
		WebElement pin = driver.findElement(By.xpath("//input[@class='_36yFo0']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value',635851')", pin);
		
		//pin.sendKeys("635851");
	}

}
