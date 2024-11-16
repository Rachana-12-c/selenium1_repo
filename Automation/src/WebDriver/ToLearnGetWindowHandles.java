package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//for demo qspiders application
	
	/*driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	Thread.sleep(5000);
	driver.findElement(By.id("browserButton3")).click();
	Set<String> allWindowIds=driver.getWindowHandles(); */
	
	//for tricentis application
	driver.get("https://demowebshop.tricentis.com/");
	 Set<String> allWindowIds = driver.getWindowHandles();
	
	
	for(String id:allWindowIds)
	{
		System.out.println(id);
	}
	

	}

}