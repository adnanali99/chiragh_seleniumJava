package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RegistrationObj {

    //********* Heading Element of Page ************//

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    @CacheLookup
    WebElement TitleOfPage;




    //********* Error Element  ************//

    @FindBy(css = "div[class='red-error']")
    @CacheLookup
    WebElement Error;

    //********* Error Element No.1  ************//

    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-registerstep1[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[2]")
    @CacheLookup
    WebElement Error1;

    //********* Error Element N0.2 ************//

    @FindBy(xpath = "//div[contains(text(),'Last Name is required!')]")
    @CacheLookup
    WebElement Error2;

    //********* Error SecPage Array of Elements ************//
    @FindBy(css = "div[class='red-error']")
    List<WebElement> ErrorSecPage;

    //********* User First Name Text Field Element ************//

    @FindBy(css = "input[name=\"userFirstName\"]")
    @CacheLookup
    WebElement UserFirstName;

    //********* User Last Name Text Field Element************//

    @FindBy(css = "input[name=\"userlastName\"]")
    @CacheLookup
    WebElement UserLastName;

    //********* User EMail Text Field Element ************//

    @FindBy(css = "input[name=\"userEmail\"]")
    @CacheLookup
    WebElement UserEmail;

    //********* User Password Text Field Element ************//

    @FindBy(css = "input[name=\"userPassword\"]")
    @CacheLookup
    WebElement UserPassword;

    //********* User Confirm Password Text Field Element ************//

    @FindBy(css = "input[name=\"userConfirmPassword\"]")
    @CacheLookup
    WebElement UserConfirmPassword;

    //********* confirmPassword Click Element ************//
    @FindBy(css = "div:nth-of-type(12)>div:nth-of-type(1)>div")
    @CacheLookup
    WebElement confirmPasswordelement;

    //********* Next Button1 Element ************//

    @FindBy(css = "[class='btn primaryBlueBtn from-left w-100']")
    @CacheLookup
    WebElement NextBtn1;
    //********* Next Button2 Element ************//

    @FindBy(css = "[class='btn primaryBlueBtn from-left w-100']")
    @CacheLookup
    WebElement Nextbtn2;

    //********* Second Page Element ************//


    //********* SecondPageHeading Element ************//

    @FindBy(css = "h1")
    @CacheLookup
    WebElement SecondPageHeading;

    //********* Date of Birth Element  ************//

    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-registerstep1[1]/section[1]/div[1]/div[1]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    WebElement Dob;

    //********* Span Element for selection of Year ************//
    @FindBy(css = ".owl-dt-control-period-button > .owl-dt-control-content")
    @CacheLookup
    WebElement Date_picker;
    //********* Span Element for selection of Year  ************//
    @FindBy(css = ".owl-dt-control-period-button > .owl-dt-control-content")
    @CacheLookup
    WebElement Date_picker2;

    //********* Button for selection of Previous 21 Year ************//

    @FindBy(css = "button[aria-label=\"Previous 21 years\"]>span>svg")
    @CacheLookup
    WebElement PreviousButton;

    //********* Button for selection of Year  ************//

    @FindBy(css = "td[aria-label=\"1995\"]>span")
    @CacheLookup
    WebElement PickYear;

    //********* Button for selection Month Year ************//

    @FindBy(css = "td[aria-label=\"July 1995\"]>span")
    @CacheLookup
    WebElement Pickmonth_Year;

    //********* Button for selection Day Month Year ************//

    @FindBy(css = "td[aria-label=\"July 12, 1995\"]>span")
    @CacheLookup
    WebElement Pickday_month_year;

    //********* Input+Selection Nationality Field ************//

    @FindBy(css = "ng-select[name=\"nationality\"]>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>input")
    @CacheLookup
    WebElement Nationality;

    //********* Address Input Text Field Element ************//

    @FindBy(css = "input[name=\"address\"]")
    @CacheLookup
    WebElement AddressInput;

    //********* Pobox Input Text Field Element ************//

    @FindBy(css = "input[name=\"poBox\"]")
    @CacheLookup
    WebElement PoBoxInput;

    //********* Input+Selection Country Field ************//

    @FindBy(css = "ng-select[name=\"country\"]>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>input")
    @CacheLookup
    WebElement CountryInput;

    //********* Input+Selection City Field ************//

    @FindBy(css = "ng-select[name=\"city\"]>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>input")
    @CacheLookup
    WebElement CityInput;

    //********* Input+Selection Identification Field ************//

    @FindBy(css = "ng-select[name=\"identificationType\"]>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>input")
    @CacheLookup
    WebElement Identification_type;

    //********* Passport_No Input Text Field Element ************//

    @FindBy(css = "input[name=\"passportNo\"]")
    @CacheLookup
    WebElement Passport_NoInput;

    //********* Passport Expiry Element ************//
    @FindBy(css = "input[name=\"passportExpiryDate\"]")
    @CacheLookup
    WebElement PassportExpiryDate;
    //********* Button for selection of Next 21 Year ************//

//    @FindBy(css = "button[aria-label=\"Next 21 years\"]>span>svg")
//    @CacheLookup
//    WebElement FarwardButton;

    //********* Button for selection of Year ************//

    @FindBy(css = "td[aria-label=\"2028\"]>span")
    @CacheLookup
    WebElement PickPPExpYear;

    //********* Button for selection of Month and Year ************//

    @FindBy(css = "td[aria-label=\"August 2028\"]>span")
    @CacheLookup
    WebElement PickPPExpmonth_Year;

    //********* Button for selection of Day Month and Year  ************//

    @FindBy(css = "td[aria-label=\"August 19, 2028\"]>span")
    @CacheLookup
    WebElement PickPPExpday_month_year;

    //********* Input+Selection Mobile Code Field ************//

    @FindBy(css = "ng-select[name=\"mobileCode\"]>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>input")
    @CacheLookup
    WebElement MobileCode;

    //********* Input Text Mobile No Field ************//

    @FindBy(css = "input[name=\"mobileNo\"]")
    @CacheLookup
    WebElement MobileNoinput;

    //********* Input+Selection Phone Code Field ************//

    @FindBy(css = "ng-select[name=\"phoneCode\"]>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>input")
    @CacheLookup
    WebElement PhoneCode;

    //********* Input text Phone No Field ************//

    @FindBy(css = "input[name=\"phoneNo\"]")
    @CacheLookup
    WebElement PhoneNoinput;

    //********* CheckBox Element for Term and Condition ************//

    @FindBy(css = "input[name=\"terms\"]")
    @CacheLookup
    WebElement TermBox;

    //********* Register Button Element  ************//

    @FindBy(css = ".col-6:nth-child(2) .btn")
    @CacheLookup
    WebElement RegisterBtn;
    //********* Back Button Element  ************//

    @FindBy(css = ".col-6:nth-child(1) .btn")
    @CacheLookup
    WebElement BackBtn;

    //********* Proceed Button Element  ************//

    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-registerstep1[1]/div[1]/div[1]/div[1]/div[3]/button[2]")
    @CacheLookup
    WebElement Proceed_Btn;

    //********* Textbox Element to get Text   ************//

    @FindBy(css = "#exampleModalLabel")
    @CacheLookup
    WebElement PopUpTextbox1;

    //********* Textbox Element to get Text ************//

    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-registerstep1[1]/div[1]/div[1]/div[1]/div[2]/h6[1]")
    @CacheLookup
    List<WebElement> PopUpTextbox2;

    //********* Textbox Element to get Text  ************//

    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-registerstep1[1]/div[1]/div[1]/div[1]/article[1]")
    @CacheLookup
    List<WebElement> PopUpTextbox3;

    //********* Thanks Text Element to get Text of Thanks message ************//

    @FindBy(css = "[class='heading-for-registrattion ng-star-inserted']")
    @CacheLookup
    WebElement ThanksMessage;

    //********* RegistrationInfo text Element to get Text of RegistrationInfo ************//

    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-confirm-register[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
    @CacheLookup
    List<WebElement> RegistrationInfoMessage;

    //********* Resend Button Element  ************//

    @FindBy(css = "[class='btn primaryBlueBtn from-left sell-another w-25 d-block mx-auto']")
    @CacheLookup
    WebElement ReSendButton;


    //*********   ACTION METHODS  ************//

    //*********   WEBDRIVER INITIALIZATION  ************//

    WebDriver driver;

    public RegistrationObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //*********   ACTION METHODS Error ************//

    public WebElement Error() {
        return this.Error;
    }

    //*********   ACTION METHOD Error1 ************//

    public WebElement Error1() {
        return this.Error1;
    }

    //*********   ACTION METHOD Error2 ************//

    public WebElement Error2() {
        return this.Error2;
    }
    //*********   ACTION METHOD ErrorSecPage ************//

    public void ErrorSecPage() {
        int Size = ErrorSecPage.size();
        System.out.println(Size);
        for (WebElement x : ErrorSecPage) {
            System.out.println(x.getText());
        }

    }

    //*********   ACTION METHOD TitleOfPage ************//

    public void TitleOfPageclick() {
        TitleOfPage.click();
    }

    //*********   ACTION METHOD User First Name ************//

    public void enterUserFirstName(String Firstname) {

        UserFirstName.sendKeys(Firstname);

    }

    //*********   ACTION METHOD User Last Name ************//

    public void EnterUserLastName(String LastName) {

        UserLastName.sendKeys(LastName);
    }

    //*********   ACTION METHOD User User Email ************//

    public void enterUserEmail(String EmailInput) {
        UserEmail.sendKeys(EmailInput);
    }

    //*********   ACTION METHOD User User Password ************//

    public void setUserPassword(String Password) {
        UserPassword.sendKeys(Password);
    }

    //*********   ACTION METHOD User User Confirm Password ************//

    public void setUserConfirmPassword(String ConfirmPassword) {
        UserConfirmPassword.sendKeys(ConfirmPassword);
    }

    //*********   ACTION METHOD User confirm Password element ************//

    public WebElement ConfirmPasswordElement() {
        return this.confirmPasswordelement;
    }

    //*********   ACTION METHOD NextButton1 ************//

    public WebElement NextButton1() {
        return this.NextBtn1;
    }
    //*********   ACTION METHOD NextButton2 ************//

    public WebElement NextButton2() {
        return this.Nextbtn2;
    }

    //*********   ACTION METHOD Second Page Heading ************//

    public WebElement SecondPageHeading() {
        return this.SecondPageHeading;
    }

    //*********   ACTION METHOD Date of birth************//


    public WebElement ClickDOB() {
        return this.Dob;
    }

    //*********   ACTION METHOD Date Picker Element1 ************//

    public WebElement Datepicker() {
        return this.Date_picker;
    }

    //*********   ACTION METHOD Date Picker2 Element1 ************//

    public WebElement Datepicker2() {
        return this.Date_picker2;
    }

    //*********   ACTION METHOD Previous Button ************//

    public WebElement PreviousButton() {
        return this.PreviousButton;
    }

    //*********   ACTION METHOD Pick Year Button ************//

    public void PickYear() {
        PickYear.click();
    }

    //*********   ACTION METHOD Month Year Button ************//

    public void PickMonthYear() {
        Pickmonth_Year.click();
    }

    //*********   ACTION METHOD Day Month Year Button ************//

    public void PickDayMonthYear() {
        Pickday_month_year.click();
    }

    //*********   ACTION METHOD Setting up Nationality Field ************//

    public void SetNationality(String Nationalityoption) {
        Nationality.sendKeys(Nationalityoption);
        Nationality.sendKeys(Keys.ENTER);

    }

    //*********   ACTION METHOD Address Field ************//

    public void EnterCompleteAddress(String CompleteAddressText) {

        AddressInput.sendKeys(CompleteAddressText);
//        AddressInput.sendKeys(Keys.ENTER);

    }

    //*********   ACTION METHOD PoBox Field ************//

    public void EnterPobox(String Pobox) {

        PoBoxInput.sendKeys(Pobox);
//        PoBoxInput.sendKeys(Keys.ENTER);

    }

    //*********   ACTION METHOD Setting up Country Field ************//

    public void SetCountry(String CountryOpt) {

        CountryInput.sendKeys(CountryOpt);
        CountryInput.sendKeys(Keys.ENTER);

    }

    //*********   ACTION METHOD Setting up City Field ************//

    public void SetCity(String Cityopt) throws InterruptedException {

        CityInput.sendKeys(Cityopt);
        Thread.sleep(2000);
        CityInput.sendKeys(Keys.ENTER);

    }

    //*********   ACTION METHOD Setting up Identification Field as NIC ************//
    public void SetIdentificationTypeID() {

        Identification_type.sendKeys("National ID");
        Identification_type.sendKeys(Keys.ENTER);


    }

    //*********   ACTION METHOD Setting up Identification Field as Passport ************//

    public void SetIdentificationTypePassPort() {

        Identification_type.sendKeys("Passport");
        Identification_type.sendKeys(Keys.ENTER);


    }

    //*********   ACTION METHOD "enter passport NO" Field ************//

    public WebElement EnterPassportNO() {
        return this.Passport_NoInput;
    }

    //********** ACTION METHOD Click Expiry date*****//

    public WebElement ClickPassportExpiry() {
        return this.PassportExpiryDate;
    }

    //********** ACTION METHOD Pick Passport Expiry Year *****//

    public void PassportPickYear() {
        PickPPExpYear.click();
    }
    //********** ACTION METHOD Click Passport Expiry Month Year *****//

    public void PassportPickMonthYear() {
        PickPPExpmonth_Year.click();
    }

    //********** ACTION METHOD Click Passport Expiry Day Month Year *****//

    public void PassportPickDayMonthYear() {
        PickPPExpday_month_year.click();
    }

    //********** ACTION METHOD Setting up Mobile Code *****//

    public void EnterMobileCode(String Mobilecode) {

        MobileCode.sendKeys(Mobilecode);
        MobileCode.sendKeys(Keys.ENTER);

    }

    //********** ACTION METHOD Enter Mobile NO *****//

    public void EnterMobileNO(String Mobileno) {

        MobileNoinput.sendKeys(Mobileno);


    }

    //********** ACTION METHOD Setting up Phone code *****//

    public void EnterPhoneCode(String Phonecode) {

        PhoneCode.sendKeys(Phonecode);
        PhoneCode.sendKeys(Keys.ENTER);

    }

    //********** ACTION METHOD Enter Phone No *****//

    public void EnterPhoneNO(String Phoneno) {

        PhoneNoinput.sendKeys(Phoneno);


    }

    //********** ACTION METHOD Clicking TermBox *****//

    public WebElement TermBox() {
        return this.TermBox;
    }

    //********** ACTION METHOD Clicking Registration Button  *****//


    public WebElement Registerbutton() {
        return this.RegisterBtn;
    }
    public WebElement Backbutton() {
        return this.BackBtn;
    }

    //********** ACTION METHOD To print PopUpTextbox text  ********//

    public void TextProceedPopUpWind() {
        System.out.println(PopUpTextbox1.getText());


        int Size = PopUpTextbox2.size();
        System.out.println(Size);
        for (WebElement x : PopUpTextbox2) {
            System.out.println(x.getText());
        }
        int Size1 = PopUpTextbox3.size();
        System.out.println(Size1);
        for (WebElement y : PopUpTextbox3) {
            System.out.println(y.getText());
        }
    }

    //********** ACTION METHOD Clicking Proceed Button  *****//

    public WebElement ProceedButton() {
        return this.Proceed_Btn;
    }

    //********** ACTION METHOD To print Text On Lastpage  ********//

    public void TextOnLastpage() {
        System.out.println(ThanksMessage.getText());


        int Size2 = RegistrationInfoMessage.size();
        System.out.println(Size2);
        for (WebElement z : RegistrationInfoMessage) {
            System.out.println(z.getText());
        }
    }
    //********** ACTION METHOD Clicking Resend Button  *****//

    public WebElement ResendButton() {
        return this.ReSendButton;
    }
}


