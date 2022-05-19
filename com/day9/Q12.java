package com.day9;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12 {
	
		 
		 public static void main(String[] args) throws  InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/");
		WebElement frts = driver.findElement(By.id("fruits"));
		
		Select select = new Select(frts);
		List<WebElement> options = select.getOptions();
		
		
		
		
		
	for(int i=0;i<options.size();i++) {
		
		if(i%2==1) {
			WebElement webElement = options.get(i);
			//String text = webElement.getText();
			select.selectByIndex(i);
	
		//	System.out.println(text);
			
			for (int j = 0; j <options.size(); j++) {
				
				if((select.selectByIndex(i).equals(select.getAllSelectedOptions().{
					
				}
			}
			
		}
	}

}

}
