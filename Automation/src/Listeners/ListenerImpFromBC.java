package Listeners;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import zmq.ZError.IOException;

public class ListenerImpFromBC extends ListenerBaseclass implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + "timestamp" + ".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (java.io.IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Login success", true);
	}
}
