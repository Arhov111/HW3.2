import Pages.CentralBank;
import Pages.FrontPage;
import Pages.LatestUpdates;
import org.junit.Assert;
import org.junit.Test;

public class CBPageTest extends BaseTest{

    @Test

    public void goToRatesInLatestRates(){
        FrontPage frontPage = new FrontPage();
        CentralBank centralBank = new CentralBank();
        LatestUpdates latestUpdates = new LatestUpdates();
        Assert.assertTrue(frontPage.isCBButtonDisplayed());
        frontPage.clickCBButton();
        Assert.assertTrue(centralBank.isGoToLatestUpdatesDisplayed());
        centralBank.clickLatestUpdatesButton();
        Assert.assertTrue(latestUpdates.isRatesButtonDisplayed());
    }

}
