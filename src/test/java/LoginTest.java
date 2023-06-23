import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import utils.PropertyHandler;

public class LoginTest extends AbstractTest {

    private LoginPage loginPage;
    private PropertyHandler propertyHandler;

    private String username;

    private String password;

    @BeforeEach
    public void setUp() {
        super.setUp();
        this.propertyHandler = new PropertyHandler("src/main/resources/userdata.properties");
        this.username = propertyHandler.getProperty("username");
        this.password = propertyHandler.getProperty("password");
        this.loginPage = new LoginPage(driver);
        loginPage.visit();
    }

    @Test
    @DisplayName("Test that a registered user can log in with the correct credentials")
    public void canLoginWithValidCredentials() {
        loginPage.login(username, password);
        Assertions.assertEquals("Welcome back Agustin", loginPage.getHeaderText());
    }

    @Test
    @DisplayName("Test that a registered user cannot log in with the incorrect credentials")
    public void cannotLoginWithInvalidCredentials() {
        loginPage.login(username, "wrongPassword");
        Assertions.assertEquals("×\n" + "Error: Incorrect login or password provided.",
                loginPage.getErrorText());
    }
}
