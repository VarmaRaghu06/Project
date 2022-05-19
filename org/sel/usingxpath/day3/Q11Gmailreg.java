package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11Gmailreg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/"
				+ "signup/v2/webcreateaccount?hl="
				+ "en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement	 FN= driver.findElement(By.xpath("//input[@jsname='YPqjbf']"));
		
		 FN.sendKeys("Ravi");
		 WebElement	 LN= driver.findElement(By.xpath("//input[@id='lastName']"));
			
		 LN.sendKeys("R R");
		 
		 WebElement	 Gmailid= driver.findElement(By.xpath("//input[@type='email']"));
			
		 Gmailid.sendKeys("ravicaptainrock1");
		 WebElement	 pwd= driver.findElement(By.xpath("//input[@name='Passwd']"));
			
		 pwd.sendKeys("@Raviwell@");
		 WebElement	 cpwd= driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
			
		 cpwd.sendKeys("@Raviwell@");
		 
		 WebElement	 Showpwd= driver.findElement(By.xpath("//input[@id='i3']"));
		 Showpwd.click();
		 
		 WebElement	 next= driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
		 next.click();
		 
		 
		 
		 
		

	}

}
