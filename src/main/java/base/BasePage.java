package base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected String baseUrl;

    protected String url;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.baseUrl = "https://automationteststore.com";
        this.url = "";
    }

    public void visit() {
        driver.get(baseUrl + url);
    }
}
