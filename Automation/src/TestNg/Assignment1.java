package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment1 {
	@Test(priority = 1, invocationCount = 2)
	public void createAccount() {
		Reporter.log("Executing from create account method", true);
	}

	@Test(priority = 3)
	public void deleteAccount() {
		Reporter.log("Executing from delete account method", true);
	}

	@Test(priority = 2, invocationCount = 3, threadPoolSize = 3)
	public void editAccount() {
		Reporter.log("Executing from edit account method", true);
	}
}
