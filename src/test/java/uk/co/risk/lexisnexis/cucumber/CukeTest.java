package uk.co.risk.lexisnexis.cucumber;

/*
 * Ravi's Creation
 * Date of Creation
 */

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static com.cucumber.listener.Reporter.loadXMLConfig;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = ".",
        plugin =  {"json:target/RunCuke/cucumber.json","pretty","html:target/cucumber-report/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},
        monochrome = true

)
public class CukeTest {

    @AfterClass

    public static void setUp(){

        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath+ "/src/test/java/uk/co/risk/lexisnexis/resources/extentreports/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }

}
