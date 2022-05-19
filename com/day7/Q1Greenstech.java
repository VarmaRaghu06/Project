package com.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1Greenstech {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
		//Type casting and taking screenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	//saving screenshor in desired location
	File scrnsht=ts.getScreenshotAs(OutputType.FILE);
	//path to location to save screnshot
	File f=new File("D:\\Q1Greenstech.png");
	FileUtils.copyFile(scrnsht, f);





}
}
