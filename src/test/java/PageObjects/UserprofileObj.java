package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserprofileObj {

    //*********   WEBDRIVER INITIALIZATION  ************//

    WebDriver driver;

    public UserprofileObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    //********* Profile Element to get Text   ************//

    @FindBy(linkText = "Profile Info")
    @CacheLookup
    WebElement Profile_Info_Tab;

    //********* KYC request Element   ************//

    @FindBy(xpath = "//a[contains(text(),'KYC Application')]")
    @CacheLookup
    WebElement KYC_Application_Tab;

    //********* OD request Element to get Text   ************//

    @FindBy(xpath = "//a[contains(text(),'OD Request')]")
    @CacheLookup
    WebElement OD_Request_Tab;//input[name="file"]

    //********* Profile Image icon Element   ************//

    @FindBy(css = "input[name=\"file\"]")
    @CacheLookup
    WebElement ProfileImageIcon;//

    //********* Profile Image icon Element   ************//

    @FindBy(css = ".row:nth-child(4) .svg-inline--fa")
    WebElement PasswordVisibiltyBtn;//

    //********* Current password input field Element   ************//

    @FindBy(css = "input[name=\"currentPassword\"]")
    WebElement CurrentPasswordInputField;

    //********* Current password input field Element   ************//

    @FindBy(xpath = "//p[contains(text(),'Current Password')]")
    WebElement CurrentPasswordElement;

    //*********   ACTION METHODS  ************//

    //*********   ACTION METHODS Profile Info ************//

    public WebElement ProfileInfo() {
        return this.Profile_Info_Tab;
    }

    //*********   ACTION METHODS Profile Info ************//

    public WebElement Kyc() {
        return this.KYC_Application_Tab;
    }
    //*********   ACTION METHODS Profile Info ************//

    public WebElement OD_Request() {
        return this.Profile_Info_Tab;
    }

    //*********   ACTION METHODS Profile picture Icon**********///
    public WebElement Profile_icon() {
        return this.ProfileImageIcon;

    }

    //*********   ACTION METHODS Password visibilty  button******//
    public void Password_VisibiltyBtn() throws InterruptedException {
        int i;
        for (i = 0; i < 2; i++) {
            PasswordVisibiltyBtn.click();
            Thread.sleep(1000);
        }

    }

    //*********   ACTION METHODS  CurrentPasswordInputField ******//

    public void EnterCurrentPassword(String CP) {
        CurrentPasswordInputField.sendKeys(CP);

    }
    //*********   ACTION METHODS  CurrentPasswordElement ******//

    public void ClickCurrentPassword() {
        CurrentPasswordElement.click();

    }

}
