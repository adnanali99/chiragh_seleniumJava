package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/kycPage.feature",
                glue="stepDefinitions",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty", "html:test-report.html"},
                tags = "@LoginValidation"
                )

public class testRunner {

}
