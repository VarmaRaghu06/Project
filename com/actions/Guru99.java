package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		WebElement d=driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(s,d).perform();
		
		WebElement s1=driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement d1=driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		actions.dragAndDrop(s1,d1).perform();
		WebElement s2=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement d2=driver.findElement(By.xpath("//ol[@id='loan']"));
		
		actions.dragAndDrop(s2, d2).perform();	
		WebElement s3=driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement d3=driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		actions.dragAndDrop(s3, d3).perform();
		
		WebElement txt=driver.findElement(By.xpath("//a[@class='button button-green']"));
		
		String tx=txt.getText();
		System.out.println(tx);


	}

}
