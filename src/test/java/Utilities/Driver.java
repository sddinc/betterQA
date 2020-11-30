package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static ThreadLocal<WebDriver> threadDriver= new ThreadLocal<>();
    public static ThreadLocal<String>threadBrowserName= new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        if (threadBrowserName.get()==null)
        {
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null)
        {
            switch (threadBrowserName.get()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set( new ChromeDriver() );
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set( new FirefoxDriver() );
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver()
    {
        if (threadDriver.get() != null)
        {
            threadDriver.get().quit();
            WebDriver driver=threadDriver.get();
            driver.quit();
            driver=null;
            threadDriver.set(driver);
        }
    }
}
