package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		// driver.close(); //it should be last line of the code

	}

}
