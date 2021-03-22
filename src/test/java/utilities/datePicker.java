package utilities;

import components.DatePicker;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import pageObjects.loginPage_Objects;

import java.time.LocalDate;
import java.time.Month;

public class datePicker extends loginPage_Objects{
    public WebDriver driver;

    //driver = new ChromeDriver();

 //   public void
//@BeforeAll
public void launchApp(){
        driver.get("https://test.chiragh.com/login");
}

@Test
    public void pastDate(){
   var dateToSelect =  LocalDate.of(2020, Month.DECEMBER,20);

   new DatePicker(driver).chooseDate(dateToSelect);
    }


    public void futureDate(){

    }


    public void currentDate(){

    }
}
