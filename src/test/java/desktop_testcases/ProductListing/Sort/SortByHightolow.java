package desktop_testcases.ProductListing.Sort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductListing.SortByHightolowPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class SortByHightolow {

	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	SortByHightolowPF sortbyhightolow;
	LoginWebPF login;
	@Parameters({"env","browsername"})

	@BeforeClass
	public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException {
		System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");

		System.out.println("Inside Step - browser is open");

		BaseClass baseClass=new BaseClass(env,browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();
		login = new LoginWebPF(driver);
		sortbyhightolow = new SortByHightolowPF(driver);
//
//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();

	}
	@Test(priority = 0)
	public void sort_by_high_to_low() throws InterruptedException, FileNotFoundException {
		HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
		getTest().log(Status.PASS, "Test Case for sorting products");
		Thread.sleep(3000);
		sortbyhightolow.health();
		getTest().log(Status.PASS, "Clicking on health module");
		sortbyhightolow.other_page_validation();
		Thread.sleep(3000);
		sortbyhightolow.sort3();
		getTest().log(Status.PASS, "Clicking on sorting icon");
		Thread.sleep(5000);
		sortbyhightolow.hightolow();
		getTest().log(Status.PASS, "Selceting option high to low");
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
