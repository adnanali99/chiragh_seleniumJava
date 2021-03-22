package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class RegistrationObj {

    //    @FindBy(xpath = "//div[contains(text(),'First Name is required!')]")
//    @CacheLookup
//    WebElement First_Name_is_required;
//    @FindBy(xpath = "//div[contains(text(),'First Name must be at least 3 characters long.')]")
//    @CacheLookup
//    WebElement First_Name_must_3charachter;
//    @FindBy(xpath = "//div[contains(text(),'First Name is not valid!')]")
//    @CacheLookup
//    WebElement First_Name_is_not_valid;
    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-registerstep1[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    @CacheLookup
    WebElement Error;
    @FindBy(xpath = "//body/app-root[1]/app-core[1]/app-registerstep1[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    WebElement UserFirstName;
//    @FindBy(name = "userlastName")
//    @CacheLookup
//    WebElement UserLastName;
//    @FindBy(name = "userEmail")
//    @CacheLookup
//    WebElement userEmail;
//    @FindBy(name = "userPassword")
//    @CacheLookup
//    WebElement UserPassword;
//    @FindBy(name = "userConfirmPassword")
//    @CacheLookup
//    WebElement userConfirmPassword;
//    @FindBy(xpath = "//button[contains(text(),'Next')]")
//    @CacheLookup
//    WebElement Btn_Next;
//    @FindBy(name="dob")
//    @CacheLookup
//    WebElement Dob;
//    @FindBy(id="owl-dt-picker-0")
//    @CacheLookup
//    WebElement Date_picker;
//    @FindBy(xpath="")
//    @CacheLookup
//    WebElement Choose_month_and_year;
//    @FindBy(css="[aria-label="Previous 21years"]")
//    @CacheLookup
//    WebElement prev_btn;
//    @FindBy(css="[aria-label="2001"]")
//    @CacheLookup
//    WebElement Year;
//    @FindBy(css="[aria-label="August 2001"]")
//    @CacheLookup
//    WebElement month_Year;
//    @FindBy(css="[aria-label="August 17,2001"]")
//    @CacheLookup
//    WebElement day_month_year;
//    @FindBy(name="nationality")
//    @CacheLookup
//    WebElement Nationality;
//    @FindBy(partialLinkText = ".ng-option-label","Pakistani")
//    @CacheLookup
//    WebElement Nationality_option;
//    @FindBy(name="address")
//    @CacheLookup
//    WebElement Adress;
//    @FindBy(name="poBox")
//    @CacheLookup
//    WebElement PoBox;
//    @FindBy(name="country")
//    @CacheLookup
//    WebElement Country;
//    @FindBy(partialLinkText=".ng-option-label","Pakistan")
//    @CacheLookup
//    WebElement Country_Opt;
//    @FindBy(name="city")
//    @CacheLookup
//    WebElement City;
//    @FindBy(partialLinkText = ".ng-option-label","Karachi")
//    @CacheLookup
//    WebElement City_opt;
//    @FindBy(name="identificationType")
//    @CacheLookup
//    WebElement Identification_type;
//    @FindBy(name="idCardNo")
//    @CacheLookup
//    WebElement Identification_Opt;
//    @FindBy(partialLinkText = "input[name="idCardNo"]")
//    @CacheLookup
//    WebElement Idcard_Input;
//    @FindBy(partialLinkText = ".ng-option-label","National ID")
//    @CacheLookup
//    WebElement National_ID_opt;
//    @FindBy(name="passportNo")
//    @CacheLookup
//    WebElement Passport_No;
//    @FindBy(partialLinkText = "input[name="passportNo"]")
//    @CacheLookup
//    WebElement Passport_Input;
//    @FindBy(partialLinkText=".ng-option-label","Passport")
//    @CacheLookup
//    WebElement Passport_Opt;
//    @FindBy(partialLinkText = "input[name="passportExpiryDate"]")
//    @CacheLookup
//    WebElement PassportExp_Date;
//    @FindBy(css="[aria-label="2026"]")
//    @CacheLookup
//    WebElement PassportExp_Year;
//    @FindBy(css="[aria-label="August 2026"]")
//    @CacheLookup
//    WebElement PassportExpMonthYear;
//    @FindBy(css="[aria-label="August 27,2026"]")
//    @CacheLookup
//    WebElement PassportExpDayMonthYear;
//    @FindBy(name="mobileCode")
//    @CacheLookup
//    WebElement MobileCode;
//    @FindBy()
//    @CacheLookup
//    @FindBy(name="mobileNo")
//    @CacheLookup
//    WebElement MobileNo;
//    @FindBy(name="phoneCode")
//    @CacheLookup
//    WebElement PhoneCode;
//    @FindBy(name="phoneNo")
//    @CacheLookup
//    WebElement PhoneNo;
//    @FindBy(id="gridCheck")
//    @CacheLookup
//    WebElement CheckBox;
//    @FindBy(xpath="Register")
//    @CacheLookup
//    WebElement RegisterBtn;
//    @FindBy(xpath="Proceed")
//    @CacheLookup
//    WebElement Proceed_Btn;
//    @FindBy(xpath="done-thanks")
//    @CacheLookup
//    WebElement DoneThanks;
//    @FindBy(xpath = "")
//    @CacheLookup
//    WebElement ThanksMessgae;
//    @FindBy(xpath="")
//    @CacheLookup
//    WebElement RegisterMessage;
//    @FindBy(xpath="")
//    @CacheLookup
//    WebElement EmailMessage;

    WebDriver driver;

    public RegistrationObj(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver, LoginPage_PF.class);
        PageFactory.initElements(driver, this);
    }

    //public WebElement FirstNameIsRequired(){
//        return this.First_Name_is_required;
//}
//public WebElement FirstNameIsNotValid(){
//        return this.First_Name_is_not_valid;
//    }
    public WebElement FirstNameError() {
        return this.Error;
    }

    public void enterUserFirstName(String Firstname) {

        UserFirstName.sendKeys(Firstname);

    }
}

//public void enterUserLastName (String userlastname) {
//        UserLastName.sendKeys(userlastname);
//        }
//}

//public void enterUserEmail(String useremail) {
//        user.sendKeys(useremail);
//}
//
//        }
//public void userPassword(input1, input2) {
//public voidvalidcheck(userPassword, input1, input2);
//        browser.executeScript("window.scrollTo(0,5000);").then(function () {
//        expect(userPassword.isPresent()).toBe(true);
//        });
//        };
//public void userConfirmPassword(input1, input2) {
//public void validcheck(userConfirmPassword, input1, input2);
//        };
//public void nextbutton() {
//        expect(Next_btn.isPresent()).toBe(true);
//        browser.wait(EC.elementToBeClickable(Next_btn), 5000);
//        Next_btn.click();
//        };
//public void dateofBirth() {
//        browser.executeScript("window.scrollTo(0,100);").then(function () {
//        expect(Dob.isPresent()).toBe(true);
//        });
//        expect(Dob.isPresent()).toBe(true);
//        browser.wait(EC.elementToBeClickable(Dob), 5000);
//        Dob.click();
//        };
//public void setDob() {
//        expect(container_calander.isPresent()).toBe(true);
//        browser.wait(EC.elementToBeClickable(container_calander_btn), 5000);
//        container_calander_btn.click();
//        browser.sleep(1000);
//        prv.click();
//        browser.wait(EC.elementToBeClickable(year), 5000);
//        year.click();
//        browser.sleep(500);
//        month_year.click();
//        browser.sleep(1000);
//        month_day_year.click();
//        };
//public void setnationality () {
//        expect(nationality.isPresent()).toBe(true);
//        browser.wait(EC.elementToBeClickable(nationality), 5000);
//        nationality.click();
//        browser.wait(EC.elementToBeClickable(nationality_Opt), 4000);
//        browser.executeScript("arguments[0].click();", nationality_Opt);
//        };
//public void setadress (enterAddress) {
//        address.clear().sendKeys(enterAddress);
//        };
//public void setPoBox (input1, input2) {
//public void validcheck(poBox, input1, input2);
//        };
//public void setcountry () {
//        country.click();
//        browser.sleep(500);
//        country_Opt.click();
//        };
//public void setcity () {
//
//        city.click();
//        browser.wait(EC.elementToBeClickable(city_Opt), 4000);
//        browser.executeScript("arguments[0].click();", city_Opt);
//        };
//public void setidenTypeNIC() {
//        idenType.click();
//        browser.sleep(500);
//        idenType_Opt1.click();
//        };
//
//public void setNationalIdNo(input1, input2) {
//        expect(NationalID_no.isPresent()).toBe(true);
//        browser.wait(EC.elementToBeClickable(NationalID_no), 5000);
//        browser.executeScript("arguments[0].click();",NationalID_no);
//        browser.sleep(500);
//public void validcheck(IdCard_input, input1, input2);
//        browser.sleep(500);
//        };
//public void setidenTypePP () {
//        idenType.click();
//        browser.sleep(500);
//        idenType_Opt2.click();
//        };
//public void setPassportNo(input1, input2) {
//        passport_no.click();
//        browser.sleep(500);
//public voidvalidcheck(passport_input, input1, input2);
//        };
//public void setPassportExp() {
//        Passport_exp_date.click();
//        browser.sleep(500);
//        expect(container_calander.isPresent()).toBe(true);
//        browser.wait(EC.elementToBeClickable(container_calander_btn), 5000);
//        container_calander_btn.click();
//        browser.wait(EC.elementToBeClickable(PPyear), 5000);
//        PPyear.click();
//        PPmonth_year.click();
//        browser.sleep(500);
//        PPmonth_day_year.click();
//        };
//
//
//public void setmobilecode() {
//        mobileCode.click();
//        browser.sleep(500);
//        code_Opt.click();
//        };
//public void setmobileNo (entermobileNo) {
//        mobileNo.clear().sendKeys(entermobileNo);
//
//        };
//public voidsetPhonecode() {
//        phoneCode.click();
//        browser.sleep(500);
//        code_Opt.click();
//        };
//public voidsetPhoneNo(enterphoneNo) {
//        phoneNo.clear().sendKeys(enterphoneNo);
//
//        };
//public voidgridcheck(){
//        term_checkbox.click();
//        browser.sleep(500);
//        };
//public void RegisterBtn(){
//        Register_btn .click();
//        browser.sleep(500);
//        };
//public voidDoneThanku(){
//        done_thanks
//        };
//public void ProceedBtn(){
//        Proceed_btn.click();
//        browser.sleep(500);
//        };
//public void RegisterConfirmation(){
//        expect(thanksVar.getText()).toBe("Thank You");
//        expect(thanksVar0.getText()).toBe("for Registering on Chiragh");
//        expect(thanksVar1.getText()).toBe("We have sent you an account activation link on your email(");
//        console.log("Thank you page is verified");
//        }
//
//        };
//
//
