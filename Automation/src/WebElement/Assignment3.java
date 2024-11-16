package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(2000);
	WebElement subscribe = driver.findElement(By.xpath("//input[@type='text'][1]"));
	System.out.println("Display status: "+subscribe.isDisplayed());
System.out.println("Enable status: "+subscribe.isEnabled());
	}

}
