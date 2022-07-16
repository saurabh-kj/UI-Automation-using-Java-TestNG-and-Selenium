package mobile_pagefactory.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginByWhatappAPF extends DriverClass {

    @FindBy(xpath = "//button[normalize-space()='Get OTP via Whatsapp']")
    WebElement Btn_whatappotp;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout")
    WebElement btn_WhatappConv;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ListView/android.view.ViewGroup[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    WebElement Txt_Otp;

    final WebDriver driver;
    WebDriver driver1;

    public LoginByWhatappAPF(WebDriver driver) {
        super(driver);
        this.driver = driver;

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void clickongetOtp(){
        Btn_whatappotp.click();
    }


    public void LaunchWhatapp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability("appPackage", "com.whatsapp");
        capabilities.setCapability("appActivity", "com.whatsapp.instrumentation.ui.InstrumentationAuthActivity");
//        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //capabilities.setCapability(MobileCapabilityType.);
        URL url = new URL("http://0.0.0.0:4724/wd/hub");
        driver1 = new AppiumDriver(url, capabilities);
        //System.setProperty("webdriver.chrome.driver", System.get
        //
        //
        // Property("user.dir") + "/src/test/resources/drivers/chromedriver1");
        // Navigate to the page and interact with the elements on the guinea-pig page using id.
//        driver.get("https://mcstaging.shop.trell.co/");
        //driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

    }

    public void whatConv() throws InterruptedException {
        Thread.sleep(5000);
        btn_WhatappConv.click();
        Thread.sleep(5000);
        System.out.println(Txt_Otp.getText());
//        String otp = Txt_Otp.getText();
    }

}
