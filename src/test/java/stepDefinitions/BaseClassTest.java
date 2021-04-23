package stepDefinitions;

import PageObjects.forgotPasswordTest;
import PageObjects.kycPage_ObjectsTest;
import PageObjects.loginPage_ObjectsTest;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClassTest {
    public WebDriver driver;
    public loginPage_ObjectsTest lp;
    public kycPage_ObjectsTest kycObj;
    public forgotPasswordTest fPass;
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
