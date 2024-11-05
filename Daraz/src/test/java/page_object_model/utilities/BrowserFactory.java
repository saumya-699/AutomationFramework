package page_object_model.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {


    static BrowserFactory browserFactory;
    ThreadLocal<WebDriver> threadLocal = ThreadLocal.withInitial(()->{
        WebDriver driver;
        String browserType = System.getProperty("browser","chrome");
        switch (browserType) {
            case "chrome":
                driver = WebDriverManager.chromedriver().create();
                break;

            case "firefox":
                driver= WebDriverManager.firefoxdriver().create();
                break;

            case "edge":
                driver= WebDriverManager.edgedriver().create();
                break;
            default:
                throw new RuntimeException("Unsupported browser type: " + browserType);

        }
        driver.manage().window().maximize();
        return driver;
    });

    private BrowserFactory() {}

    public static BrowserFactory getBrowserFactory() {
        if (browserFactory == null) {

            browserFactory = new BrowserFactory();
        }

        return browserFactory;
    }

    public WebDriver getDriver() {
        return threadLocal.get();
    }
}
