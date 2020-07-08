package uk.co.risk.lexisnexis.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class BasePage {

    // web driver
    public static WebDriver driver;
    // constructor created to get property and to create log
    public BasePage(){

        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/uk/co/risk/lexisnexis/resources/properties/log4j.properties");
        PageFactory.initElements(driver,this);
    }
}
