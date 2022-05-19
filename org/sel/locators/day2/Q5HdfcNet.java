package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5HdfcNet {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://netbanking.hdfcbank.com/");
		//Thread.sleep(3000);
	WebElement custId= driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	//input[@type='text']
	
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','emailid')", custId);
		//custId.sendKeys("546321");
		

}
}
