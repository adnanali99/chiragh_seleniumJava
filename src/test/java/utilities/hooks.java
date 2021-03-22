package utilities;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.loginPage_Objects;
import stepDefinitions.steps_loginPage;

public class hooks {
  //public WebDriver driver;
  //  public steps_loginPage sp;
    @Before
    public void beforeScenario(){
//        System.out.println("This will run before the Scenario");
//        sp.driver = new ChromeDriver();
//       // sp = new steps_loginPage();
//       sp.driver.manage().window().maximize();
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
