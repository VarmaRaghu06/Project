package com.day10;

import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.time.Duration;

import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2Snapdeal {



public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement searchBx = driver.findElement(By.id("inputValEnter"));
		searchBx.sendKeys("iphones 7");
		
		driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement rclik = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Plus Flip Mobile Cover by NBOX - Brown']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rclik).perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String prt = driver.getWindowHandle();
		System.out.println(prt);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		for (String string : all) {
			
			if(!(all.equals(string))) {
				driver.switchTo().window(string);	
			}
			
		}
		WebElement add = driver.findElement(By.id("add-cart-button-id"));
		add.click();
		
		
		
		
}
}
