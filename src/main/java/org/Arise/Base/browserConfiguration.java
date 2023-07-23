package org.Arise.Base;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;


/**
 * @author Nandkumar Babar
 */

public class browserConfiguration {

    public static void launchBrowser(String browserValue){

        switch (browserValue){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions =new ChromeOptions();
                chromeOptions.setHeadless(false);
                BaseTest.driver=new ChromeDriver(chromeOptions);
                break;

            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                BaseTest.driver=new FirefoxDriver();
                break;

            case "Edge":
                WebDriverManager.edgedriver().setup();
                BaseTest.driver=new EdgeDriver();
                break;
        }

        BaseTest.driver.manage().window().maximize();
        BaseTest.driver.get("https://www.naaptol.com/");
        BaseTest.driver.manage().deleteAllCookies();
    }
}
