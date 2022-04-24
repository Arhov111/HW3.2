package Pages;


import Helper.setUp.WaitAssist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Helper.setUp.DriverUtils.getDriver;


public abstract class BasePage {
    protected WebDriver driver;
    public static final String BASE_URL = "http://rate.am";



    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage() {
        this.driver = getDriver();
    }



    public abstract String getUrl();

    public boolean isElementDisplayed(By location) {
        return findElement(location).isDisplayed();
    }
    public WebElement findElement(By location) {
        WaitAssist.getInstance().waitForElementToBeDisplayed(location);
        return driver.findElement(location);
    }



}