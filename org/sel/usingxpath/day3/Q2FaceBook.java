package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2FaceBook {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//find and verify the locator of the username field
		
	 WebElement	 Uname= driver.findElement(By.xpath("//input[@id='email']"));
		
		 Uname.sendKeys("rrr22@gmail.com");
		 
		 //find and verify the locator of the password field
		
		 WebElement Pw=driver.findElement(By.xpath("//input[@name='pass']"));
		 
	 Pw.sendKeys("#Brucelee");
	 
	 WebElement bt=driver.findElement(By.xpath("//button[@type='submit']"));
	 bt.click();
 
	


	}

}
