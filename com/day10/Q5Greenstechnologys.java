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

public class Q5Greenstechnologys {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement searchBx = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions action=new Actions(driver);
	
	action.moveToElement(searchBx).perform();
	
	WebElement py = driver.findElement(By.xpath("//span[text()='Python']"));
	py.click();
	
	
	String prt = driver.getWindowHandle();
	System.out.println(prt);
	
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	for (String string : all) {
		if(!(all.equals(string))) {
			driver.switchTo().window(string);
			
		}
		
	}
	WebElement curri = driver.findElement(By.xpath("//button[text()='Explore Curriculum']"));
	action.contextClick(curri).perform();
	
	Robot robo=new Robot();
robo.keyPress(KeyEvent.VK_DOWN);
robo.keyRelease(KeyEvent.VK_DOWN);
robo.keyPress(KeyEvent.VK_DOWN);
robo.keyRelease(KeyEvent.VK_DOWN);

robo.keyPress(KeyEvent.VK_ENTER);
robo.keyRelease(KeyEvent.VK_ENTER);


//robo.keyPress(KeyEvent.VK_LEFT);
//robo.keyRelease(KeyEvent.VK_LEFT);
//robo.keyPress(KeyEvent.VK_ENTER);
//robo.keyRelease(KeyEvent.VK_ENTER);


	
	
		
	}
	
	
	}

