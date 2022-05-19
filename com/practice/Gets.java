package com.practice;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gets {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://output.jsbin.com/osebed/2");
	
	WebElement dropdown = driver.findElement(By.id("fruits"));
	Select select = new Select(dropdown);
	System.out.println(select.isMultiple());
	
	//getoptions
	List<WebElement> options = select.getOptions();//taking what are the options present in the dropdown
	
	
	
	for(int i=0;i<options.size();i++) {
		
		WebElement ele = options.get(i);//getting the values by index
		 
		String text = ele.getText();
		
		select.selectByVisibleText(text);
		
	
	}
	
	WebElement firstSelectedOption = select.getFirstSelectedOption();
	
	System.out.println(firstSelectedOption.getText());	
	
	
	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	
	for(int i=0;i<allSelectedOptions.size();i++) {
		
		WebElement webElement = allSelectedOptions.get(i);
		
		System.out.println(webElement.getText());
	}
	
	select.deselectByIndex(2);
//	Thread.sleep(3000);
//	
//	select.deselectAll();
	}
	
	
	

}
