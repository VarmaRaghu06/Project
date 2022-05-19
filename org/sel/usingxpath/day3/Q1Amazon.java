package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		 WebElement	 SearchBx= driver.findElement(By.xpath("//input[@name='q']"));
		//driver.get("https://www.amazon.in");
		 SearchBx.sendKeys("amazon");
		 
		 WebElement	 SearchBtn= driver.findElement(By.xpath("//input[@class='gNO89b'][1]"));
		 SearchBtn.click();
		 
		 WebElement	 Cliklink= driver.findElement(By.xpath("//cite[@role='text']"));
		 Cliklink.click();
		 
		 
 WebElement	 SearchBx1= driver.findElement(By.xpath("//input[@dir='auto']"));
		
		 SearchBx1.sendKeys("Iphone ");
		 
	 
	 WebElement book=driver.findElement(By.xpath("//input[@type='submit']"));
	 book.click();

	}

}
