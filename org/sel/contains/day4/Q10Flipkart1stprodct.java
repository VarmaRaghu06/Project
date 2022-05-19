package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10Flipkart1stprodct {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
close.click();
WebElement Searchbx=driver.findElement(By.xpath("//input[@class='_3704LK']"));
	Searchbx.sendKeys("Laptops");
		
		
		
WebElement Searchbuton=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	
		Searchbuton.click();
		
		Thread.sleep(3000);
WebElement SelctProduct=driver.findElement(By.xpath("//div[contains(text(),'14 "
		+ "Ryzen 3 Dual Core AMD Ryzen 3')]"));
		SelctProduct.click();
		

	}


}
