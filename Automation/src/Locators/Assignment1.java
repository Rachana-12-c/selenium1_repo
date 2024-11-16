package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
        driver.findElement(By.partialLinkText("SIGNUP")).click();
        Thread.sleep(2000);
       
        driver.findElement(By.id("firstname")).sendKeys("Rachana");
        driver.findElement(By.id("lastname")).sendKeys("C");
	    driver.findElement(By.id("email")).sendKeys("rachana270898@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("rach@123");
	    driver.findElement(By.id("repassword")).sendKeys("rach@123");
	    Thread.sleep(2000);
	   
	    driver.findElement(By.id("signup")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	}
}
