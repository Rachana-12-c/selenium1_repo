package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./testdata/demowebcommondata.properties");
		Properties propt=new Properties();
		propt.load(fis);
		String url = propt.getProperty("url");
		String email = propt.getProperty("email");
		String password = propt.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
