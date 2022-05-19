package com.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3DemoAuto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement clkAlrtwithtxtbx=driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		//Thread.sleep(3000);

		clkAlrtwithtxtbx.click();
		WebElement clkPrmpt=driver.findElement(By.xpath("//button[contains(text(),' prompt ')]"));
		clkPrmpt.click();

			
			Alert alrt=driver.switchTo().alert();
		Thread.sleep(3000);
	alrt.sendKeys("Hi Ravi");
	Thread.sleep(3000);	
	alrt.accept();


}
}