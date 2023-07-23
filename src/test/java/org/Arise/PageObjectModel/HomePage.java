package org.Arise.PageObjectModel;

import io.cucumber.datatable.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.*;

import javax.xml.crypto.*;
import java.util.*;

import static org.Arise.Base.BaseTest.driver;
import static org.Arise.Utils.Generic.waitForElement.waitForElement;

/**
 * @author Nandkumar Babar
 */
public class HomePage {
    //Button ---------------> btnSubmit
    //Text -----------------> txtHomePage
    //Input ----------------> inpUsername
    //dropdown -------------> ddCountry

    @FindBy(xpath = "(//img[@title='Online Shopping in India'])[2]") private List<WebElement> btnLogo;
    @FindBy(xpath = "//input[@id='header_search_text']") private List<WebElement> inpSearchProduct;
    @FindBy(xpath = "(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]") private List<WebElement> btnSearch;
    @FindBy(xpath = "((//div[@id='productItem2']//div)[3]//span)[1]") private List<WebElement> txtPrice;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void searchTheProductAndVerifyPrice(DataTable dataTable) throws Exception {
        waitForElement(inpSearchProduct);
        inpSearchProduct.get(0).sendKeys(dataTable.asMaps().get(0).get("name"));
        btnSearch.get(0).click();
        waitForElement(txtPrice);
        System.out.println("Actual Price "+txtPrice.get(0).getText());
        System.out.println("Expected price "+dataTable.asMaps().get(0).get("price"));
    }

  public void navigatesToHomePage() throws Exception {
        waitForElement(btnLogo);
        btnLogo.get(0).click();
  }

}
