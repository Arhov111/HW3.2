import Helper.setUp.DriverUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;
import org.testng.annotations.Parameters;

import static Helper.setUp.DriverUtils.getDriver;

public abstract class BaseTest {
    @BeforeClass
    @Parameters("browser")

    public void startRemoteServer(String browser){
        DriverUtils.startDriverSession(browser);
    }
    @BeforeMethod
    public void startDriver() {
        getDriver().get("http://rate.am");
    }

    @AfterMethod
    public void quitDriver(){
        DriverUtils.getDriver().quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)getDriver();
            File screenshot = ((TakesScreenshot) camera).getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }


}