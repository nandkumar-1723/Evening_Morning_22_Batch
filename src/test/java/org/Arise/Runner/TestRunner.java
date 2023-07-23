package org.Arise.Runner;

import io.cucumber.java.*;
import io.cucumber.testng.*;
import org.Arise.Base.*;
import org.testng.annotations.*;

import static org.Arise.Base.browserConfiguration.launchBrowser;

/**
 * @author Nandkumar Babar
 */
@CucumberOptions(
        features = "src/test/java/org/Arise/Features",
        glue = {"org/Arise/StepDefination"},
        tags = "@004",
        plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite(){
        launchBrowser("Chrome");
    }

    @AfterSuite
    public void afterSuite(){
        BaseTest.driver.quit();
    }

}
