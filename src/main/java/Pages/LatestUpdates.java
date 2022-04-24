package Pages;

import Helper.setUp.locators.CentralBankConstants;
import Helper.setUp.locators.LatestUpdatesConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LatestUpdates extends BasePage{

    private By showRates = By.xpath(LatestUpdatesConstants.showRates);

    public LatestUpdates(WebDriver driver){
        this.driver = driver;
    }

    public LatestUpdates() {

    }


    public void toRates(){
        driver.findElement(showRates).sendKeys("//*[@id=\"aspnetForm\"]/div[3]/div[2]/div[1]/table[2]/tbody/tr[1]/th[3]/a");
    }
    @Override
    public String getUrl() {
        return BASE_URL + "/am/armenian-dram-exchange-rates/central-bank-armenia/daily";
    }

    public boolean isRatesButtonDisplayed(){
        return isElementDisplayed(showRates);
    }
}
