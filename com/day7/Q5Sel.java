package com.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5Sel {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		
		Thread.sleep(2000);


		WebElement scroldown = driver.findElement(By.id("heading2011"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scroldown);
		
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File file=new File("D:\\SelpJobopenings.png");
		FileUtils.copyFile(src, file);
		
		WebElement scrolup = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));

		js.executeScript("arguments[0].scrollIntoView(false)", scrolup);

		
		
		
		

}
}