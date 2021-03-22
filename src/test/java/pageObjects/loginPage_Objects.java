package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_Objects {

    public WebDriver Idriver;

    public loginPage_Objects(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }
    //Email field
    @FindBy(xpath = "//*[@id='stuff']")
    @CacheLookup
    WebElement userName_input;

    //Password field
    @FindBy(xpath = "//*[@id='stuwff']")
    @CacheLookup
    WebElement password_input;

    //Login Button
    @FindBy(css = "[class='btn primaryBlueBtn from-left w-100']")
    @CacheLookup
    WebElement loginBtn;

    //Invalid email/password message
    @FindBy(css = "div[class='red-error text-center']")
    @CacheLookup
    WebElement invalidEmailPassMsg;

    //Not a valid email format like asd123123
    @FindBy(css = "div[class='red-error']")
    @CacheLookup
    WebElement invalidEmail;

    //Email field label
    @FindBy(css = "label[class='trasctionBd']")
    @CacheLookup
    WebElement emailLabel;

    //Password field label
    @FindBy(xpath = "//label[contains(text(),'Password')]")
    @CacheLookup
    WebElement passlabel;

    //Login page heading title
    @FindBy(xpath = "//h1[contains(text(),'Log In')]")
    @CacheLookup
    WebElement loginPageTitle;

    //Disclaimer text underneath email and password fields
    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/p[1]")
    @CacheLookup
    WebElement disclaimerText;

    //Not a Chiragh user texr
    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/p[1]")
    @CacheLookup
    WebElement registerText;

    //Registration link on login page
    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-login[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/p[1]/a[1]")
    @CacheLookup
    WebElement registerLink;

    //Forgot Password?
    @FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
    @CacheLookup
    WebElement forgotPassText;

    //Round profile button on homepage on top right corner
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[3]/div[3]/div[1]/span[1]/img[1]")
    @CacheLookup
    WebElement profilIcon;

    //Logout button once user is logged in
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/a[2]")
    @CacheLookup
    WebElement logOut;

    // Object locators for date picker
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/a[1]/p[1]")
    @CacheLookup
    WebElement profileLink;

    //Profile like on the dashboard page under Home link on the left side of the page
    @FindBy(xpath = "//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
    @CacheLookup
    WebElement DashBoardProfileLink;


    //KYC Application link in the center
    @FindBy(xpath = "//a[contains(text(),'KYC Application')]")
    @CacheLookup
    WebElement KYCapplicationLink;

    //KYC form title
    @FindBy(xpath = "//h2[contains(text(),'KYC Application Form')]")
    @CacheLookup
    WebElement TitleKYC;

    // *********KYC FORM FIELDS STARTS HERE*********************

    //Set Company Name
    @FindBy(id = "companyName")
    @CacheLookup
    WebElement setCompanyName;

    //Set Trade License number
    @FindBy(id = "TRADE")
    @CacheLookup
    WebElement setTradeLno;

    //Date of Incorporation
    @FindBy(xpath = "//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[2]/div[3]/div[1]/input[1]")
    @CacheLookup
    WebElement clickOnDate;

    public loginPage_Objects() {
    }


    //Action Methods for login page web elements

    public void Username(String username) {
        this.userName_input.sendKeys(username);
    }

    public void setPass(String password) {
        this.password_input.sendKeys(password);
    }

    public WebElement clickLoginBtn() {
        return this.loginBtn;
    }

    public WebElement checkError() {

        return this.invalidEmailPassMsg;
    }

    public WebElement invalidEmailCheck() {
        return this.invalidEmail;

    }

    public WebElement checkEmailLabel() {
        return this.emailLabel;
    }

    public WebElement checkPassLabel() {
        return this.passlabel;
    }

    public WebElement checkLoginPageTitle() {
        return this.loginPageTitle;
    }

    public WebElement checkDisclaimerText() {
        return this.disclaimerText;
    }

    public WebElement checkRegisterText() {
        return this.registerText;
    }

    public WebElement checkForgotPassText() {
        return this.forgotPassText;
    }

    public void clickProfileIcon() {
        this.profilIcon.click();
    }

    public WebElement clickLogout() {
        return this.logOut;
    }
    public void clickOnRegister() {
         this.registerLink.click();
    }
}
