import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginTest extends AbstractTest {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit("https://automationteststore.com/index.php?rt=account/login");
        loginPage.login("aguspe", "12341234");
        Assertions.assertEquals("Welcome back Agustin", loginPage.getHeaderText());
    }
}
