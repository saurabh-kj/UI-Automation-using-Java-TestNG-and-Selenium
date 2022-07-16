package desktop_testcases.ProductListing.Filter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.ProductListing.FilterByGoodtoKnowPF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class FilterByGoodtoKnow {

	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	FilterByGoodtoKnowPF filterbygoodtoknow;
	LoginWebPF login;


	@Parameters({"env", "browsername"})
	@BeforeClass
	public void browser_is_open(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
		BaseClass baseClass = new BaseClass(env, browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();
		login = new LoginWebPF(driver);
		filterbygoodtoknow = new FilterByGoodtoKnowPF(driver);
//		Login.clickLogin();
//
//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();

	}
	//-----------------filter by good to know-------------------------//
	@Test(priority = 0)
	public void filter_by_good_to_know() throws InterruptedException, FileNotFoundException {
		HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
		getTest().log(Status.PASS, "Test Case is to filter product on the basis of good to know");
		filterbygoodtoknow.fragrance();
		getTest().log(Status.PASS, "Clicking on fragrance module");
		filterbygoodtoknow.fragrance_page_validation();
		Thread.sleep(4000);
		filterbygoodtoknow.goodtoknow();
		getTest().log(Status.PASS, "Clicking on filter");
//		filterbygoodtoknow.filter_by_goodtoknow_validation();
		Thread.sleep(5000);
		filterbygoodtoknow.selectgoodtoknow();
		getTest().log(Status.PASS, "Select good to know");
		Thread.sleep(5000);
		filterbygoodtoknow.exitfromfilter();
		getTest().log(Status.PASS, "Exit from filter");
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}



