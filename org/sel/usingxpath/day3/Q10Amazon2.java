package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q10Amazon2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		 
		 
		 WebElement	 Clksearch= driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
		 Clksearch.click();
		 
		 WebElement	 Mobiles= driver.findElement(By.xpath("//span[@class='nav-a-content']"));
			Actions actions=new Actions(driver);
			actions.moveToElement(Mobiles).perform();
		 //WebElement	 Clksearch1= driver.findElement(By.xpath("//a[@href='/s/ref=mega_elec_s23_1_2_1_2?rh=i%3Aelectronics%2Cn%3A6294306031&ie=UTF8&bbn=976419031']"));
		 //Clksearch1.click();
		 
		

	}

}
