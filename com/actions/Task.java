package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement lnkCourse=driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(lnkCourse).perform();
	
	//WebElement lnkBigData=driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
	//lnkBigData.click();
	
	WebElement lnkOracle=driver.findElement(By.xpath("//span[text()='Oracle Training']"));
actions.moveToElement(lnkOracle).perform();
	}

	
	}


