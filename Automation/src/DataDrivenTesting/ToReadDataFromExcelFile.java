package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	 //step 1:Create FIS object
		FileInputStream fis=new FileInputStream("./testdata/Testscriptdata.xlsx");
	 //step 2:Create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
    //step 3:Call read methods
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String Username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Username);
		
		String Password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(Password);
		
		//double Price = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		int Price = (int) workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();//type-casting double to int
		System.out.println(Price);
		
		boolean Status = workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(Status);
		
		LocalDateTime Date = workbook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(Date);
		
		Month month = Date.getMonth();
		System.out.println(month);
		int monthDate = Date.getDayOfMonth();
		System.out.println(monthDate);
		int year = Date.getDayOfYear();
		System.out.println(year);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.id("LOGIN")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
	}

}
