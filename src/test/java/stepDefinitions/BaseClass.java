package stepDefinitions;

import PageObjects.forgotPassword;
import PageObjects.kycPage_Objects;
import PageObjects.loginPage_Objects;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClass {
    public WebDriver driver;
    public loginPage_Objects lp;
    public kycPage_Objects kycObj;
    public forgotPassword fPass;
    public static Logger logger;
    public Properties configProp;

    public static String randomString(){
        String generateRandomString = RandomStringUtils.randomAlphabetic(8);
        return generateRandomString;
    }
    public static String randomNumers(){
        String generateRandomNumber = RandomStringUtils.randomNumeric(8);
        return generateRandomNumber;
    }
}
