package com.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTask {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotas=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotas);
		
		File file=new File("D:\\Selenium.png");
		FileUtils.copyFile(screenshotas, file);
		
	}

}
