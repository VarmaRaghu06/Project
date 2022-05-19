package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13Myntra {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");


		WebElement	 MobileNo= driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		
		 MobileNo.sendKeys("9655252267");
		 
		 WebElement	 Clk= driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		 Clk.click();
	}

}
