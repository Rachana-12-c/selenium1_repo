package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGet {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver()	;
	driver.get("https://www.flipkart.com/");
	driver.get("https://www.instagram.com/");
	driver.get("https://www.amazon.in/");

	}

}
