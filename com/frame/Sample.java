package com.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().window().maximize();
		
		//to find total number of frames
		
List<WebElement> frameCount = driver.findElements(By.tagName("frame"));	

int size2 = frameCount.size();
System.out.println(size2);

//switch to frame by using index number

//	WebDriver frame = driver.switchTo().frame(0);
//	
//	WebElement txtUser = driver.findElement(By.name("fldLoginUserId"));
//	txtUser.sendKeys("Ramesh");
	//string
//driver.switchTo().frame("login_page");
//
//WebElement txtUser = driver.findElement(By.name("fldLoginUserId"));
//txtUser.sendKeys("Ramesh");

WebElement findElement = driver.findElement(By.name("login_page"));
//windows switch to frame

driver.switchTo().frame(findElement);

WebElement txtUser = driver.findElement(By.name("fldLoginUserId"));
txtUser.sendKeys("Ramesh");







	
	
	}

}
