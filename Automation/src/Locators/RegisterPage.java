package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
		driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("Ramya");
		driver.findElement(By.id("LastName")).sendKeys("Shannu");
		driver.findElement(By.id("Email")).sendKeys("abcd12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcd@321");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd@321");
		driver.findElement(By.id("register-button")).click();
	}

}
