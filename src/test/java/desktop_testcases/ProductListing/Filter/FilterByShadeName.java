package desktop_testcases.ProductListing.Filter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.ProductListing.FilterByShadeNamePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class FilterByShadeName {
	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	FilterByShadeNamePF filterbyshadename;
	LoginWebPF login;

	@Parameters({"env", "browsername"})
	@BeforeClass
	public void browser_is_open(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
		BaseClass baseClass = new BaseClass(env, browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();

		login = new LoginWebPF(driver);
		filterbyshadename = new FilterByShadeNamePF(driver);

//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();

	}
	//----------------filter by shade name-----------------//
	@Test(priority = 0)
	public void go_to_grooming_for_men_module() throws InterruptedException, FileNotFoundException {
		HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
		getTest().log(Status.PASS, "Test Case is to filter product on the basis of shade name");
		filterbyshadename.groomingformen();
		getTest().log(Status.PASS, "Clicking on grooming module");
		filterbyshadename.grooming_page_validation();
		Thread.sleep(3000);
		filterbyshadename.shadename();
		getTest().log(Status.PASS, "Clicking on filter option");
//		filterbyshadename.filter_shadename_validation();
		Thread.sleep(5000);
		filterbyshadename.basebrown();
		getTest().log(Status.PASS, "Select filter option");
		Thread.sleep(5000);
		filterbyshadename.exitfromfilter();
		getTest().log(Status.PASS, "Exit from filter");
		Thread.sleep(3000);

	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}

