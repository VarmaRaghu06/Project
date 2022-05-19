package com.day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement clk = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		
//		Actions action=new Actions(driver);
//		
//		action.moveToElement(clk).perform();
		clk.click();
		
		driver.switchTo().alert().accept();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File f=new File("D://AutomationAlert.jpg");
		FileUtils.copyFile(screenshotAs, f);
		
		
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
//Thread.sleep(2000);
		
		
		
	}

}
