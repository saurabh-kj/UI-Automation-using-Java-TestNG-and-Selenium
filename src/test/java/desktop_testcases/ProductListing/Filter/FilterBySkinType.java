package desktop_testcases.ProductListing.Filter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import desktop_pagefactory.test.ProductListing.FilterBySkinTypePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)

public class FilterBySkinType {

	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	FilterBySkinTypePF filterbyskin;
	LoginWebPF login;



	@Parameters({"env", "browsername"})
	@BeforeClass
	public void browser_is_open(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException {
		BaseClass baseClass = new BaseClass(env, browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();
		login = new LoginWebPF(driver);

		filterbyskin = new FilterBySkinTypePF(driver);
		filterbyskin =new FilterBySkinTypePF(driver);
//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();

	}
	//---------------------filter by skin type----------------------//
	@Test(priority = 0)
	public void go_to_perfume_module() throws InterruptedException, FileNotFoundException {
		HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
		getTest().log(Status.PASS, "Test Case is to filter product on the basis of skin type");
		Thread.sleep(4000);
		filterbyskin.Mekup();
		getTest().log(Status.PASS, "Clicking on mekup module");
		filterbyskin.mekup_page_validation();
		filterbyskin.skintype();
		getTest().log(Status.PASS, "Clicking on filter");
//		filterbyskin.skin_type_filter();
		filterbyskin.allskintype();
		getTest().log(Status.PASS, "Clicking on all skin type");
		filterbyskin.exitfromfilter();
		getTest().log(Status.PASS, "Exit from filter");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}