package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	 private WebDriver driver;
	    private By loginButton = By.xpath("//a[contains(text(),'Login')]");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public LoginPage clickLoginButton() {
	        driver.findElement(loginButton).click();
	        return new LoginPage(driver);
	    }	
	
}
