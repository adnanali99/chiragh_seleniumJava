package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

import java.io.File;
import java.util.List;

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

    //click on Date of Incorporation
    @FindBy(xpath = "//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[2]/div[3]/div[1]/input[1]")
    @CacheLookup
    WebElement clickOnDate;

    //Goto previous months

    @FindBy(css = "button[aria-label='Previous month'] span svg")
    @CacheLookup
    WebElement gotoPreviousMonth;

    //Select date from previous selected month
    @FindBy(css = "td[class='owl-dt-calendar-cell owl-dt-day-2 ng-star-inserted'] span")
    @CacheLookup
    WebElement clickSelectedDate;

    //Set place of incorporation
    @FindBy(xpath = "//input[@id='placeOfIncorporation']")
    @CacheLookup
    WebElement incorpPlace;

    //Set company address
    @FindBy(xpath = "//input[@id='companyAddress1']")
    @CacheLookup
    WebElement compAddress;

    //Set beneficiary owner name
    @FindBy(xpath = "//input[@id='beneficiaryOwner']")
    @CacheLookup
    WebElement bOwner;

    //Set click on nationality dropdown
    @FindBy(xpath = "//ng-select[@bindvalue='nationality']")
    @CacheLookup
    WebElement nationalityDropdown;

    //Set nationality text
    @FindBy(css = "ng-select[bindvalue='nationality'] div input")
    @CacheLookup
    WebElement nationalityText;


    //Click selected nationality
    @FindBy(xpath = "//div[@class='ng-option ng-star-inserted ng-option-marked']")
    @CacheLookup
    WebElement clickSelectedNationality;

    @FindBy(xpath = "//iframe[@title='chat widget']")
    @CacheLookup
    WebElement SwitchToFrame;

    //Set beneficiary owner name
    @FindBy(xpath = "//button[@data-test-id]")
    @CacheLookup
    WebElement ClickiFrame;

    //Upload file scanned cpy
    @FindBy(css = "div.custom-file>input.custom-file-input")
    @CacheLookup
    List<WebElement> uploadFiles;

    //Click on US citizen status dropdown
    @FindBy(xpath = "//ng-select[@bindvalue='status']")
    @CacheLookup
    List<WebElement> UsCitizen;

    //Click on Are you us citizen dropdown
    @FindBy(xpath = "//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[8]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]")
    @CacheLookup
    WebElement UsDropDown;

    //Send Keys in Are you us citizen dropdown
    @FindBy(xpath = "/html/body/app-root/app-layout/section/div/div[3]/app-kyc/div/section/form/div[8]/div[1]/div/div/ng-select/div/div/div[2]/input")
    @CacheLookup
    WebElement UsDDSendKeys;

    //Selecting Yes after sending Keys in Are you us citizen dropdown
    @FindBy(xpath = "//span[contains(text(),'Yes')]")
    @CacheLookup
    WebElement ClickYesNo;

    //Click yes in do you remit money from sanctioned countries
    @FindBy(xpath = " //body/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[10]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]")
    @CacheLookup
    WebElement RemitMoneyDD;

    //Send Keys in do you remit money from sanctioned countries
    @FindBy(xpath = "//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[10]/div[1]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
    @CacheLookup
    WebElement RemitMoneySendKeys;


    //Send Keys in do you remit money from sanctioned countries
    @FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[10]/div[1]/div[1]/div[1]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]")
    @CacheLookup
    WebElement RemitMoneyYES;

    @FindBy(css = "ng-select[bindvalue='status'] div input")
    @CacheLookup
    List<WebElement> dropDownValues;
    //Selecting Yes/No from the opened Yes and No dropdown e.g. there are 4 of them right now on KYC form
    @FindBy(css = "div[role='option']")
    @CacheLookup
    List<WebElement> UsCitizenOrNot;

    //Validation error messages list that appear when user clicks on submit button without entering anything in KYC form.
    @FindBy(css = "div[class='red-error']")
    @CacheLookup
    List<WebElement> errorMsgsList;

    //Submit Button
    @FindBy(css = "button[type='submit']")
    @CacheLookup
    WebElement submitBtn;

    @FindBy(how = How.CLASS_NAME, using = "")
    @CacheLookup
    WebElement elem;
    //********* Action Methods Starts Here *************

    public String getPageTitle() {
        return ldriver.getTitle();
    }

    public void clickProfileImage() {
        waithelper.WaitForElement(profilIcon, 30);
        this.profilIcon.click();
    }

    public void clickProfileUserName() {
        waithelper.WaitForElement(profileLink, 30);
        this.profileLink.click();
    }

    public void clickDashBoardProfileLink() {
        waithelper.WaitForElement(DashBoardProfileLink, 30);
        this.DashBoardProfileLink.click();
    }

    public void clickKycApplicationLink() {

        waithelper.WaitForElement(KYCapplicationLink, 30);
        this.KYCapplicationLink.click();
    }

    public void setSetCompanyName(String comName) {
        waithelper.WaitForElement(CompanyName, 30);
        this.CompanyName.sendKeys(comName);
    }

    public void setTradeLno(String tLicenseNo) {
        waithelper.WaitForElement(TradeLno, 30);
        this.TradeLno.sendKeys(tLicenseNo);
    }

    public void setClickOnDate() {
        waithelper.WaitForElement(clickOnDate, 30);
        this.clickOnDate.click();
    }

    public void clickOnPrevMonth() {
        for (int i = 1; i <= 4; i++) {
            waithelper.WaitForElement(gotoPreviousMonth, 30);
            this.gotoPreviousMonth.click();
        }
    }

    public void setClickSelectedDate() {
        waithelper.WaitForElement(clickSelectedDate, 30);
        this.clickSelectedDate.click();
    }

    public void setIncorpPlace(String place) {
        waithelper.WaitForElement(incorpPlace, 30);
        this.incorpPlace.sendKeys(place);
    }

    public void setCompanyName(String companyAddress) {
        waithelper.WaitForElement(compAddress, 30);
        this.compAddress.sendKeys(companyAddress);
    }

    public void setBeneOwnerName(String bOwnerName) {
        waithelper.WaitForElement(bOwner, 30);
        this.bOwner.sendKeys(bOwnerName);
    }

    public void ClickNationality() {

        waithelper.WaitForElement(nationalityDropdown, 30);
        this.nationalityDropdown.click();
    }

    public void setNationality(String nationality) {

        waithelper.WaitForElement(nationalityDropdown, 30);
        this.nationalityText.sendKeys(nationality);
        waithelper.WaitForElement(clickSelectedNationality, 30);
        this.clickSelectedNationality.click();


    }

    public void removeIframe() throws InterruptedException {

        Thread.sleep(1000);
        ldriver.switchTo().frame(SwitchToFrame);
        Thread.sleep(1000);
        this.ClickiFrame.click();
        ldriver.switchTo().defaultContent();
    }

    public void fileUpload(int index) throws InterruptedException {
        WebElement fileupload = uploadFiles.get(index);
        System.out.println("Index is: " + fileupload);
        // waithelper.WaitForElement(fileupload,30);
        Thread.sleep(1000);
        ((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", fileupload);
        Thread.sleep(500);
        fileupload.sendKeys(getFilePath());
        Thread.sleep(1000);

//       for(WebElement uploadFile: uploadFiles){
//           int i=1;
//           uploadFile = uploadFiles.get(i);
//           System.out.println("Index is "+uploadFile);
//           if(uploadFile.getText().equals("Scanned Passport Copy *")){
//               uploadFile.sendKeys(getFilePath());
//           }
//       }

    }

    public String getFilePath() {

        return new File("./Files/Scanned_ID.png").getAbsolutePath();

    }

    public void clickUsStatus(int index) throws InterruptedException {
        WebElement list = UsCitizen.get(index);
        Thread.sleep(3000);
        //  waithelper.WaitForElement(list,30);
        list.click();
    }

    public void setStatusDD(int index, int index2, String text) throws InterruptedException {
        clickUsStatus(index);
        WebElement dropDown = dropDownValues.get(index2);
        ((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", dropDown);
        Thread.sleep(2000);
        dropDown.clear();
        dropDown.sendKeys(text);

        UsCitizenYesNo(index);
    }

    public void UsCitizenYesNo(int index) throws InterruptedException {
        WebElement DropDown = UsCitizenOrNot.get(index);
        if (index > 1) {
            DropDown.click();
        } else {
            UsCitizenYesNo(index);
        }

        Thread.sleep(100);
        // ldriver.findElement(By.xpath("//html")).click();

    }

    public void getErrorMsg(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13){
        //WebElement Msg = errorMsgsList.

        for(int i=1; i<errorMsgsList.size(); i++){
            WebElement msg = errorMsgsList.get(i);
            String text = msg.getText();

            if(msg.getText().equals(string)){
                System.out.println("1. Expected: "+string);
                System.out.println("Actual: "+msg.getText());
                // Assert.assertTrue(true);
                Assert.assertEquals(string,msg.getText());
            }else if(msg.getText().equals(string2)){
                System.out.println("2. Expected: "+string2);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string3)){
                System.out.println("3. Expected: "+string3);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string4)){
                System.out.println("4. Expected: "+string4);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string5)){
                System.out.println("5. Expected: "+string5);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string6)){
                System.out.println("6. Expected: "+string6);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string7)){
                System.out.println("6. Expected: "+string7);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string8)){
                System.out.println("6. Expected: "+string8);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string9)){
                System.out.println("6. Expected: "+string9);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string10)){
                System.out.println("6. Expected: "+string10);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string11)){
                System.out.println("6. Expected: "+string11);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string12)){
                System.out.println("6. Expected: "+string12);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }else if(msg.getText().equals(string13)){
                System.out.println("6. Expected: "+string13);
                System.out.println("Actual: "+msg.getText());
                Assert.assertTrue(true);
            }
            else{
                System.out.println("Test Failed");
                Assert.assertTrue(false);

            }
            //System.out.println(msg.getText());
        }
    }
    public void clickSubmitBtn(){
        waithelper.WaitForElement(submitBtn,30);
        this.submitBtn.click();
    }

    public void clickUsDropDown(){
        waithelper.WaitForElement(UsDropDown,30);
        this.UsDropDown.click();
    }
    public void SetUsDropDown(String text){
        waithelper.WaitForElement(UsDDSendKeys,30);
        this.UsDDSendKeys.sendKeys(text);
    }
    public void clickYesNo(){
        waithelper.WaitForElement(ClickYesNo,30);
        this.ClickYesNo.click();
    }
    // Action Methods for Do you remit money from sanctioned countries
    public void clickRemitDropDown(){
        waithelper.WaitForElement(RemitMoneyDD,30);
        this.RemitMoneyDD.click();
    }
    public void SetRemitDropDown(String text){
        waithelper.WaitForElement(RemitMoneySendKeys,30);
        this.RemitMoneySendKeys.sendKeys(text);
    }
    public void clickYesNoRemit(){
        waithelper.WaitForElement(RemitMoneyYES,30);
        this.RemitMoneyYES.click();
    }
public WebElement iFrameVisible() {
    waithelper.WaitForElement(ClickiFrame, 30);
return this.ClickiFrame;
}
}
