import Pages.CentralBank;
import Pages.FrontPage;
import org.junit.Assert;
import org.junit.Test;

public class CBWebsiteTest extends BaseTest{

    @Test

    public void goToCBWebsite(){
        FrontPage frontPage = new FrontPage();
        CentralBank centralBank = new CentralBank();
        Assert.assertTrue(frontPage.isCBButtonDisplayed());
        frontPage.clickCBButton();
        Assert.assertTrue(centralBank.isCBWebsiteButtonDisplayed());
        centralBank.clickCBWebsiteButton();
    }


}
