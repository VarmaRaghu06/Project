package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4OmrAddr {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://greenstech.in/selenium-course-content.html#trainer");
	WebElement Adayaradd1=driver.findElement(By.xpath("//div[@class='col-md-3 "
			+ "short-desc-with-logo widget widget_text'][2]"));
	
	String text=Adayaradd1.getText();
		System.out.println(text);
//	WebElement Omradd1=driver.findElement(By.xpath("//span[contains(text(),'Plot No.19,')]"));
//	
//	String text=Omradd1.getText();
//	System.out.println(text);
//WebElement Omradd2=driver.findElement(By.xpath("//span[contains(text(),'Balamurugan Garden,')]"));
//	
//	String text1=Omradd2.getText();
//	System.out.println(text1);
//	
//WebElement Omradd3=driver.findElement(By.xpath("//span[contains(text(),'OMR Road,Kancheepuram District,')]"));
//	
//	String text3=Omradd3.getText();
//	System.out.println(text3);
//WebElement Omradd4=driver.findElement(By.xpath("//span[contains(text(),'Okkiam, Thoraipakkam,')]"));
//	
//	String text4=Omradd4.getText();
//	System.out.println(text4);
//WebElement Omradd5=driver.findElement(By.xpath("//span[contains(text(),'Jain college bus stop,')]"));
//	
//	String text5=Omradd5.getText();
//	System.out.println(text5);
//	
//	////a[contains(text(),' +91-9944152058')]
	

}
}