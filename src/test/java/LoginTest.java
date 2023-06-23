import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginTest extends AbstractTest {

    @Test
    @DisplayName("Test that a registered user can login")
    public void canLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit();
        loginPage.login("aguspe", "12341234");
        Assertions.assertEquals("Welcome back Agustin", loginPage.getHeaderText());
    }
}
