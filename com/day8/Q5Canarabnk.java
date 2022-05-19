package com.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5Canarabnk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		WebElement clkcont=driver.findElement(By.xpath(""));
		Thread.sleep(3000);

		clkcont.click();
		
		//WebElement =driver.findElement(By.xpath("//a[text()='CONTINUE']"));

		//switching to alert
		Alert alrt=driver.switchTo().alert();
		Thread.sleep(3000);
		alrt.accept();
	}

}
//rightcl not working