package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SkillarrayBaseClass {
	WebDriver driver;
	Properties prop;
	@BeforeTest
	public void fetchData() throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/democommondata.properties");
		prop=new Properties();
		prop.load(fis);
	}
	@BeforeClass
	public void launchBrowser()  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get(prop.getProperty("url"));

	}
	@BeforeMethod
	public void login()  {
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
