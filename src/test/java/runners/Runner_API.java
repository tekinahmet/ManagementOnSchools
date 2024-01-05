package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        plugin = {
//                "pretty",//generates reports in the console as well
//                "html:target/cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-reports/cucumber.xml",
//                "rerun:target/failedRerun.txt",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        },
//        monochrome = false,//makes the console reports more readable
//        features = "./src/test/resources/features/api_features",//path of the features folder
//        glue = {"stepDefinitions/API_StepDefinitions","hooks"},//path of the stepdefinitions folder
//        dryRun = true, //generate the missing step definitions only. Do not run the existing step definitions
//        tags = "@US16_OG_API"
//)
//public class Runner_API {
//}

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        /*
 rerun plugin'i sayesinde fail olan scenariolarımızı yolunu belirttiğimiz .txt dosya için tutacaktır
  */
        features = "src/test/resources/features", //features package'ının yolu (content root)
        glue = "stepDefinitions", //stepDefinitions package ismi
        tags = "@US16_OG_API", //Hangi scenarioları bu tag'ı belirtirsek o scenariolar çalışır
        dryRun = true, //true seçersek scenariolari kontrol eder browser'ı çalıştırmaz
        monochrome = false//-->true kullanırsak konsoldaki çıktıları tek renk(siyah) olarak verir
)

public class Runner_API {
    /*
        @CucumberOptions() bu notasyon sayesinde hangi scenariolari çalıştıracağımızı ve hangi raporları
    alacağımızı belirtiriz
        dryRun parametresi eğer true seçilirse scenariolari çalıştırmadan feature file daki steplerin
    stepDefinition class'ındaki methodlar ile uyuşuğ uyuşmadığını kontrol eder ve browser'ı çalıştırmaz
     */

}
