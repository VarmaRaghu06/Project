package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8AdactinHotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		//find and verify the locator of the username field
		
	 WebElement	 Uname= driver.findElement(By.xpath("//input[@type='text']"));
		
		 Uname.sendKeys("Varma");
		 
		 //find and verify the locator of the password field
		
		 WebElement Pw=driver.findElement(By.xpath("//input[@type='password']"));
		 
	 Pw.sendKeys("#Brucelee");
	 
	String attrib1= Uname.getAttribute("value");
	System.out.println(attrib1);
	String attrib2= Pw.getAttribute("value");
	System.out.println(attrib2);
	

	}

}
