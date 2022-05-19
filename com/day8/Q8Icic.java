package com.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8Icic {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=DEPOSIT&ITM=nli_cms_FD_Primer_FDUncertainty_INVESTINANFD");
	Thread.sleep(2000);
		WebElement ud = driver.findElement(By.id("DUMMY1"));
		ud.click();
		//Thread.sleep(2000);
WebElement userid = driver.findElement(By.name("login-input type_UserPrincipal"));		
userid.sendKeys("ravi");
Thread.sleep(2000);

WebElement pwd = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
pwd.sendKeys("Varma");
Thread.sleep(3000);
WebElement cont = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
cont.click();

//Alert alert = driver.switchTo().alert();
//
//alert.accept();
		
}
}

