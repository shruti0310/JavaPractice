package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	
	By username = By.id("email");
	By password = By.id("password");
	By loginButton = By.className("Button__Ripple");
	
	public login(WebDriver driver) {
		this.driver = driver;				
	}
	
	public void loginSuccess(String uid, String passid) {
		typeusername(uid);
		typepassword(passid);
		clickOnLoginButton();
		
	}
	
	public void typeusername(String uid) {
		driver.findElement(username).sendKeys(uid);
		
	}
	
	public void typepassword(String passid) {
		driver.findElement(password).sendKeys(passid);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
		
	}
	
	
	}


