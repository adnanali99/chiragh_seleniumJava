package base;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class baseClass {
    public  static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        //WebDriverManager.Chromedriver().setup();
        //driver = new ChromeDriver();

    }
}
