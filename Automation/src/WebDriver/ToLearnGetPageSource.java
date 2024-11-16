package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {
//This class is modified
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		 String sourceCode = driver.getPageSource();
		 System.out.println(sourceCode);
		 

	}

}
