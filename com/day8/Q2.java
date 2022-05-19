package com.day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(2000);
		
		WebElement clk = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		clk.click();
		
		
		
		WebElement clk2=driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		clk2.click();
		
		
		Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	
		alert.dismiss();
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File f1=new File("D:\\day.png");
		FileUtils.copyFile(f, f1);
	}

}
