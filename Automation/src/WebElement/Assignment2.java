package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	WebElement subcribeButton = driver.findElement(By.id("newsletter-subscribe-button"));
	Rectangle rect = driver.findElement(By.id("newsletter-subscribe-button")).getRect();
	System.out.println("Display status: "+subcribeButton.isDisplayed());
	System.out.println("Height: "+rect.getHeight());
	System.out.println("Width: "+rect.getWidth());
    System.out.println("X-coordinate: "+rect.getX());
	System.out.println("Y-coordinate: "+rect.getY());
	}

}
