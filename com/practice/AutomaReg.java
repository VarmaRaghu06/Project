package com.practice;

import java.awt.AWTException;
//import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class AutomaReg {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
WebElement Lang=driver.findElement(By.xpath("//div[@id='msdd']"));
	//click function for language selection
	Lang.click();
	//Actions action=new Actions(driver);
	WebElement select=driver.findElement(By.xpath("//a[contains(text(),'English')]"));
	select.click();
	
	WebElement clkSkills=driver.findElement(By.xpath("//select[@id='Skills']"));
	
	clkSkills.click();
	
	Robot robot =new Robot();
	for(int i=0;i<27;i++) {
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	}
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
WebElement SelectCuntry=driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']"));
	
	SelectCuntry.click();
	for(int i=0;i<5;i++) {
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}



		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	//action.moveToElement(select).perform();
	}

}

