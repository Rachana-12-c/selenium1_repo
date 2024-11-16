package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(25000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
        for(String id:allWindowIds)
        {
        	driver.switchTo().window(id);
        	Thread.sleep(2000);
        	String url = driver.getCurrentUrl();
        	System.out.println(url);
        	
        	if(!url.contains("shoppersstack")) {
        	driver.close();
        	
        	/* size-height and width of ebay
        	if(!url.contains("ebay")) {
        	Dimension size=driver.manage().window().getSize();
        	System.out.println(size); */
        		
            //flipkart maximize and pass the data to search
        		if(url.contains("flipkart"))
        		{
        			break;
        		}
        	
        			driver.manage().window().maximize();
        			driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More']")).sendKeys("mobiles");
        			driver.findElement(By.xpath("//span[text()='Login']")).click();
        			driver.close();
        			driver.switchTo().window(parentId);        			
        			driver.findElement(By.id("Login")).click();
        			
        	}	
        	}
        }
	}



