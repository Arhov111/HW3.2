import Pages.CentralBank;
import Pages.FrontPage;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.AfterMethod;

public class CBEmailTest extends BaseTest{

    @Test

    public void goToCBMail(){
        FrontPage frontPage = new FrontPage();
        CentralBank centralBank = new CentralBank();
        Assert.assertTrue(frontPage.isCBButtonDisplayed());
        frontPage.clickCBButton();
        Assert.assertTrue(centralBank.isEmailButtonDisplayed());
        centralBank.clickCBEmailButton();

    }




}
