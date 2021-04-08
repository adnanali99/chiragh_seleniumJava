package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features = ".//Features/ Registration.feature",
        glue="stepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-report.html"},
        tags = "@EmailValidations"
)

public class testRunner {

}
=======
@CucumberOptions(features = ".//Features/kycPage.feature",
                glue="stepDefinitions",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty", "html:test-report.html"},
                tags = "@LoginValidation"
                )

public class testRunner {

}
>>>>>>> f39def6bbd2518ac55f4a9cae3afe81c665cb463
