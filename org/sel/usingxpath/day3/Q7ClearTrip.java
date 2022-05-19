package org.sel.usingxpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		 WebElement	 From= driver.findElement(By.xpath("//input[@title='From station']"));
		
		 From.sendKeys("Chennai Central (MAS)");
		 WebElement	 To= driver.findElement(By.xpath("//input[@title='To station']"));
			
			 To.sendKeys("Delhi (DLI)");
		 
		 WebElement	 SearchBtn= driver.findElement(By.xpath("//button[@tabindex='9']"));
		 SearchBtn.click();
		 
		
	

}
}
