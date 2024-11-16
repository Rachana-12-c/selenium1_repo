package CrossBrowsingTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToLearnCrossBrowsingTesting {
	public WebDriver driver;
    @Parameters("browser")
	@Test
	public void launch(String browsername) {
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
}
