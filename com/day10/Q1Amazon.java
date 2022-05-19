package com.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1Amazon {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.com/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone x",Keys.ENTER);
		Actions actions = new Actions(driver);
WebElement rclik = driver.findElement(By.xpath("//span[text()='Apple Simple Mobile Prepaid - Apple iPhone X (64GB) - Silver']"));
actions.contextClick(rclik).perform();

Robot robo=new Robot();

for (int i = 0; i < 2; i++) {
	

robo.keyPress(KeyEvent.VK_DOWN);
robo.keyRelease(KeyEvent.VK_DOWN);
}
robo.keyPress(KeyEvent.VK_ENTER);
robo.keyPress(KeyEvent.VK_ENTER);


String parentWin = driver.getWindowHandle();
System.out.println(parentWin);
Set<String> allWin = driver.getWindowHandles();
System.out.println(allWin);
for (String string : allWin) 
{
	
	if(!(parentWin.equals(string))) {
		driver.switchTo().window(string);
		
		
	}
	
}
//WebElement unAvai =driver.findElement(By.xpath("//span[text()='Currently unavailable.']"));
WebElement unAvai = driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
String text = unAvai.getText();
System.out.println(text);

	
	}

}
