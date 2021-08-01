package factory;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestUtil;

public class DriverFactory {

	public WebDriver driver;
	
	public WebDriver initDriver(String browser, Properties prop) {
		
		System.out.println("browser is :"+browser);
		
		switch (browser.toLowerCase()) {
		case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
		case "firefox":
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please enter correct browser name (chrome,firefox etc...)");
			break;			
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return driver;
	}
}
