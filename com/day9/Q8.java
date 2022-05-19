package com.day9;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8 {
	

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	WebElement un = driver.findElement(By.id("username"));
	un.sendKeys("Ravivarma124");
	
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("#Xt1068");
	
	WebElement clklog = driver.findElement(By.id("login"));
	clklog.click();
	
	WebElement loc = driver.findElement(By.id("location"));
	
	WebElement hotels = driver.findElement(By.id("hotels"));
	
	WebElement room = driver.findElement(By.id("room_type"));
	
	WebElement noRoom = driver.findElement(By.id("room_nos"));
	
	
	driver.findElement(By.id("datepick_in"));
	
	}
	


}
