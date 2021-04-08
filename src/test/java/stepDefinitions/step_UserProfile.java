package stepDefinitions;

import PageObjects.UserprofileObj;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LoginObj;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitHelper;

public class step_UserProfile {
    WebDriver driver;
    WaitHelper WP;
    LoginObj lp;
    UserprofileObj UP;

    @Given("The user is on the user dashboard")
    public void the_user_is_on_the_user_dashboard() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginObj(driver);
        WP = new WaitHelper(driver);
        UP = new UserprofileObj(driver);

        driver.get("https://test.chiragh.com/login");

        //Mazimize current window
        driver.manage().window().maximize();
        lp.Username("atif.kamal33@getnada.com");
        Thread.sleep(2000);
        lp.setPass("Atif123@@");
        lp.clickLoginBtn().click();
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println("Title is: " + title);

        Assert.assertEquals("Property Auction In Dubai - Chiragh.com", title);
        Thread.sleep(3000);


    }

    @When("The user click on DashBoard Profile Link")
    public void the_user_click_on_profile() throws InterruptedException {

        lp.clickProfileIcon();
        Thread.sleep(2000);
        lp.clickProfileLink();
        Thread.sleep(2000);
        lp.clickDashBoardProfileLink();
        Thread.sleep(2000);

    }


    //    @Then("The Three tabs  KYC application and Profile info and OD request tab are present")
//    public void the_two_tabs_kyc_and_profile_are_present() throws InterruptedException {
//        String ProfileInfo= UP.ProfileInfo().getText();
//        System.out.println(ProfileInfo);
//        Thread.sleep(2000);
//        String KYC= UP.Kyc().getText();
//        System.out.println(KYC);
//        Thread.sleep(2000);
//        String OD_Request= UP.OD_Request().getText();
//        System.out.println(OD_Request);
//        Thread.sleep(2000);
//        driver.quit();
//
//
//
//    }
//    @Then("The user will be able to see the details")
//    public void theUserWillBeAbleToSeeTheDetails() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//       js.executeScript("window.scrollBy(0,200)", "");
//       Thread.sleep(2000);
//       js.executeScript("window.scrollBy(0,350)", "");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,600)", "");
//        Thread.sleep(2000);
//        driver.quit();
//
//    }

//    @Then("The user will upload an profile icon file")
//    public void theUserWillUploadAnProfileIconFile() throws InterruptedException {
//        Thread.sleep(2000);
//        UP.Profile_icon().sendKeys("C:\\Users\\HP\\Downloads\\mypic.jpeg");
//        Thread.sleep(10000);
//        driver.quit();
//
//    }

    @Then("The user will see the Natinal Id or Passport no")
    public void theUserWillSeeTheNatinalIdOrPassport() throws InterruptedException {

        UP.Password_VisibiltyBtn();

        Thread.sleep(5000);
        driver.quit();

    }

}
