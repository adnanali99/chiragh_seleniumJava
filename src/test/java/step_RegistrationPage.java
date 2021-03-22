package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.RegistrationObj;
public class step_RegistrationPage{
    WebDriver driver;
    RegistrationObj RP;

    @Given("I am on the RegistrationPage.")
    public void i_am_on_the_Registration_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://chiragh.com/register");
        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        Assert.assertEquals("Register at Chiragh to find your dream property online", title);


    }

    @When("The user enters firstname{string}")
    public void the_user_enters_firstname(String Firstname) {
        // Write code here that turns the phrase above into concrete actions
        RP = new RegistrationObj(driver);
        RP.enterUserFirstName(Firstname);
    }

    @Then("user should get FirstName validation {string}")
    public void user_should_get_first_name_validation(String message) {
        // Write code here that turns the phrase above into concrete actions
        RP = new RegistrationObj(driver);
        String ErrorMessage = RP.FirstNameError().getText();
        System.out.println("Title is: " + ErrorMessage);
        Assert.assertEquals(message, ErrorMessage);
    }

}