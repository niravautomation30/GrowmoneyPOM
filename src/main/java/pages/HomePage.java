package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementUtil;

public class HomePage {

	private WebDriver driver;
//	private ElementUtil elementUtil;
	
	private By loginButton = By.xpath("//a[contains(text(),'Login')]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
//		this.elementUtil = new ElementUtil(driver);
	}

	public LoginPage clickLoginButton() {
		driver.findElement(loginButton).click();
		return new LoginPage(driver);
	}

}
