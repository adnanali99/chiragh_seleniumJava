package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.RegistrationObj;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitHelper;

public class step_RegistrationPage {
    WebDriver driver;
    RegistrationObj RP;
    WaitHelper WP;

                //******  FirstName&LastnameValidations start from here ****//

//    @Given("I am on the RegistrationPage.")
//    public void i_am_on_the_Registration_page() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        driver = new ChromeDriver();
//        RP = new RegistrationObj(driver);
//        WP = new WaitHelper(driver);
//        driver.get("https://chiragh.com/register");
//        //Mazimize current window
//        driver.manage().window().maximize();
//        String title = driver.getTitle();
//        System.out.println("Title is: " + title);
//
//        Assert.assertEquals("Register at Chiragh to find your dream property online", title);
//        Thread.sleep(2000);
//
//    }
//        @When("The user enters firstname{string}")
//    public void the_user_enters_firstname(String input) throws InterruptedException {
//
//        RP.enterUserFirstName(input);
//        RP.TitleOfPageclick();
//        Thread.sleep(2000);
//    }
//
//    @Then("user should get FirstName validation {string}")
//    public void user_should_get_first_name_validation(String message) {
//
//        String ErrorMessage = RP.Error().getText();
//        System.out.println("Error is: " + ErrorMessage);
//        Assert.assertEquals(message, ErrorMessage);
//
//    }
//
//    @And("The user enters Lastname{string}")
//    public void theUserEntersLastname(String input) throws InterruptedException {
//        RP.EnterUserLastName(input);
//        RP.TitleOfPageclick();
//        Thread.sleep(2000);
//    }
//
//    @Then("user should get LastName validation {string}")
//    public void user_should_get_Last_name_validation(String message1) {
//
//        String ErrorMessage = RP.Error2().getText();
//        System.out.println("Error is: " + ErrorMessage);
//        Assert.assertEquals(message1, ErrorMessage);
//        driver.quit();
//    }

               //******* FirstName&LastnameValidations End here  *****//


               //******* Email_Validations Start from here *****//

//    @When("The user enters Email{string}")
//    public void theUserEntersEmail(String EmailInput) throws InterruptedException {
//        RP.enterUserEmail(EmailInput);
//        Thread.sleep(2000);
//        RP.TitleOfPageclick();
//        Thread.sleep(2000);
//
//    }
//
//    @Then("user should get Email validation {string}")
//    public void userShouldGetEmailValidation(String EmailMessage) throws InterruptedException {
//        WP.WaitForElement(RP.Error(), 5);
//        String ErrorMessage = RP.Error().getText();
//        System.out.println("Error is: " + ErrorMessage);
//        Assert.assertEquals(EmailMessage, ErrorMessage);
////        RP.NextButton1().click();
//        Thread.sleep(6000);
//        driver.quit();
//    }

                   //******* Email_Validations End here  *****//




                //******* Password_Validations start here  *****//

//    @When("The user enters PassWord{string}")
//    public void theUserEntersPassWord(String PasswordInput) throws InterruptedException {
//
//        RP.setUserPassword(PasswordInput);
//        Thread.sleep(2000);
//        RP.TitleOfPageclick();
//        Thread.sleep(2000);
//
//
//    }
//
//    @Then("user should get PassWord{string}")
//    public void userShouldGetPassWord(String PasswordMessage) {
//        if (PasswordMessage.contains("Password is required!")) {
//            String ErrorMessage = RP.Error().getText();
//            System.out.println("Error is: " + PasswordMessage);
//            Assert.assertEquals(PasswordMessage, ErrorMessage);
//        } else if (PasswordMessage.contains("Password must have atleast 8 characters including a uppercase, a lowercase, a number and a special character.")){
//            String ErrorMessage = RP.Error().getText();
//            System.out.println("Error is: " + PasswordMessage);
//            Assert.assertEquals(PasswordMessage, ErrorMessage);
//        }else {
//
//            System.out.println("password is: " + "correct");
//
//        }
//
//
//    }
//
//    @And("The user enters Confirm PassWord{string}")
//    public void theUserEntersConfirmPassWord(String ConfirmPasswordInput) throws InterruptedException {
//        RP.setUserConfirmPassword(ConfirmPasswordInput);
//        Thread.sleep(2000);
//        RP.NextButton1().click();
//
//
//
//    }
//
//    @And("user should get Confirm PassWord{string}")
//    public void userShouldGetConfirmPassWord(String ConfirmPasswordMessage) throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,800)", "");
//        Thread.sleep(4000);
//        String ErrorMessage = RP.Error1().getText();
//        System.out.println("Error is: " + ErrorMessage);
//        Assert.assertEquals(ConfirmPasswordMessage, ErrorMessage);
//        driver.quit();
//    }

                //******* PasswordValidations End here  *****//



                //******* Back button Validations start here  *****//

//    @Given("I am on second page of Registration by clicking on next button")
//    public void iAmOnTheRegistrationSecondPage() throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        driver = new ChromeDriver();
//
//        RP = new RegistrationObj(driver);
//        WP = new WaitHelper(driver);
//        driver.get("https://test.chiragh.com/register");
//        //Mazimize current window
//        driver.manage().window().maximize();
//
//        RP.enterUserFirstName("Atif");
//        Thread.sleep(1000);
//        RP.EnterUserLastName("Kamal");
//        Thread.sleep(1000);
//        RP.enterUserEmail("Atif231112@gmail.com");
//        Thread.sleep(1000);
//        RP.setUserPassword("Atif@100259");
//        Thread.sleep(1000);
//        RP.setUserConfirmPassword("Atif@100259");
//        Thread.sleep(1000);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RP.NextButton1());
//        WP.WaitForElement(RP.NextButton1(), 30);
//        RP.NextButton1().click();
//        Thread.sleep(4000);
//
//    }
//
//    @When("user is on second page")
//    public void userIsOnSecondPage() throws InterruptedException {
//        WP.WaitForElement(RP.SecondPageHeading(), 30);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-200)", "");
//        String title = RP.SecondPageHeading().getText();
//        System.out.println("Title is: " + title);
//        Assert.assertEquals("Welcome, Atif Kamal!", title);
//        Thread.sleep(4000);
//    }
//
//    @Then("user Get validation of back  button")
//    public void userGetValidationOfBackButton() throws InterruptedException {
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RP.Backbutton());
//        WP.WaitForElement(RP.Backbutton(), 10);
//        RP.Backbutton().click();
//        System.out.println("Back Button is clicked");
//        Thread.sleep(4000);
//        driver.quit();
//    }

    //******* Back button validation End here  *****//




    //******* Validation of Registration Second Page  *****//



    @Given("I am on the RegistrationSecondPage.")
    public void iAmOnTheRegistrationSecondPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        RP = new RegistrationObj(driver);
        WP = new WaitHelper(driver);
        driver.get("https://test.chiragh.com/register");
        //Mazimize current window
        driver.manage().window().maximize();

        RP.enterUserFirstName("Atif");
        Thread.sleep(1000);
        RP.EnterUserLastName("Kamal");
        Thread.sleep(1000);
        RP.enterUserEmail("Atif23112@gmail.com");
        Thread.sleep(1000);
        RP.setUserPassword("Atif@100259");
        Thread.sleep(1000);
        RP.setUserConfirmPassword("Atif@100259");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RP.NextButton1());
        WP.WaitForElement(RP.NextButton1(), 30);
        RP.NextButton1().click();
        Thread.sleep(4000);
        WP.WaitForElement(RP.SecondPageHeading(), 30);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-200)", "");
        String title = RP.SecondPageHeading().getText();
        System.out.println("Title is: " + title);
        Assert.assertEquals("Welcome, Atif Kamal!", title);
        Thread.sleep(4000);



    }


        //********** Mandatory Fields Validation Start here *******//
//
//    @When("The user click on Register button")
//    public void theUserClickOnRegistterButton() throws InterruptedException {
//        RP.Registerbutton().click();
//        Thread.sleep(4000);
//
//    }
//
//    @And("The user will get Validation")
//    public void theUserWillGetValidation() throws InterruptedException {
//        Thread.sleep(4000);
//        RP.ErrorSecPage();
//        driver.quit();
//
//    }


              //********** Mandatory Fields Validation End here *******//


            //********** Functional Check and Validation Start here *******//

    @When("Then  User can Fill all the Registration Second page elements e.g {string} , {string},{string},{string},{string},{string},{string} and {string} fields")
    public void thenUserCanFillAllTheRegistrationSecondPageElementsEGAndFields(String Nationalityopt, String CompleteAddress, String Pobox, String Country, String City, String CountryCode, String MobileNO, String PhoneNO) throws InterruptedException {
        Thread.sleep(2000);
        WP.WaitForElement(RP.ClickDOB(), 30);
        RP.ClickDOB().click();
        Thread.sleep(1000);
        WP.WaitForElement(RP.Datepicker(), 30);
        RP.Datepicker().click();
        Thread.sleep(1000);
        RP.PreviousButton().click();
        Thread.sleep(1000);
        RP.PickYear();
        Thread.sleep(1000);
        RP.PickMonthYear();
        Thread.sleep(1000);
        RP.PickDayMonthYear();
        Thread.sleep(1000);
        RP.SetNationality(Nationalityopt);
        Thread.sleep(1000);
        RP.EnterCompleteAddress(CompleteAddress);
        Thread.sleep(1000);
        RP.EnterPobox(Pobox);
        Thread.sleep(1000);
        RP.SetCountry(Country);
        Thread.sleep(2000);
        RP.SetCity(City);
        Thread.sleep(2000);
        RP.SetIdentificationTypeID();
        Thread.sleep(1000);
        RP.SetIdentificationTypePassPort();
        Thread.sleep(1000);
        RP.EnterPassportNO().sendKeys("AW2343222");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
        RP.ClickPassportExpiry().click();
        Thread.sleep(3000);
        RP.Datepicker2().click();
        Thread.sleep(1000);
        RP.PassportPickYear();
        Thread.sleep(1000);
        RP.PassportPickMonthYear();
        Thread.sleep(1000);
        RP.PassportPickDayMonthYear();
        Thread.sleep(1000);
        RP.EnterMobileCode(CountryCode);
        Thread.sleep(1000);
        RP.EnterMobileNO(MobileNO);
        Thread.sleep(1000);
        RP.EnterPhoneCode(CountryCode);
        Thread.sleep(1000);
        RP.EnterPhoneNO(PhoneNO);
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RP.TermBox());
        Thread.sleep(2000);
        RP.TermBox().click();
        Thread.sleep(2000);



    }
    @Then("The user Successfully Receive the form Submission Messages")
    public void theUserSuccessfullyReceiveTheFormSubmissionMessage() throws InterruptedException {
        WP.WaitForElement(RP.Registerbutton(), 10);
        RP.Registerbutton().click();
        Thread.sleep(2000);
        RP.TextProceedPopUpWind();
        WP.WaitForElement(RP.ProceedButton(), 10);
        RP.ProceedButton().click();
        Thread.sleep(5000);
        RP.TextOnLastpage();
       Thread.sleep(2000);
        WP.WaitForElement(RP.ResendButton(), 10);
        RP.ResendButton().click();

    }


    @Then("The user will get the Resend button click validation")
    public void theUserWillGetTheResendButtonClickValidation() {
        WP.WaitForElement(RP.ResendButton(), 10);
        RP.ResendButton().click();
        System.out.println("Resend Button is clicked");
        driver.quit();

    }
}


                       //********** Functional Check and Validation End here **********//




                 //******* USEFUll CODE NOTATION   *******//

 //        JavascriptExecutor js = (JavascriptExecutor) driver;
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Webelement);
//        WP.WaitForElement(Webelement, 10);
///      String index1 = driver.getWindowHandle();
//      System.out.println("Current INdex"+index1);
//       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Webelement);
//       js.executeScript("window.scrollBy(0,-60)", "");








