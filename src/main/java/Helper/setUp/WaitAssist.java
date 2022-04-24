package Helper.setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitAssist {
    private static final Duration DURATION = Duration.ofSeconds(17);

    public static WaitAssist getInstance() {
        return new WaitAssist();
    }


    public WaitAssist waitForElementToBeDisplayed(By location) {

            new WebDriverWait(DriverUtils.getDriver(), DURATION).
                    until(ExpectedConditions.visibilityOfElementLocated(location));
            return this;
        }


    public WaitAssist waitForElemToBeDisplayed(WebElement elem) {

            new WebDriverWait(DriverUtils.getDriver(), DURATION).
                    until(ExpectedConditions.visibilityOf(elem));
            return this;

    }

    public WebElement waitForElemToBeClickable(By location){
        return new WebDriverWait(DriverUtils.getDriver(), DURATION).
                until(ExpectedConditions.elementToBeClickable(location));

    }

}
