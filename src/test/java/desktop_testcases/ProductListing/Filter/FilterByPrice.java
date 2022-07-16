package desktop_testcases.ProductListing.Filter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.ProductListing.FilterByPricePF;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.Orders.MyOrdersPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)
public class FilterByPrice {

	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	FilterByPricePF filterbyprice;
	LoginWebPF login;
	MyOrdersPF order;

	@Parameters({"env", "browsername"})
	@BeforeClass
	public void browser_is_open(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
		BaseClass baseClass = new BaseClass(env, browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();

		login = new LoginWebPF(driver);
		filterbyprice = new FilterByPricePF(driver);
//		Login.clickLogin();
//
//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();
//		order = new MyOrdersPF(driver);
//		order.clickMyOrders();

	}
	//-----------------filter by price--------------------//
	@Test(priority = 0)
	public void go_to_hair_care_module() throws InterruptedException, FileNotFoundException {
		HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
		getTest().log(Status.PASS, "Test Case is to filter product on the basis of price");
		filterbyprice.hair();
		getTest().log(Status.PASS, "Clicking on hair business module");
		filterbyprice.hair_page_validation();
		Thread.sleep(3000);
		filterbyprice.price();
		getTest().log(Status.PASS, "Clicking on filter option");
		//filterbyprice.filter_price_validation();
		Thread.sleep(5000);
		filterbyprice.SelectPrice();
		getTest().log(Status.PASS, "Select price range");
		Thread.sleep(5000);
		filterbyprice.exitfromfilter();
		getTest().log(Status.PASS, "Exit from filter");
		Thread.sleep(3000);

	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}

