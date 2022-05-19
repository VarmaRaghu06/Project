package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7SearchVel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement Searchbx=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Searchbx.sendKeys("greens velmurugan");
		
		WebElement Searchbuton=driver.findElement(By.xpath("//input[@value='Google Search']"));
		Searchbuton.click();
		
		WebElement Firstlink=driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		Firstlink.click();
		
		
		
		

	}

}
