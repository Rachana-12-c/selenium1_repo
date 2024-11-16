package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {

	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://demowebshop.tricentis.com/login");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[class='button-1 search-box-button']")).click();
    WebElement errorMsg = driver.findElement(By.xpath("//div[contains(@class='validation-summary-errors')]"));
    
    String color = errorMsg.getCssValue("color");
    String fontSize = errorMsg.getCssValue("font-size");
    String fontFamily = errorMsg.getCssValue("font-family");
    System.out.println("color");
    System.out.println("fontSize");
    System.out.println("fontFamily"); 
    }
}
