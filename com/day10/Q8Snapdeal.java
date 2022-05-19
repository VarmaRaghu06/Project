package com.day10;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8Snapdeal {


public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
	search.sendKeys("hand sanitizer",Keys.ENTER);
	
	WebElement rclk = driver.findElement(By.xpath("//p[@title='Mirah Belle Hand Rub Sanitizer Spray 1ltr & 20 Masks Combo pack Sanitizers 1000 mL Pack of 2']"));
		rclk.click();
		
		String prt = driver.getWindowHandle();
		System.out.println(prt);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		for (String string : all) {
			
			if(!(prt.equals(string))) {
				
				driver.switchTo().window(string);
			}
			
		}
		WebElement add = driver.findElement(By.xpath("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
	add.click();

		
}


}
