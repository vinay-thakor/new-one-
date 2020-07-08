package uk.co.risk.lexisnexis.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.risk.lexisnexis.basepage.BasePage;
import uk.co.risk.lexisnexis.browserselector.BrowserSelector;
import uk.co.risk.lexisnexis.loadproperty.LoadProperty;
import uk.co.risk.lexisnexis.utility.UtilityRM;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class Hook extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");

    String chrome = loadProperty.getProperty("browser1");
    String firefox = loadProperty.getProperty("browser2");
    String ie = loadProperty.getProperty("browser3");
    private String screenShotPath;

    @Before
    public void openBrowser(){
        browserSelector.selectBrowser(chrome);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
       // Reporter.assignAuthor("Lexis Nexis","RM");
    }
    @After
    public void closeBrowse(Scenario scenario){

        if (scenario.isFailed()){
            String screenShotPath = UtilityRM.getScreenshot(driver,scenario.getName().replace(" ","_"));
        }

        try {
            Reporter.addScreenCaptureFromPath(screenShotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
