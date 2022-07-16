package desktop_testcases.ProductListing.Sort;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductListing.SortByPlowtohighPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class SortByPlowtohigh {

	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	SortByPlowtohighPF sortbylowtohigh;
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
		sortbylowtohigh = new SortByPlowtohighPF(driver);

//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();

	}

	@Test(priority = 0)
	public void sort_By_Low_to_High() throws InterruptedException, FileNotFoundException {
		HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
		getTest().log(Status.PASS, "Test Case for sorting products");
		Thread.sleep(4000);
		sortbylowtohigh.others();
		getTest().log(Status.PASS, "Clicking on health and wellness module");
//		sortbylowtohigh.others_page_validation();
//		String ECSortPrice = sortbylowtohigh.PriceSortValue.getText();
		sortbylowtohigh.ClickOnSort();
		getTest().log(Status.PASS, "Clicking on sorting option");
		sortbylowtohigh.lowtohigh();
		String ACSortPrice = sortbylowtohigh.PriceSortValue.getText();
//		sortbylowtohigh.ValidationBySort(ECSortPrice,ACSortPrice);
		getTest().log(Status.  PASS, "Selecting low to high option");

	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
