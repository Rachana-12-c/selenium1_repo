package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.freshersworld.com/");
	String title = driver.getTitle();
	driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
	WebElement cityDropdown = driver.findElement(By.id("currentCity"));
	Select citySelect=new Select(cityDropdown);
	Thread.sleep(2000);
	citySelect.selectByVisibleText(" Bangalore ");
	
	WebElement highQualificationDropdown = driver.findElement(By.id("course"));
	Select qualificationDropdown=new Select(highQualificationDropdown);
	Thread.sleep(2000);
	qualificationDropdown.selectByVisibleText("BE/B.Tech");
	}

}
