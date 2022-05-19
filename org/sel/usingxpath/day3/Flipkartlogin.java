package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartlogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
 
WebElement	 Clklogin= driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		 Clklogin.click();
WebElement	 Uname= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			
		 Uname.sendKeys("rrr225@gmail.com");
 WebElement	 Pwd= driver.findElement(By.xpath("//input[@type='password']"));
			
		 Pwd.sendKeys("#warriors");
		 
		 String s=Uname.getAttribute("value");
				 System.out.println(s);
				 String s1=Pwd.getAttribute("value");
				 System.out.println(s1);
				 
	}

}
