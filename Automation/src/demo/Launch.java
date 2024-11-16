package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Launch {

	public static void main(String[] args)
	{
	ChromeDriver driver=new ChromeDriver();
	WebDriver driver1=new  EdgeDriver();
	WebDriver driver2=new FirefoxDriver();
	}

}