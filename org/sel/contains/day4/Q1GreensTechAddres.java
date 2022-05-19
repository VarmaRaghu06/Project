package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1GreensTechAddres {

	public static void main(String[] args) {
	//	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Eclipse\\SD-1\\"
					+ "Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/");
			WebElement txtFacebook=driver.findElement(By.xpath("//u[contains(text(),"
					+ "'Centers ')]"));
			
			String text=txtFacebook.getText();
			System.out.println(text);

	}

}
