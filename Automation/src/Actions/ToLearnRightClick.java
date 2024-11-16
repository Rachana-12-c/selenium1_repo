package Actions;
//Interview question in right click actions

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClick {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	Actions act=new Actions(driver);//object creation for action class
	act.contextClick().perform();
	WebElement registerLink = driver.findElement(By.linkText("Register"));
	act.contextClick(registerLink).perform();
	}
}
