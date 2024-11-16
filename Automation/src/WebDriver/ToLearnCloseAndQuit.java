package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCloseAndQuit {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://demowebshop.tricentis.com/");
	driver.quit();

	}

}
