package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
	 WebElement	 Symbl= driver.findElement(By.xpath("//div[@id='signin-block']"));
		Symbl.click();
		WebElement	 Symbl2= driver.findElement(By.xpath("//div[@id='signin_dd']"));
		Symbl2.click();
		
		
		
			
		//WebElement	 Uname= driver.findElement(By.xpath("///ul[@class='config-list']"));
		 //Uname.click();
		 
		 
		
		// WebElement Pw=driver.findElement(By.xpath("//input[@name='pass']"));
		 
	 //Pw.sendKeys("#Brucelee");
	 
	 //WebElement bt=driver.findElement(By.xpath("//button[@type='submit']"));
	 //bt.click();
 
	


	}

}
