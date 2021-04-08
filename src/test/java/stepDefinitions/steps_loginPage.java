package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.kycPage_Objects;
import pageObjects.loginPage_Objects;

public class steps_loginPage extends BaseClass {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver");
        driver = new ChromeDriver();
        lp = new loginPage_Objects(driver);
        driver.get("https://test.chiragh.com/login");
        Thread.sleep(3000);
//        String title = driver.getTitle();
//        System.out.println("Title is: "+title) ;
//
//        Assert.assertEquals("Login to Chiragh Property Porta", title);
//        driver.quit();

    }

    @When("clicks on the {string} button")
    public void clicks_on_the_required_button(String click) throws InterruptedException {

        if (click.contains("Login")) {
            lp.clickLoginBtn().click();
            Thread.sleep(6000);
        } else {
            lp.clickOnRegister();
            Thread.sleep(5000);
            Assert.assertEquals("Register at Chiragh to find your dream property online", driver.getTitle());
            driver.quit();
        }

    }

    @Then("User is getting the validation error message {string}")
    public void user_is_getting_the_validation_error_message(String string) {
        //   boolean error = driver.getPageSource().contains("Invalid email or password");
        Assert.assertEquals(string, lp.checkError().getText());
        driver.quit();

    }

    @When("User is providing an email {string} and password {string}")
    public void user_is_providing_a_valid_email_and_password(String email, String password) throws InterruptedException {
        lp.Username(email);
        Thread.sleep(2000);
        lp.setPass(password);
        Thread.sleep(2000);

    }

    @Then("User is getting an appropriate {string}")
    public void user_is_landing_on_the_chiragh_homepage_with_page_title(String title) throws InterruptedException {
        if (driver.getPageSource().contains("Invalid email or password")) {
            Assert.assertTrue(true);
            driver.quit();
        } else if (driver.getPageSource().contains("Enter valid email address e.g example@email.com")) {
            Assert.assertTrue(true);
            driver.quit();
        } else {
            Thread.sleep(5000);
            Assert.assertEquals(title, driver.getTitle());
            lp.clickProfileIcon();
            Thread.sleep(2000);
            lp.clickLogout().click();
            Thread.sleep(5000);
            Assert.assertEquals("Login to Chiragh Property Portal", driver.getTitle());
            driver.quit();
        }

    }

    @Then("User can see all the login page elements e.g {string} , {string} and {string} fields and their labels. The lables of {string} , {string} , {string} and {string}")
    public void user_can_see_all_the_login_page_elements_e_g_and_fields_and_their_labels_the_lables_of_and(String loginTitle, String email, String password, String loginBtn, String disclaimer, String register, String forgotPass) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String lpTitle = lp.checkLoginPageTitle().getText();
        System.out.println("Title is: " + lpTitle);

        String eLabel = lp.checkEmailLabel().getText();
        System.out.println("Email label is: " + eLabel);

        String pLabel = lp.checkPassLabel().getText();
        System.out.println("Password label is: " + pLabel);

        String lBtn = lp.clickLoginBtn().getText();
        System.out.println("Login Btn text is: " + lBtn);

        String disClaimer = lp.checkDisclaimerText().getText();
        System.out.println("Disclaimer is: " + disClaimer);

        String reg = lp.checkRegisterText().getText();
        System.out.println("Regiser Text is: " + reg);

        String fPass = lp.checkForgotPassText().getText();
        System.out.println("Forgot pass is: " + fPass);

        Thread.sleep(5000);
        Assert.assertTrue(lpTitle.contains(loginTitle));
        Assert.assertTrue(eLabel.contains(email));
        Assert.assertTrue(pLabel.contains(password));
        Assert.assertTrue(lBtn.contains(loginBtn));
        Assert.assertTrue(disClaimer.contains(disclaimer));
        Assert.assertTrue(reg.contains(register));
        Assert.assertTrue(fPass.contains(forgotPass));

        driver.quit();
    }

    //********************* Steps definitions for KYC Feature File picker **********************
    @When("User clicks on profile icon and then username")
    public void user_clicks_on_profile_icon_and_then_username() throws InterruptedException {

        kycObj = new kycPage_Objects(driver);

        Thread.sleep(3000);
        kycObj.clickProfileImage();
        Thread.sleep(1000);
        kycObj.clickProfileUserName();


    }

    @When("clicks on profile link")
    public void clicks_on_profile_link() throws InterruptedException {
        Thread.sleep(3000);
        kycObj.clickDashBoardProfileLink();
    }

    @When("clicks on KYC application link")
    public void clicks_on_kyc_application_link() throws InterruptedException {
        Thread.sleep(2000);
        kycObj.clickKycApplicationLink();
    }

    @Then("User lands on Profile Dashboard page")
    public void user_lands_on_profile_dashboard_page() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Chiragh - Dashboard Home", kycObj.getPageTitle());

    }

    @Then("User lands on the KYC application form")
    public void user_lands_on_the_kyc_application_form() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Chiragh - KYC", kycObj.getPageTitle());

    }

    @Then("provide KYC form details")
    public void provide_kyc_form_details() throws InterruptedException {
        Thread.sleep(1000);
        String randomName = randomString();
        String randomNumber = randomNumers();

        Thread.sleep(2000);
        kycObj.setSetCompanyName(randomName);
        Thread.sleep(3000);

        kycObj.setTradeLno(randomNumber);

        Thread.sleep(3000);
        driver.quit();

    }

    @Then("click on Submit button")
    public void click_on_submit_button() {

    }

    @Then("User can see {string} as a success message")
    public void user_can_see_as_a_success_message(String string) {

    }

    @Then("Close the browser")
    public void close_the_browser() {

    }

}
