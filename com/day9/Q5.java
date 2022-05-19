package com.day9;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {


	//private static String String text;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement crete = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	crete.click();
	
	Thread.sleep(3000);
	WebElement day = driver.findElement(By.id("day"));
	
	Select sel=new Select(day);
	
	List<WebElement> options = sel.getOptions();
	
	for (int i = 0; i <options.size(); i++)
	{
		if(i%2==1) {
	
		WebElement web = options.get(i);
		String text = web.getText();
		System.out.println(text);
		}
		
	}
	
	
	
	}
	
}
