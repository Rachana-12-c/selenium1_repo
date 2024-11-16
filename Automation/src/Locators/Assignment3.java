package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("rachana270898@gmail.com");
	driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("rach@123");
	Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[value='Log in']")).click();
	
	}

}
