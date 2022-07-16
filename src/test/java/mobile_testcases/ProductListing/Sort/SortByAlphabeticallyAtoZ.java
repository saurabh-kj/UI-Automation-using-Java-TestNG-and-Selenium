package mobile_testcases.ProductListing.Sort;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.ProductListing.SortsPF.SortByAlphabaticallyAtoZAPF;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.YamlReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class SortByAlphabeticallyAtoZ {
    private static final TimeUnit Thred = null;
    AppiumDriver driver = null;
    SortByAlphabaticallyAtoZAPF sortByAlphabetically;
    LoginWebPF login;
    CartPageAPF Cart;

    @Parameters({"env", "browsername"})

    @BeforeClass
    public void setup(@Optional("qa") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
//        BaseClass baseClass = new BaseClass(env, browsername);
//        baseClass.chromeDriverManager(env);
//        this.driver = (AppiumDriver) baseClass.getDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //capabilities.setCapability(MobileCapabilityType.);
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver(url, capabilities);
        //System.setProperty("webdriver.chrome.driver", System.get
        //
        //
        // Property("user.dir") + "/src/test/resources/drivers/chromedriver1");
        // Navigate to the page and interact with the elements on the guinea-pig page using id.
        driver.get("https://shop.trell.co/");
        //driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        login = new LoginWebPF(driver);


        Cart = new CartPageAPF(this.driver);

        login = new LoginWebPF(driver);
        sortByAlphabetically = new SortByAlphabaticallyAtoZAPF(driver);

    }

    @Test(priority = 0)
    public void Login() throws InterruptedException {

        Cart = new CartPageAPF(driver);
        Cart.ClickCloseTheBanner();
//        Cart.ClickOnBurgerMenu();
//        Cart.ClickBackOnSideBurgerMenu();
//        //Login = new LoginWebPF(driver);
//        Cart.enterMobileNo();
//        Cart.otpValue();
//        Cart.clickOnVerifyNow();
    }

    @Test(priority = 1)
    public void SortByDiscount() throws InterruptedException, FileNotFoundException {
        HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
        getTest().log(Status.PASS, "Test Case is to sort products on the basis of alphabetically");
        sortByAlphabetically.Men();
        getTest().log(Status.PASS, "Clicking on mens business module");
        sortByAlphabetically.Sort();
        getTest().log(Status.PASS, "Clicking on sorting option");
        sortByAlphabetically.Alphabetically();
        getTest().log(Status.PASS, "Selecting alphabetically a to z");
    }
}
