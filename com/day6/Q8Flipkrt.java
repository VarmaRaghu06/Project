package com.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q8Flipkrt {

public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		 Thread.sleep(2000);

		
		WebElement cloze=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cloze.click();
		
	 WebElement	 clk= driver.findElement(By.xpath("//a[text()='Login']"));
	 clk.click();
	 Thread.sleep(1000);
	 WebElement	 Uname= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));

		 Uname.sendKeys("varma");
		 Actions ac=new Actions(driver);
		 
		 ac.doubleClick(Uname).perform();
		 
		 
		 
		 
		 Robot robo=new Robot();	
	//	 WebElement	 Uname1= driver.findElement(By.id("email"));
		 robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_C);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_C);
			
			 WebElement	 passwrd= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
			ac.click(passwrd).perform();
			 robo.keyPress(KeyEvent.VK_CONTROL);
				robo.keyPress(KeyEvent.VK_V);
				robo.keyRelease(KeyEvent.VK_CONTROL);
				robo.keyRelease(KeyEvent.VK_V);

		 
	
}


}
