package com.practice;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
		
		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tableData = driver.findElement(By.xpath("//table[@id='customers']"));
	List<WebElement> allRows = tableData.findElements(By.tagName("tr"));
		
		for (int i = 0; i <allRows.size(); i++) {
			WebElement row = allRows.get(i);
			//String text = row.getText();
			//System.out.println(text);
			List<WebElement> rowData=row.findElements(By.tagName("td"));
			for (int j = 0; j <rowData.size(); j++) {
				WebElement colomn = rowData.get(j);
				  String text = colomn.getText();
				  System.out.println(text);	
			}
		}System.out.println();
			
		
		
		
			
		}
		
		
	}


