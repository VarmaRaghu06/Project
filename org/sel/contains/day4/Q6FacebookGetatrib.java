package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6FacebookGetatrib {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//find and verify the locator of the username field
		
	 WebElement	 Uname= driver.findElement(By.xpath("//input[@id='email']"));
		
		 Uname.sendKeys("rrr22@gmail.com");
		 
		 //find and verify the locator of the password field
		
		 WebElement Pw=driver.findElement(By.xpath("//input[@name='pass']"));
		 
	 Pw.sendKeys("#Brucelee");
	 
	String attrib1= Uname.getAttribute("value");
	System.out.println(attrib1);
	String attrib2= Pw.getAttribute("value");
	System.out.println(attrib2);
	


}


}
