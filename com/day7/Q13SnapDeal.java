package com.day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.interactions.Actions;

public class Q13SnapDeal {
public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
WebElement srcBx =driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].setAttribute('value','Hplaptop')", srcBx);
srcBx.sendKeys("Hplaptop");

Robot robo=new Robot();


robo.keyPress(KeyEvent.VK_ENTER);
robo.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(3000);

TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);

File dest=new File("D:\\Snapdeal.png");
FileUtils.copyFile(src, dest);
		
}

}
