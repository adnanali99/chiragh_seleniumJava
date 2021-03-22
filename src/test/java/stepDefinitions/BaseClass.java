package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.kycPage_Objects;
import pageObjects.loginPage_Objects;

public class BaseClass {
    public WebDriver driver;
    public loginPage_Objects lp;
    public kycPage_Objects kycObj;

    public static String randomString(){
        String generateRandomString = RandomStringUtils.randomAlphabetic(8);
        return generateRandomString;
    }
    public static String randomNumers(){
        String generateRandomNumber = RandomStringUtils.randomNumeric(8);
        return generateRandomNumber;
    }
}
