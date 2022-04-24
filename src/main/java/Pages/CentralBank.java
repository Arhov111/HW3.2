package Pages;

import Helper.setUp.DriverUtils;
import Helper.setUp.WaitAssist;
import Helper.setUp.locators.CentralBankConstants;
import Helper.setUp.locators.FrontPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CentralBank extends BasePage{

    private By goToLatestUpdates = By.xpath(CentralBankConstants.goToLatestUpdates);
    private By goToCBWebsite = By.xpath(CentralBankConstants.goToCBWebsite);
    private By writeEmailToCB = By.xpath(CentralBankConstants.writeEmailToCB);

    public CentralBank(WebDriver driver){
        this.driver = driver;
    }

    public CentralBank() {
    }

    public void toCentralBankRates(){
        driver.findElement(goToLatestUpdates).sendKeys("//*[@id=\"aspnetForm\"]/div[3]/div[2]/div[1]/a");
    }


    @Override
    public String getUrl() {
        return BASE_URL + "/am/armenian-dram-exchange-rates/central-bank-armenia";
    }

    public boolean isGoToLatestUpdatesDisplayed(){
        return isElementDisplayed(goToLatestUpdates);
    }

    public LatestUpdates clickLatestUpdatesButton(){
        WebElement latest_upd = WaitAssist.getInstance().waitForElemToBeClickable(goToLatestUpdates);
        latest_upd.click();
        return new LatestUpdates();

    }

    public boolean isCBWebsiteButtonDisplayed(){
        return isElementDisplayed(goToCBWebsite);
    }

    public CentralBank clickCBWebsiteButton(){
        WebElement cbWeb = WaitAssist.getInstance().waitForElemToBeClickable(goToCBWebsite);
        cbWeb.click();
        return new CentralBank();
    }
    public boolean isEmailButtonDisplayed(){
        return isElementDisplayed(writeEmailToCB);
    }

    public CentralBank clickCBEmailButton(){
        WebElement cbEm = WaitAssist.getInstance().waitForElemToBeClickable(writeEmailToCB);
        cbEm.click();
        return new CentralBank();
    }


}
