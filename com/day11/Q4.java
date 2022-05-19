package com.day11;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/write-xpath-table.html");
	
	WebElement tableD = driver.findElement(By.xpath("//table[@border='l']"));
	
	List<WebElement> l = tableD.findElements(By.tagName("tr"));
	
//	 int a[][]=int new[2]2];
	for (int i = 0; i <l.size(); i++) {
		
		WebElement row = l.get(i);
		
		List<WebElement> rowD = row.findElements(By.tagName("td"));
		
		for (int j = 0; j <rowD.size(); j++) {
			
			
			WebElement col = rowD.get(j);
			String text = col.getText();
			if(text.equals("fourth cell")) {
			System.out.println(text);
			}
		}
		
	}
	
	

}
}