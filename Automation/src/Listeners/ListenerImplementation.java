package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

public class ListenerImplementation implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test script is failed", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is passed", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test script is skipped", true);
	}

}
