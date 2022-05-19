package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse"
				+ "\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.redbus.in");
		
		WebElement frm=driver.findElement(By.id("src"));
		
		frm.sendKeys("chennai");
		
		WebElement to=driver.findElement(By.id("dest"));
		
		to.sendKeys("Bangalore");
		
	}

}
