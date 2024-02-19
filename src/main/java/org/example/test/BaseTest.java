package org.example.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected WebDriver driver;

    /* public WebDriver initDriver() {

         String browserName = null;
         if (driver == null) {
             //System.setProperty("webdriver.chrome.driver", "C:\\Users\\bachk\\Documents\\Java_Belhard\\AutoTest\\TestNG\\src\\main\\java\\org\\example\\resourses\\drivers\\chromedriver.exe");
             browserName = System.getProperty("driver", "chrome"); //переменная приходит из среду окружения
             switch (browserName) {
                 case "chrome":
                     WebDriverManager.chromedriver().setup();
                     driver = new ChromeDriver();
                     break;
                 case "firefox":
                     WebDriverManager.firefoxdriver().setup();
                     driver = new FirefoxDriver();
                     break;
                 case "edge":
                     WebDriverManager.edgedriver().setup();
                     driver = new EdgeDriver();
                     break;
                 default:
                     System.out.println("Browser not found");
             }
             driver.manage().window().maximize();
             return driver;
         } else {
             return driver;
         }
     }
 */
    @BeforeMethod
    @Step("Инициализация драйвера")
    public void initDriver() {
        String browserName = null;
        browserName = System.getProperty("driver", "chrome");
        switch (browserName) {
            case "chrome":
                Configuration.browser = "chrome";
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
            case "ie":
                Configuration.browser = "ie";
                break;
            default:
                System.out.println("Browser not found");
        }
        Configuration.browser = "chrome";
        open(getFromProperties("base_url"));
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    public static String getFromProperties(String key) {
        String returnValue = null;
        try (InputStream inputStream = new FileInputStream("src/main/java/org/example/resources/drivers/project.properties")) {
            Properties prop = new Properties();
            prop.load(inputStream);
            returnValue = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        WebDriverRunner.getWebDriver().quit();
    }

    public static void takeScreenshot() {
        byte[] screen = Selenide.screenshot(OutputType.BYTES);
        Allure.addAttachment("PageScreenShot", "image/png", new ByteArrayInputStream(screen), ".png");
    }
}
