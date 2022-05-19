package com.day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7Hdfc {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 
		 driver.manage().window().maximize();
		 
		 List<WebElement> frameCount = driver.findElements(By.tagName("frame"));
		 
		 int size = frameCount.size();
		 System.out.println(size);
		 
		 
		 driver.switchTo().frame(0);
		 
		 WebElement txtUser = driver.findElement(By.name("fldLoginUserId"));
		txtUser.sendKeys("HDFC");
		
		WebElement clk = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		clk.click();
		 WebElement pwd = driver.findElement(By.id("fldPasswordDispId"));
		 pwd.sendKeys("pass");

		
	}

}
