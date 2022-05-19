package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3Flipkart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement w=driver.findElement(By.xpath("//img[@alt='Home']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(w).perform();
		
		WebElement bl=driver.findElement(By.xpath("//a[contains(text(),'Blankets')]"));
		ac.moveToElement(bl).perform();
		
		String s =bl.getText();
		System.out.println(s);
		
	}

	

}
