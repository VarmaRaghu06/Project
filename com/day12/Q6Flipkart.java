package com.day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6Flipkart {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.flipkart.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//				WebElement clz = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//				clz.click();
//				
//	
//				WebElement clk = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//
//				clk.click();
				
				WebElement un = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
				WebElement pwd = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));


				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].setAttribute('value','Ravi')",un);

				js.executeScript("arguments[0].setAttribute('value','Varma')",pwd);
				
				
				Object es = js.executeScript("return arguments[0].getAttribute('value')", un);

				
				String text = (String)es;
				System.out.println(text);
				
				Object  es1 = js.executeScript("return arguments[0].getAttribute('value')",pwd);
				String text2 = (String)es1;
				System.out.println(text2);
}


}
