package org.sel.locators.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9Register {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SD-1\\"
				+ "Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	
	WebElement FN=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	
	FN.sendKeys("Ravivarma");
	
	WebElement LN=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	
	LN.sendKeys("R R");
	
	WebElement Addres=driver.findElement(By.xpath("//textarea[@rows='3']"));
	
	Addres.sendKeys("Kodiyur,Jolarpet,Tirupattur district");
	
	WebElement EmailId=driver.findElement(By.xpath("//input[@type='email']"));
	
	EmailId.sendKeys("rrrvarma16@gmail.com");
	
	WebElement Phone=driver.findElement(By.xpath("//input[@type='tel']"));
	
	Phone.sendKeys("9655252267");
	
	WebElement Gender=driver.findElement(By.xpath("//input[@value='Male']"));
	
	Gender.click();
	
	WebElement Hobbies1=driver.findElement(By.xpath("//input[@id='checkbox1']"));
	
	Hobbies1.click();
	
WebElement Hobbies2=driver.findElement(By.xpath("//input[@id='checkbox2']"));
	
	Hobbies2.click();
	
WebElement Hobbies3=driver.findElement(By.xpath("//input[@id='checkbox3']"));
	
	Hobbies3.click();
	
	//WebElement Lang=driver.findElement(By.xpath("//div[@id='msdd']"));
	
	//Lang.click();
	
	//WebElement Skills=driver.findElement(By.xpath("//select[@id='Skills']"));
	
//	Skills.click();
	
//	WebElement Country=driver.findElement(By.xpath(""));
	
//	Country.sendKeys("Ravivarma");
	
	//WebElement SelectCountry=driver.findElement(By.xpath("//span[@role='combobox']"));
	
	//SelectCountry.click();
	
	//WebElement Year=driver.findElement(By.xpath("//select[@placeholder='Year']"));
	
	//Year.click();

//WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	
	//month.click();
	
//WebElement day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
	
	//day.click();
	
	WebElement pwd=driver.findElement(By.xpath("//input[@id='firstpassword']"));
	pwd.sendKeys("@Ravivarma");
	
	WebElement Confirmpwd=driver.findElement(By.xpath("//input[@id='secondpassword']"));
	Confirmpwd.sendKeys("@Ravivarma");
	
	//WebElement Submit=driver.findElement(By.xpath("//button[@name='signup']"));
	//Submit.click();
	
	
	}
	

}
