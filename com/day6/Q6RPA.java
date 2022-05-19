package com.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6RPA {
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		Actions ac=new Actions(driver);
WebElement rightClk=driver.findElement(By.xpath("//a[text()='RPA']"));

		
		
		ac.contextClick(rightClk).perform();
		
		Robot robo=new Robot();
		
		for(int i=0;i<6;i++) {
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
}


}
