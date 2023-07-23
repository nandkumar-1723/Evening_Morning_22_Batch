package org.Arise.StepDefination;

import io.cucumber.datatable.*;
import io.cucumber.java.en.*;
import org.Arise.PageObjectModel.*;

import static org.Arise.Base.browserConfiguration.launchBrowser;


/**
 * @author Nandkumar Babar
 */
public class Steps {

    @Given("launch the browser and navigates to home page")
    public void launchTheBrowserAndNavigatesToHomePage() {
        launchBrowser("Chrome");
    }

    @When("User search the product on the application and verify the price")
    public void userSearchTheProductOnTheApplication(DataTable dataTable) throws Exception {
        new HomePage().searchTheProductAndVerifyPrice(dataTable);
    }


    //Background code
    @Given("navigates to the home page")
    public void navigatesToTheHomePage() throws Exception {
        new HomePage().navigatesToHomePage();
    }
}
