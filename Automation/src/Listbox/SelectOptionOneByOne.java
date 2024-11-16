package Listbox;
//Interview Question

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionOneByOne {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
	WebElement monthListbox = driver.findElement(By.id("month"));
	
	Select monthSelect=new Select(monthListbox);
	List<WebElement> allOptions = monthSelect.getOptions();
	for(int i=0;i<=allOptions.size()-1;i++)
	{
      monthSelect.selectByIndex(i);
	}

}
}
