package org.sel.contains.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9Snapdeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement Searchbx=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		Searchbx.sendKeys("Computer glass");
		
		WebElement Searchbuton=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		Searchbuton.click();
		
		WebElement SelctProduct=driver.findElement(By.xpath("//p[@title='Unisex Blue Cut & Anti-glare Computer Glasses | For Computer Mobile TV | Eye Protection | Zero Power | Brand - AFERELLE']"));
		SelctProduct.click();
		

	}

}
