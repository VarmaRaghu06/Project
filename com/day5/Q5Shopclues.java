package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q5Shopclues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Thread.sleep(2000);
		WebElement mouse=driver.findElement(By.xpath("//a[contains(text(),'Sports & More')]"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(mouse).perform();
		WebElement mobile=driver.findElement(By.xpath("//a[contains(text(),'Weight Gainers')]"));
		mobile.click();
		
		
		
		

}
}