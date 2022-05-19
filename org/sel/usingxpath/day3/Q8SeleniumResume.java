package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8SeleniumResume {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		
		 
		 
		 WebElement	 Mdelres= driver.findElement(By.xpath("//div[@id='heading201']"));
		 Mdelres.click();
		 
	 WebElement	 res1= driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/"
	 		+ "Fresher_Selenium_Resume.pdf']"));
		 res1.click();
	}

}
