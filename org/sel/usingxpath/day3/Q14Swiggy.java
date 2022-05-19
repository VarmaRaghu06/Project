package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q14Swiggy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement	 Clk= driver.findElement(By.xpath("//a[@class='r2iyh']"));
		 Clk.click();
		 
		 WebElement	 MobileNo= driver.findElement(By.xpath("//input[@type='tel']"));
			
		 MobileNo.sendKeys("9442746839");
		 WebElement	 Name= driver.findElement(By.xpath("//input[@name='name']"));
			
		 Name.sendKeys("Ravi");
		 WebElement	 Email= driver.findElement(By.xpath("//input[@name='email']"));
			
		 Email.sendKeys("rrrtheme@gmail.com");
		 WebElement	 Pwd= driver.findElement(By.xpath("//input[@name='password']"));
			
		 Pwd.sendKeys("#dream@");
		 
		 WebElement	 continu= driver.findElement(By.xpath("//a[@class='a-ayg']"));
		 continu.click();
		 
		 

	}

}
