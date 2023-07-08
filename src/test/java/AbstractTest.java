import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class AbstractTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeTest
    public void setUpDriver() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
