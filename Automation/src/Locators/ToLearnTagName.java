package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	
	allLinks.get(allLinks.size()-1).click();//last element of the webpage
	 
	for(WebElement allLink:allLinks)
	{
		System.out.println(allLink.getText());
	} 
	
	
	List<WebElement> allImages = driver.findElements(By.tagName("img"));
	System.out.println(allImages.size());
	List<WebElement> allText = driver.findElements(By.tagName("input"));
	System.out.println(allText.size()); 
	}

}
