package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2Redbus {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse"
				+ "\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.redbus.in");
	//	Thread.sleep(3000);
		driver.manage().window().maximize();
		//WebElement Signin=driver.findElement(By.xpath("//div[@id='signin-block']"));
			//Signin.click();
			
		WebElement From=driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		From.sendKeys("Chennai");
		WebElement To=driver.findElement(By.xpath("//input[@id='dest']"));
		To.sendKeys("Bangalore");
		
		
	}

}
