package uk.co.risk.lexisnexis.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.risk.lexisnexis.utility.UtilityRM;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class HomePage extends UtilityRM {

    private static Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath = "//p[contains(text(),'Product Sign In')]")
    WebElement _productSignInLink;



    public void clickOnProductSignIn(){
        clickOnElement(_productSignInLink);
    }

}
