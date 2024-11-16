package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");//we can use multiple arguments method
		option.addArguments("--incognito ");
		option.addArguments("--start-maximized");//without using maximize method
		
		WebDriver driver=new ChromeDriver(option);
	//  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.partialLinkText("MEN")).click();

	}

}
