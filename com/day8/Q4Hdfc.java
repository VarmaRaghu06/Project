package com.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4Hdfc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		
		driver.switchTo().frame(0);
		WebElement clkcont=driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]"));
		Thread.sleep(3000);

		clkcont.click();
		
		//WebElement =driver.findElement(By.xpath("//a[text()='CONTINUE']"));

		//switching to alert
		Alert alrt=driver.switchTo().alert();
		Thread.sleep(3000);
		alrt.accept();
		

	
	}
	

}
