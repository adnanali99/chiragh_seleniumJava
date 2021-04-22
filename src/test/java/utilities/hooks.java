package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
  //public WebDriver driver;
  //  public steps_loginPage sp;
    @Before
    public void beforeScenario(){
//        System.out.println("This will run before the Scenario");
//        sp.driver = new ChromeDriver();
//        sp = new steps_loginPage();
//       sp.driver.manage().window().maximize();
    }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
