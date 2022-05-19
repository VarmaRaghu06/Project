package com.greater;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");
		WebElement clkLogin = driver.findElement(By.id("wp-submit"));
		clkLogin.click();
		WebElement ratings = driver.findElement
	(By.xpath("//a[text()='Web Editor']//parent::td//following-sibling::td[3]//following-sibling::span[4]"));
		Thread.sleep(3000);	
		ratings.click();
		
		

	}

}
