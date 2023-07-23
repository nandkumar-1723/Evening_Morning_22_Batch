package org.Arise.Utils.Generic;

import org.Arise.Base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.*;
import java.util.*;
import java.util.function.*;

/**
 * @author Nandkumar Babar
 */
public class waitForElement {

    public static void waitForElement(List<WebElement> element) throws Exception {
        Function<WebDriver, Boolean> testCondtionWait = i -> element.size()>0;
        WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofMinutes(2));

        try {
            wait.until(testCondtionWait);
        } catch (Exception e){
            throw new Exception("webelemt is not found after 2 min. of wait time");
        }
    }
}
