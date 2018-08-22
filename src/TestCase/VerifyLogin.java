package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObject.login;

public class VerifyLogin {
	@Test
	public void verifyValidLogin() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.qa.dribe.com/login");
		
		
		login loginpage = new login(driver);
		loginpage.loginSuccess("f1-test@flexdrive.com", "password");
		
		loginpage.loginSuccess("f1-test@flexdrive.com", "password");
				
	}

}
