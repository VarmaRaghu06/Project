package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5AboutGreens {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement AbtGreens=driver.findElement(By.xpath("//p[@style="
			+ "'text-align:"
			+ "justify; font-size:18px;'][1]"));
	
	String text=AbtGreens.getText();
	System.out.println(text);

}
}
