package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7Greenstech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement lnkCourse=driver.findElement(By.xpath("//div[text()='Courses ']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(lnkCourse).perform();
	WebElement orcCourse=driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
	actions.moveToElement(orcCourse).perform();
	

	

WebElement sql=driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
sql.click();

	}

	


}
