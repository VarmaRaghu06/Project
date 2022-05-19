package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12Shopclues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement Searchbx=driver.findElement(By.xpath("//input[@placeholder='What is "
				+ "on your mind today?']"));
		Searchbx.sendKeys("Sunglass");
		
		WebElement Searchbuton=driver.findElement(By.xpath("//a[@class='srch_action "
				+ "btn orange']"));
		Searchbuton.click();
		
		WebElement SelctProduct=driver.findElement(By.xpath("//img[@id='det_"
				+ "img_139846391']"));
		SelctProduct.click();
		

	}

}
