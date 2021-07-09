package pages;

import org.openqa.selenium.WebDriver;

public class IndexPage {

	private WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getTitel(){
        String title = driver.getTitle();
        return title;
    }
}
