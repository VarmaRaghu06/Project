package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alchemy {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver"
				+ "\\chromedriver.exe");
		
		//to launch a new chromebrowser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement Gsearch= driver.findElement(By.xpath("//input[@title='Search']"));
		Gsearch.sendKeys("GreensTechnology");
	}

}
