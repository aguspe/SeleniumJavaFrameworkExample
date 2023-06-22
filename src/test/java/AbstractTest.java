import io.qameta.allure.Attachment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public abstract class AbstractTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            saveScreenshot();
            driver.quit();
        }
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public void saveScreenshot() {
        ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
