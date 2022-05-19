package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2GreensTekVelsir {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://greenstech.in/selenium-course-content.html");//#trainer
		
		WebElement Select=driver.findElement(By.xpath("//a[@id='home-tab']"));
		Select.click();
		WebElement AboutVel=driver.findElement(By.xpath("//p[contains(text(),'currently focuses')]"));
		String text=AboutVel.getText();
		System.out.println(text);
		//WebElement AboutVel1=driver.findElement(By.xpath("//p[contains(text(),'12+ years')]"));
	//String text1=AboutVel1.getText();
//		System.out.println(text1);
		//WebElement AboutVel=driver.findElement(By.xpath("//div[@class='col-lg-7']"));
		
		
		


	}

}


