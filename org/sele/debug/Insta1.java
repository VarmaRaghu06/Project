package org.sele.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement Uname=driver.findElement(By.name("username"));
		Uname.sendKeys("Ravivarma");
		
		WebElement Pwd=driver.findElement(By.xpath("//input[@aria-label='Password']"));
		Pwd.sendKeys("Xt1068");
		
		String txt1=Uname.getAttribute("value");
		System.out.println(txt1);
		String txt2=Pwd.getAttribute("value");
		System.out.println(txt2);
	}

}
