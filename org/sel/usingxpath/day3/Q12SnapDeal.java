package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q12SnapDeal {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	
	WebElement	 Signin= driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(Signin).perform();
	 
	 WebElement	 Register= driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	 Register.click();
	 
	 WebElement	 Mobno= driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		
	 Mobno.sendKeys("9765432650");
	 
	 WebElement	 continu= driver.findElement(By.xpath("//button[@id='checkUser']"));
	 continu.click();
}
}
//partial output