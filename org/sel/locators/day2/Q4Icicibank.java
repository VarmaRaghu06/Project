package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4Icicibank {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		//find and verify the locator of the username field
		
	 WebElement	 Uname= driver.findElement(By.xpath("//input[@title='Login using User ID and password']"));
	Uname.click();
	Thread.sleep(3000);
	 WebElement	 Uname2= driver.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));

	
		 Uname2.sendKeys("Ravi1@gmail.com");
		 
	
		 //find and verify the locator of the password field
			 WebElement Pw=driver.findElement(By.xpath("//input[@title='Password']"));
//			 Pw.click();
		 Pw.sendKeys("#gr234");
		 
		 String Unametxt=Uname2.getAttribute("value");
		 System.out.println(Unametxt);
		 String Pwtxt=Pw.getAttribute("value");
		 System.out.println(Pwtxt);
		 
	}

}
