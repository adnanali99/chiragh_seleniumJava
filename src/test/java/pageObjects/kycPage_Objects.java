package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class kycPage_Objects {
    public WebDriver ldriver;

    WaitHelper waithelper;

    public kycPage_Objects(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waithelper = new WaitHelper(ldriver);
    }
    //Round profile button on homepage on top right corner
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[3]/div[3]/div[1]/span[1]/img[1]")
    @CacheLookup
    WebElement profilIcon;

    //Profile link on the home page
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/a[1]")
    @CacheLookup
    WebElement profileLink;

    //Profile link on the dashboard page under Home link on the left side of the page
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
    @FindBy(css = "input[id='companyName']")
    @CacheLookup
    WebElement CompanyName;

    //Set Trade License number
    @FindBy(id = "TRADE")
    @CacheLookup
    WebElement TradeLno;

    //Date of Incorporation
    @FindBy(xpath = "//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[2]/div[3]/div[1]/input[1]")
    @CacheLookup
    WebElement clickOnDate;

    //********* Action Methods Starts Here *************

    public String getPageTitle(){
        return ldriver.getTitle();
    }

    public void clickProfileImage(){
        this.profilIcon.click();
    }

    public void clickProfileUserName(){
        this.profileLink.click();
    }

    public void clickDashBoardProfileLink(){
        this.DashBoardProfileLink.click();
    }

    public void clickKycApplicationLink(){
        this.KYCapplicationLink.click();
    }

    public void setSetCompanyName(String comName){
        this.CompanyName.sendKeys(comName);
    }
    public void setTradeLno(String tLicenseNo){
        this.TradeLno.sendKeys(tLicenseNo);
    }


}
