package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage {
    LoadProp loadProp = new LoadProp();


    //   String browserName = System.getProperty("browser");
       String browserName="chrome";

    public void openBrowser(){
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver","src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        }
        else if(browserName.equalsIgnoreCase("FireFox"))
        {
            System.setProperty("webdriver.gecko.driver","src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        }
        else
        {
            System.out.println("Wrong Browser Name");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(loadProp.getProperty("url"));

    }

    public void closeBrowser(){
        driver.close();

    }

}
