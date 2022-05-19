package org.sel.locators.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com//");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
