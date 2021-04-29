package stepDefinitions;

import PageObjects.forgotPassword;
import PageObjects.kycPage_Objects;
import PageObjects.loginPage_Objects;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

public class steps_loginPage extends BaseClass {
    Faker faker = new Faker();

    String incorporationPlace = faker.address().city();
    String companyAddress = faker.address().fullAddress();
    String bOwnerName = faker.name().fullName().replaceAll("[^A-Za-z]", "");
    String companyName = faker.company().name();
    WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

//        String browser = System.getProperty("browser");


       // System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        String browser = System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/linux/chromedriver");
         //String browser = System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome-stable");
        logger= Logger.getLogger("ChiraghCucumber");
     PropertyConfigurator.configure("log4j.properties");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                //chromeOptions.addArguments("--headless");
              //  chromeOptions.addArguments("--no-sandbox");
                chromeOptions.setHeadless(true);
                chromeOptions.addArguments("--disable-infobars");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--ignore-certificate-errors");
                chromeOptions.addArguments("--ignore-certificate-errors");
               driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
//    public void setup() throws IOException {
//        //Reading properties class
//        configProp=new Properties();
//        FileInputStream configPropFile = new FileInputStream("config.properties");
//        configProp.load(configPropFile); //Loading file into file input stream
//
//
//        String bName = configProp.getProperty("browser");
//
//        logger= Logger.getLogger("ChiraghCucumber"); //Added Logger
//        PropertyConfigurator.configure("log4j.properties");
//
//        if(bName.equals("chrome")){
//            System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
//            driver = new ChromeDriver();
//        }
//        else if(bName.equals("firefox")){
//            System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxPath"));
//            driver = new FirefoxDriver();
//        }else if(bName.equals("ie")){
//            System.setProperty("webdriver.gecko.driver", configProp.getProperty("iePath"));
//            driver = new FirefoxDriver();
//        }
//
//
//        logger.info("********************* Launching Browser *********************");
//    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        lp = new loginPage_Objects(driver);

        logger.info("********************* Opening URL *********************");
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
        driver.manage().window().maximize();
        logger.info("********************* Providing username and password *********************");
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
    //if(kycObj.iFrameVisible().isDisplayed())

      //  kycObj.removeIframe();

        //Thread.sleep(2000);
        kycObj.setSetCompanyName(randomName);
        //Thread.sleep(2000);

        kycObj.setTradeLno(randomNumber);

        //Thread.sleep(2000);
        kycObj.setClickOnDate();

        //Thread.sleep(2000);
        kycObj.clickOnPrevMonth();

        //Thread.sleep(2000);
        kycObj.setClickSelectedDate();

        //Thread.sleep(1000);
        kycObj.setIncorpPlace(incorporationPlace);

        //Thread.sleep(1000);
        kycObj.setCompanyName(companyAddress);

        //Thread.sleep(1000);
        kycObj.setBeneOwnerName(bOwnerName);

        //Thread.sleep(2000);
        kycObj.ClickNationality();

        //Thread.sleep(2000);
        kycObj.setNationality("Pakistani");

        // Thread.sleep(2000);
        kycObj.fileUpload(0);

        //Thread.sleep(2000);
        kycObj.fileUpload(1);

        // Thread.sleep(2000);
        // kycObj.fileUpload(2);

        //  Thread.sleep(2000);
        kycObj.fileUpload(3);
        Thread.sleep(3000);
        //Are you US citizen
        kycObj.clickUsDropDown();
        kycObj.SetUsDropDown("Yes");
        kycObj.clickYesNo();
        Thread.sleep(4000);
        kycObj.fileUpload(5);
        kycObj.fileUpload(6);
        Thread.sleep(2000);
        //Do you remit money from sanctioned countries.
        kycObj.clickRemitDropDown();
        kycObj.SetRemitDropDown("Yes");
        kycObj.clickYesNoRemit();



        //Thread.sleep(2000);

        //  kycObj.setStatusDD(0, 0,"Yes");
        //   kycObj.setStatusDD(1, 1,"Yes");

//        Thread.sleep(4000);
//        kycObj.setStatusDD(1, "No");

        Thread.sleep(5000);


    }

    @Then("click on Submit button")
    public void click_on_submit_button() {
kycObj.clickSubmitBtn();
    }

    @Then("User can see {string} as a success message")
    public void user_can_see_as_a_success_message(String string) {

    }

    @Then("Close the browser")
    public void close_the_browser() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

    @Then("User can see {string},{string}, {string}, {string},{string},{string}, {string}, {string}, {string}, {string}, {string}, {string} and {string},")
    public void user_can_see_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13) {
        kycObj.getErrorMsg(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13);
    }

    @Then("User enters Company Name to make company related fields enable")
    public void user_enters_company_name_to_make_company_related_fields_enable() {
        kycObj.setSetCompanyName(companyName);

    }

    //============Step Definitions for Forgot Password Feature file=====================

    @When("clicks on the Forgot Password link")
    public void clicks_on_the_link() throws InterruptedException {
        fPass = new forgotPassword(driver);

        fPass.clickfPassLink();
        Thread.sleep(3000);
    }

    @Then("verify that user is redirected to {string} Page")
    public void verify_that_user_is_redirected_to_page(String string) {

    }

    @Then("when user enters an {string}")
    public void when_user_enters_an(String email) throws InterruptedException {
        fPass.setFpassEmail(email);
        Thread.sleep(3000);
    }

    @Then("clicks on Submit button")
    public void clicks_on_submit_button() throws InterruptedException {
        fPass.clickfPassSubmitBtn();
        Thread.sleep(10000);
    }

    @Then("user opens the email and clicks on the reset password link")
    public void user_opens_the_email_and_clicks_on_the_reset_password_link() throws Exception {

        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://test.chiragh.com/resetPassword/515fd0e96707b30af757cc2dfde7b0af");
        Thread.sleep(5000);

        //        EmailUtils emailUtils = new EmailUtils();
//        Properties prop = new Properties();
//        prop.load(new FileInputStream("/Users/adnan/Desktop/Projects/SeleniumJava/config/conf.properties"));
//
//        Store connection =emailUtils.connectToGmail(prop);
//        // List emails= emailUtils.getMessageBySubjectLine(connection,"Inbox","Forgot Your Chiragh Password?");
//        //   List<ArrayList> emails= new ArrayList<>() ;
//        //int  size= emailUtils.getMessageBySubjectLine(connection,"Inbox","Forgot Your Chiragh Password?").size();
//        //   List<String> msgs= emailUtils.getMessageContent(connection,"Inbox");
//        List<String> emails= emailUtils.getMessageByFromEmail(connection,"Inbox", "support@chiragh.com","Forgot Your Chiragh Password?");
//
//        //   List<String> emails = emailUtils.getMessageBySubjectLine(connection,"Inbox", "Forgot Your Chiragh Password?");
//        //  String link = emailUtils.getUrlsFromMessage(email, "Click here to view the reason").get(0);
//        //  emailUtils.getUnreadMessages(connection,"Inbox");
//        // List<String> emailList;
//        //System.out.println(emailUtils.getMessageBySubjectLine(connection,"Inbox","Forgot Your Chiragh Password?").get(0));
//        //System.out.println(emailUtils.getMessageBySubjectLine(connection,"Inbox","Forgot Your Chiragh Password?").get(0));
//        //  emailList = emailUtils.getMessageByFromEmail(connection, "Inbox", "support@chiragh.com", "Forgot Your Chiragh Password?");
//        if(emails.size()<1) {
//            throw new Exception("No new email received");
//        }
//        else{
//            String regex = "(?<=href\\=\").*(?=\"\\>)";
//            // String[] arrLinks = email.get(0).split(regex);
//            //  String link = arrLinks[1];
//            //  System.out.println("I am here"+link);
//
//
//
//        }
    }

    @Then("verify that user is reset password screen")
    public void verify_that_user_is_reset_password_screen() throws InterruptedException {
        String text = fPass.restPasswordTitle().getText();
        Assert.assertEquals("Reset Password?",text);
    }

    @Then("enters {string} and {string}")
    public void enters_and(String newPass, String cNewPass) throws InterruptedException {

        fPass.setNewPass(newPass);
        fPass.setConfirmPass(cNewPass);
        Thread.sleep(2000);
    }

    @Then("clicks on Reset Password button")
    public void clicks_on_reset_password_button() throws InterruptedException {
fPass.clickfResetPass();
Thread.sleep(5000);
    }

    @Then("verify that password has been changed successfully and user is redirected to Login page")
    public void verify_that_password_has_been_changed_successfully_and_user_is_redirected_to_login_page() throws InterruptedException {
kycPage_Objects kyc = new kycPage_Objects(driver);
Assert.assertEquals("Login to Chiragh Property Portal", kyc.getPageTitle());
Thread.sleep(2000);
driver.quit();
    }
}