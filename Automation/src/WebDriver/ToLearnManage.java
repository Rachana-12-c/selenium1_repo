package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	driver.manage().window().minimize();
	
	driver.get("https://www.wikipedia.org/");
	

	}

}
