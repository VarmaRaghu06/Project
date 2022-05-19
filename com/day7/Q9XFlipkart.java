package com.day7;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q9XFlipkart {
public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement cloze=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cloze.click();
		WebElement mens =driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(mens).perform();
		WebElement tShirt=driver.findElement(By.xpath("//a[text()=\"Men's T-Shirts\"]"));
		action.moveToElement(tShirt).perform();
		tShirt.click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D://FlipTshirt.png");
		FileUtils.copyFile(src, dest);

		
		
		  
	

}
}
