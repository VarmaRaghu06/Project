package com.day9;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q7 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	
	WebElement name1 = driver.findElement(By.name("firstName"));
	name1.sendKeys("ravi");
	
	WebElement name2 = driver.findElement(By.name("lastName"));
	name2.sendKeys("varma");
	
	WebElement phone = driver.findElement(By.name("phone"));
	phone.sendKeys("63784874874");
	
	WebElement email= driver.findElement(By.name("userName"));
	email.sendKeys("rrvarma16@gmail.com");
	
	WebElement address = driver.findElement(By.name("address1"));
	address.sendKeys("jolarpet,tirupattur dt");
	
	WebElement city = driver.findElement(By.name("city"));

	city.sendKeys("vellore");
	
	WebElement state = driver.findElement(By.name("state"));
	state.sendKeys("Tamilnadu");
	
	WebElement postal = driver.findElement(By.name("postalCode"));
	postal.sendKeys("635851");
	
	
	WebElement un = driver.findElement(By.name("email"));
	
	un.sendKeys("ravi");
	
	WebElement pwd = driver.findElement(By.name("password"));
	
	pwd.sendKeys("28487348");
	
	WebElement cpwd = driver.findElement(By.name("confirmPassword"));
	cpwd.sendKeys("74747578");
	
	WebElement cntry = driver.findElement(By.name("country"));
	
	Select sel=new Select(cntry);
	List<WebElement> options = sel.getOptions();
	
	sel.selectByValue("INDIA");
	
	
	for (int i = 0; i <options.size(); i++)
	
	{
		
		WebElement webElement = options.get(i);
		String text = webElement.getAttribute("value");
		System.out.println(text);
	}
	
//	WebElement submt = driver.findElement(By.name("submit"));
//	submt.click();
	
	
	}
}
