package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class steps_loginPage {
    WebDriver driver;



    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://test.chiragh.com/login");
        String title = driver.getTitle();
        System.out.println("Title is: "+title) ;

        Assert.assertEquals("Login to Chiragh Property Porta", title);
        driver.quit();

    }
}
