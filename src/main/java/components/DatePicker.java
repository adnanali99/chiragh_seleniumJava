package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DatePicker {

    private WebDriver driver;
    private By setEmail = By.xpath("//*[@id='stuff']");
    private By setPass = By.xpath("//*[@id='stuwff']");
    private By clickLoginBtn = By.cssSelector("[class='btn primaryBlueBtn from-left w-100']");
    private By clickProfile = By.xpath("//header/div[1]/div[1]/nav[1]/div[1]/div[3]/div[3]/div[1]/span[1]/img[1]");
    private By clickUsername = By.xpath("//header/div[1]/div[1]/nav[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/a[1]/p[1]");
    private By clickProfileLink = By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");
    private By clickKYClink = By.xpath("//a[contains(text(),'KYC Application')]");
    private By setCompanyName = By.id("companyName");
    private By openCalanderBtn = By.xpath("//body/app-root[1]/app-layout[1]/section[1]/div[1]/div[3]/app-kyc[1]/div[1]/section[1]/form[1]/div[2]/div[3]/div[1]/input[1]");
   private  By calanderOpen = By.cssSelector("div[class='owl-dt-calendar-main']");
   private  By period = By.xpath("//body/div[3]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[1]/div[1]/button[1]/span[1]");
    public DatePicker(WebDriver driver){
    this.driver = driver;
    }
    public void chooseDate(LocalDate date){
        open();
        chooseMonth(date);
    }

    private void chooseMonth(LocalDate date) {
        var currentPeriod = getCurrentPeriod();

        long monthsAway = ChronoUnit.MONTHS.between(currentPeriod, date);
    }

    private LocalDate getCurrentPeriod() {
        var currentPeriod = driver.findElement(period).getText().split(" ");
        return  LocalDate.of(
                Integer.parseInt(currentPeriod[1]),
                Month.valueOf(currentPeriod[0].toUpperCase(Locale.ROOT)),
                LocalDate.now().getDayOfMonth());

    }

    private void open() {
driver.findElement(setEmail).sendKeys("aliadnan3.8@gmail.com");
driver.findElement(setPass).sendKeys("A1122a@@");
driver.findElement(clickLoginBtn).click();
driver.findElement(clickProfile).click();
driver.findElement(clickUsername).click();
driver.findElement(clickProfileLink).click();
driver.findElement(clickKYClink).click();
driver.findElement(setCompanyName).sendKeys("ABCDE");
if(!isCalanderOpen()){
    driver.findElement(openCalanderBtn).click();
}
    }

    private boolean isCalanderOpen() {
        return driver.findElement(calanderOpen).isDisplayed();

    }


}
