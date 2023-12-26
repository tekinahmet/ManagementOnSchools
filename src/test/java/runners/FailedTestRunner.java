package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//this class only used to run failedRerun.txt for re runing only failed test cases
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome = true,
        features = "@target/failedRerun.txt",
        glue = "stepdefinitions",
        dryRun = false
)
public class FailedTestRunner {
}