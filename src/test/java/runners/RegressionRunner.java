package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//generates reports in the console as well
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome = true,//makes the console reports more readable
        features = "./src/test/resources/features",//path of the features folder
        glue = {"stepdefinitions","hooks"},//path of the stepdefinitions folder
        dryRun = false, //generate the missing step definitions only. Do not run the existing step definitions
        tags = "@regression"
)
public class RegressionRunner {
}
//use @regression tag in some scenarios