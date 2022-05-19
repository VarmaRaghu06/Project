package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFromFb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		//to maximize the window
		driver.manage().window().maximize();
//		WebElement txtFacebook=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		// To get Text from application
		WebElement txtFacebook=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		String text=txtFacebook.getText();
		System.out.println(text);
	}

}
