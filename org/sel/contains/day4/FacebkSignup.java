package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebkSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement btnsign=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		btnsign.click();
		
		WebElement Name=driver.findElement(By.xpath("//input[@name='firstname']"));
	
		Name.sendKeys("Ravi");
		WebElement LName=driver.findElement(By.xpath("//input[@name='lastname']"));
		LName.sendKeys("Varma");
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("Varma@gmail.com");
		WebElement Emailpwd=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		Emailpwd.sendKeys("Varma@");
		WebElement D=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		D.click();
		WebElement D1=driver.findElement(By.xpath("//option[@value='6']"));
		D1.click();
		WebElement M=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		M.click();
		WebElement M1=driver.findElement(By.xpath("//option[@value='10']"));
		M1.click();
		WebElement Y=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Y.click();
		WebElement Y1=driver.findElement(By.xpath("//option[@value='1994']"));
		Y1.click();
		
		WebElement Gender=driver.findElement(By.xpath("//input[@value='2']"));
		Gender.click();
		
		
		
		
		
		
		

	}

}
