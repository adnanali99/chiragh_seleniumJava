package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//@CucumberOptions(features = ".//Features/ Registration.feature",
//        glue="stepDefinitions",
//        dryRun = false,
//        monochrome = true,
//        plugin = {"pretty", "html:test-report.html"},
//        tags = "@EmailValidations"
//)
@CucumberOptions(features = "src/test/resources",
        glue="stepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-report.html"},
        tags = "@LoginValidation1"
)
public class testRunnerTest {

}
