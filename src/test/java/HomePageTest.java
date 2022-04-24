import Pages.CentralBank;
import Pages.FrontPage;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void goToCBPageTest(){
        FrontPage frontPage = new FrontPage();
        CentralBank centralBank = new CentralBank();
        Assert.assertTrue(frontPage.isCBButtonDisplayed());
        frontPage.clickCBButton();
        Assert.assertTrue(centralBank.isGoToLatestUpdatesDisplayed());

    }



}
