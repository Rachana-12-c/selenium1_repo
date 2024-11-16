package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXPathByAxes {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/lenov/Desktop/Table.html");
	String collection = driver.findElement(By.xpath("//td[text()='Stree2']/preceding-sibling::td")).getText();
	System.out.println("Position is " + collection);

	String a = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[1]")).getText();
	String b = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[2]")).getText();
	System.out.println("Collection of KGF is " + a);
	System.out.println("Imdb of KGF is " + b);
	}

}
