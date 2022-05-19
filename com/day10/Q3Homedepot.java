package com.day10;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3Homedepot {
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.homedepot.com/");
		
		driver.manage().window().maximize();
		By id = By.id("headerSearch");
		
		driver.findElement(id).sendKeys("Ceiling fan",Keys.ENTER);
		
		WebElement firstfan = driver.findElement(By.xpath("//a[text()='Indoor Ceiling Fans']"));
		firstfan.click();
		
		WebElement fanwithremot = driver.findElement(By.xpath("//img[@src='https://images.thdstatic.com/productImages/36af06c5-4f24-4d84-a9bf-3124220fad8f/svn/matte-black-hampton-bay-ceiling-fans-with-lights-99919-e4_400.jpg']"));
		fanwithremot.click();
		
		

}


	

}
