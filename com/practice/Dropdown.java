package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SD-1\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");

WebElement createNew = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
createNew.click();
Thread.sleep(3000);
WebElement day = driver.findElement(By.id("day"));
Select select = new Select(day);
select.selectByValue("6");

boolean m = select.isMultiple();
System.out.println(m);
//
////select.selectByIndex(5);
//select.selectByVisibleText("6");
//
WebElement month = driver.findElement(By.id("month"));
  Select select2 = new Select(month);
  select2.selectByVisibleText("Oct");
//
  WebElement year = driver.findElement(By.id("year"));
  Select select3 = new Select(year);
  select3.selectByValue("1994");
  
  
  List<WebElement> options = select.getOptions();
  List<WebElement> opt1 = select.getOptions();
  for(int i=0;i<opt1.size();i++) {
	  
	  WebElement w = opt1.get(i);
	  String text = w.getText();////
	  System.out.println(text);
	  
  }
  
  System.out.println(options.size());
  WebElement print = options.get(1);
  System.out.println(print.getAttribute("value"));
  
  					
  
  
  

//List<WebElement> opt = select.getOptions();
//
//  for (int i = 0; i < opt.size(); i++) {
//	  
//	  WebElement print = opt.get(i);
//	  String text = print.getAttribute("value");
//	  System.out.println(text);
//  }
//	  List<WebElement> opt1 = select2.getOptions();
//	  
//	  
//	for (int j = 0; j <opt1.size(); j++) {
//		WebElement text1 = opt1.get(j);
//		String pt = text1.getAttribute("value");
//		System.out.println(pt);
//	}
//	List<WebElement> opt2 = select3.getOptions();
//	for (int k = 0; k <opt2.size(); k++) {
//		WebElement text2 = opt2.get(k);
//		String pt1 = text2.getAttribute("value");
//		System.out.println(pt1);
//	}
//	
//	
  
  
  
  
 

  
}

}
