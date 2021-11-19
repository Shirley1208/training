package ebay;

import config.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static String browser;
    static WebDriver driver;

    public static void main(String[] args) {
//        setBrowser();
        PropertiesFile.readPropertiesFile();
        setBrowserConfig();
        runTest();
        PropertiesFile.writePropertiesFile();
    }

    public static void setBrowser() {
        browser = "Chrome";
    }

    public static void setBrowserConfig() {
        if (browser.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            //Instantiating objects and variables
            driver = new ChromeDriver();
        }
    }

    public static void runTest() {
        //Launching a browser session
        driver.get("http://www.ebay.com");
        driver.quit();
    }

    public void searchMethod() {
        driver.findElement(By.id("gh-ac")).sendKeys("Playstation");
        System.out.println("Performing research");
    }

}
