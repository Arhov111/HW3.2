package Pages;

import Helper.setUp.WaitAssist;
import Helper.setUp.locators.FrontPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrontPage extends BasePage{

    private By goToCentralBankRates = By.xpath(FrontPageConstants.goToCentralBankRates);
    private By aboutUsButton = By.xpath(FrontPageConstants.aboutUsButton);



    public FrontPage(WebDriver driver){
        this.driver = driver;
    }

    public FrontPage() {

    }

    public void toCentralBankRates(){
        driver.findElement(goToCentralBankRates).sendKeys("//*[@id=\"ctl00_MainMenuControl1_hpCB\"]");
    }
    public void useAboutUsButton(){
        driver.findElement(aboutUsButton).sendKeys("[data-di-id='di-id-7e2f5016-fa6fe93c']");
    }

    @Override
    public String getUrl() {
        return BASE_URL;
    }

    public CentralBank clickCBButton(){
        WebElement cbBttn = WaitAssist.getInstance().waitForElemToBeClickable(goToCentralBankRates);
        cbBttn.click();
        return new CentralBank();

    }
    public boolean isCBButtonDisplayed(){
        return isElementDisplayed(goToCentralBankRates);
    }


}
