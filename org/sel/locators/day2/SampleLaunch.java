package org.sel.locators.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLaunch {
	public static void main(String[] args) {
		// configure browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe" );
		//System.setProperty(null, null);
		WebDriver dr =  new ChromeDriver();
		// launch url
		dr.get("https://www.google.com/");
		//fetch title
		 String ti = dr.getTitle();
		System.out.println(ti);
		//fetch current url
		String url = dr.getCurrentUrl();
		System.out.println(url);
	}

}
