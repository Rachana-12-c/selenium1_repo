package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rachana270898@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rach@123");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        
	}

}
