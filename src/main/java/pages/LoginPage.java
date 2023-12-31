package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.url = "/index.php?rt=account/login";
    }

    private WebElement getUsernameField() {
        return driver.findElement(By.id("loginFrm_loginname"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.id("loginFrm_password"));
    }

    private WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("button[title='Login']"));
    }

    private WebElement getHeader() {
        return driver.findElement(By.className("menu_text"));
    }

    private WebElement getError() {
        return driver.findElement(By.className("alert-danger"));
    }

    public void login(String username, String password) {
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }

    public String getHeaderText() {
        return getHeader().getText();
    }

    public String getErrorText() { return getError().getText(); }
}
