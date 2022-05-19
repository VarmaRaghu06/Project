package com.day9;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3 {


	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement cretNew = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	cretNew.click();
	
	Thread.sleep(3000);
	WebElement dropy = driver.findElement(By.id("year"));
	
	Select select=new Select(dropy);
	
	List<WebElement> option = select.getOptions();
	
	for(int i=0;i<option.size();i++) {
		
		WebElement web = option.get(i);
		String text = web.getAttribute("value");
		System.out.println(text);
		
	}
	
	
	}
}


