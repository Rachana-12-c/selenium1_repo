package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnIframe {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
	//	driver.switchTo().frame(0); //index
   //	driver.switchTo().frame("send-sms-iframe"); //id or name of <iframe> tag
		WebElement frameEx = driver.findElement(By.xpath("//iframe[@title='Iframe Example']")); //<iframe> tag xpath 
		driver.switchTo().frame(frameEx);
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
	    driver.findElement(By.id("regUser")).click();
	    driver.switchTo().defaultContent(); //switch back to last pages
	    driver.findElement(By.id("hamburger")).click();
	}
}
