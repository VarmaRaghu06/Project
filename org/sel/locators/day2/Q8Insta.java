package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8Insta {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		Thread.sleep(3000);
	 WebElement	MobNo= driver.findElement(By.name("username"));
		
		 MobNo.sendKeys("greens1@yahoo.com");
		 
		
		 WebElement Pwd=driver.findElement(By.name("password"));
		 
		 Pwd.sendKeys("#greens653@");
	}

}