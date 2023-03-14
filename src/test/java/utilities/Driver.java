package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    ChromeOptions ops = new ChromeOptions();
                    ops.addArguments("--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(ops);
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) { // driver'a deger atanmissa
            driver.close();
            driver = null;
        }
    }
}


 //System.setProperty("webdriver.http.factory", "jdk-http-client");
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();


// WebDriverManager.chromedriver().setup();
//                    ChromeOptions options=new ChromeOptions();
//                    options.addArguments("--remote-allow-origins=*");
//                    driver = new ChromeDriver(options);
//                    break;