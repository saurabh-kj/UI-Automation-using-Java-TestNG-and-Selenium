package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.driver.ChromeDriverSetup;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {

    private WebDriver driver;

    public void setDriver(String browserName) throws MalformedURLException {
        switch (browserName) {
            case "chrome":
                ChromeDriverSetup driverManager;
                driverManager=  new ChromeDriverSetup();
                driver=driverManager.getDriver();
                break;
            case "firefox":
                break;
            case "android":
                DesiredCapabilities capabilities = new DesiredCapabilities();
                ChromeOptions options1=new ChromeOptions();
                options1.setCapability("w3c",false);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
//                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
                capabilities.setCapability(MobileCapabilityType.UDID, "3401c49fb90b3647");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(ChromeOptions.CAPABILITY, options1);
                capabilities.setCapability("device", "Google Pixel 3");
//                capabilities.setCapability("o,os_version", "9.0");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                driver = new AppiumDriver(url, capabilities);
                break;

            case "IOS":
                DesiredCapabilities capabilitiesIOS = new DesiredCapabilities();
                ChromeOptions options2=new ChromeOptions();
                options2.setCapability("w3c",false);
                capabilitiesIOS.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
                capabilitiesIOS.setCapability(MobileCapabilityType.DEVICE_NAME, "efd02277");
                capabilitiesIOS.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                capabilitiesIOS.setCapability(ChromeOptions.CAPABILITY,options2);
                capabilitiesIOS.setCapability("device", "iPhone XS");
//                capabilitiesIOS.setCapability("o,os_version", "15.0");
                capabilitiesIOS.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilitiesIOS.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                URL url1 = new URL("http://0.0.0.0:4723/wd/hub");
                driver = new AppiumDriver(url1, capabilitiesIOS);
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

}
