import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.PropertyHandler;

import static org.assertj.core.api.Assertions.*;

public class LoginTest extends AbstractTest {

    private LoginPage loginPage;
    private PropertyHandler propertyHandler;

    private String username;

    private String password;

    @BeforeTest
    public void setUp() {
        this.propertyHandler = new PropertyHandler("src/main/resources/userdata.properties");
        this.username = propertyHandler.getProperty("username");
        this.password = propertyHandler.getProperty("password");
        this.loginPage = new LoginPage(driver);
        loginPage.visit();
    }

    @Test(description = "Test that a registered user can log in with the correct credentials")
    public void canLoginWithValidCredentials() {
        loginPage.login(username, password);
        assertThat(loginPage.getHeaderText()).isEqualTo("Welcome back Agustin");
    }

    @Test(description = "Test that a registered user cannot log in with the incorrect credentials")
    public void cannotLoginWithInvalidCredentials() {
        loginPage.login(username, "wrongPassword");
        assertThat(loginPage.getErrorText())
                .isEqualTo("×\n" + "Error: Incorrect login or password provided.");
    }
}
