package Listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript {
	@Test
	public void login() {
		Reporter.log("Launch the browser", true);
		Reporter.log("Navigate to URL", true);
		Reporter.log("Click on login link", true);
		Reporter.log("Enter valid crendentials", true);
		Reporter.log("Click on login button", true);
		Assert.assertEquals(true, true);
	}
}
