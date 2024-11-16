package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.linkText("UI Testing Concepts")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Button")).click();
	Thread.sleep(2000);
    driver.findElement(By.linkText("Right Click")).click();
	Thread.sleep(2000);
    Actions act=new Actions(driver);
	act.contextClick().perform();
	WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='Yes']"));
	WebElement yesMsg = driver.findElement(By.id("You selected Yes"));
	String Message_text = yesMsg.getText();
	String Message_color = yesMsg.getCssValue("color");
	System.out.println("Message_text");
	System.out.println("Message_color");
	
	

	}

}

