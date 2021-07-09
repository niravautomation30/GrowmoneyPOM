package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By uname = By.name("UserName");
	private By pass = By.name("Password");
	private By loginBtn = By.id("btnCustomerLogin");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public IndexPage enterCredential(String username, String pwd) {

		driver.findElement(uname).sendKeys(username);
		driver.findElement(pass).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		return new IndexPage(driver);
	}
}
