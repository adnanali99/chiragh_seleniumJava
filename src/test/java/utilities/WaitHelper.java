package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    public WebDriver driver;

    public WaitHelper(WebDriver driver){
        this.driver = driver;
    }

    public void WaitForElement(WebElement element, long timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f39def6bbd2518ac55f4a9cae3afe81c665cb463
