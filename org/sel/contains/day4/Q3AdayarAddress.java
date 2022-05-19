package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3AdayarAddress {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html#trainer");
		WebElement Adayaradd1=driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text'][1]"));
		
	String text=Adayaradd1.getText();
		System.out.println(text);
		
		
//		WebElement Adayaradd1=driver.findElement(By.xpath("//span[contains(text(),'No:11,')]"));
//		
//		String text=Adayaradd1.getText();
//		System.out.println(text);
//WebElement Adayaradd2=driver.findElement(By.xpath("//span[contains(text(),'First Street,')]"));
//		
//		String text1=Adayaradd2.getText();
//		System.out.println(text1);
//		
////WebElement Adayaradd3=driver.findElement(By.xpath("//span[contains(text(),'pamanabha Nagar,')]"));
//		
//	//	String text3=Adayaradd3.getText();
//		//System.out.println(text3);
//WebElement Adayaradd4=driver.findElement(By.xpath("//span[contains(text(),'Adyar,')]"));
//		
//		String text4=Adayaradd4.getText();
//		System.out.println(text4);
//WebElement Adayaradd5=driver.findElement(By.xpath("//span[contains(text(),'Chennai-600 020.')]"));
//		
//		String text5=Adayaradd5.getText();
//		System.out.println(text5);
//		
		
		
		
	}

}
