package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseClass;
import utilities.WaitHelper;

public class forgotPassword {
    public WebDriver ldriver;
    WaitHelper waithelper;

    public forgotPassword(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waithelper = new WaitHelper(ldriver);
    }
    //Click on forgot password link on login page
    @FindBy(xpath = "//div[@class='col-sm-4 forgot']")
    @CacheLookup
    WebElement fPassword;

    //Click on forgot password link on login page
    @FindBy(xpath = "//input[@name='email']")
    @CacheLookup
    WebElement fPassEmail;

    //Click on forgot password link on login page
    @FindBy(xpath = " //button[@type='submit']")
    @CacheLookup
    WebElement fPassSubmit;

//Verify form title of reset password page
    @FindBy(css = "form[class=\"ng-untouched ng-pristine ng-invalid\"] h1")
    @CacheLookup
    WebElement resetPassTitile;

    //Enter new password field
    @FindBy(xpath = "//input[@name='userPassword']")
    @CacheLookup
    WebElement EnterNewPass;

    //Confirm new password
    @FindBy(xpath = "//input[@name='userconfirmPassword']")
    @CacheLookup
    WebElement ConfirmNewPass;

    //Click on reset password button
    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement ResetPassBtn;


    //******************Action Methods***********************
    public void clickfPassLink() {

        waithelper.WaitForElement(fPassword, 30);
        this.fPassword.click();
    }
    public void setFpassEmail(String pass) {

        waithelper.WaitForElement(fPassEmail, 30);
        this.fPassEmail.sendKeys(pass);
    }

    public void clickfPassSubmitBtn() {

        waithelper.WaitForElement(fPassSubmit, 30);
        this.fPassSubmit.click();
    }
    public WebElement restPasswordTitle() {

        waithelper.WaitForElement(resetPassTitile, 30);
        return resetPassTitile;
    }
    public void setNewPass(String newpass) {

        waithelper.WaitForElement(EnterNewPass, 30);
        this.EnterNewPass.sendKeys(newpass);
    }
    public void setConfirmPass(String confrimNewPass) {

        waithelper.WaitForElement(ConfirmNewPass, 30);
        this.ConfirmNewPass.sendKeys(confrimNewPass);
    }
    public void clickfResetPass() {

        waithelper.WaitForElement(ResetPassBtn, 30);
        this.ResetPassBtn.click();
    }
}
