/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import configreader.ConfigPropReader;
import factory.DriverFactory;
import pages.HomePage;
import utils.TestUtil;

public class TestBase {

	public DriverFactory df;
	public ConfigPropReader cp;
	public Properties prop;
	public WebDriver driver;
	public TestUtil testUtil;
	protected HomePage homepage;

	@BeforeClass
	public void setup() {
		cp = new ConfigPropReader();
		prop = cp.initProp();
		df = new DriverFactory();
		driver = df.initDriver("chrome", prop);
	}

	@BeforeMethod
	public void goToLoginPage() {
		homepage = new HomePage(driver);
	}

	@AfterMethod
	public void takeScreenshotWhenFail(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				testUtil = new TestUtil(driver);
				testUtil.takeScreenshotAtEndOfTest();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}