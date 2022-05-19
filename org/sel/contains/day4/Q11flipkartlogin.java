package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11flipkartlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// WebElement	 Clklogin= driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		// Clklogin.click();
		 Thread.sleep(3000);
		 WebElement	 Uname1= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			
		 Uname1.sendKeys("rrr225@gmail.com");
		 WebElement	 Pwd1= driver.findElement(By.xpath("//input[@type='password']"));
			
		 Pwd1.sendKeys("#warriors");
		 
		// String text=Uname1.getAttribute("value");
		// System.out.println(text);
		// String text1 =Pwd1.getAttribute("value");
	//	 System.out.println(text1);

	}

}

//
