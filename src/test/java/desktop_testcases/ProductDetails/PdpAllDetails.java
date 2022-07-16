package desktop_testcases.ProductDetails;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductDetails.PdpAllDetailsPF;
import utils.BaseClass;
import utils.YamlReader;

import static utils.extent.ExtentTestManager.getTest;

@Listeners(utils.ListenerClass.class)

public class PdpAllDetails {

	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	PdpAllDetailsPF pdpalldetails;
	LoginWebPF login;


	@BeforeClass
	public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
		System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
		System.out.println("Inside Step - browser is open");
		BaseClass baseClass=new BaseClass(env,browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();

		login = new LoginWebPF(driver);
		pdpalldetails = new PdpAllDetailsPF(driver);
//
//		Login.enterMobileNo("9999999999");
//		Login.otpValue("123456");
//		Login.clickOnVerifyNow();

	}
	//------------all details of product------------------------//
	@Test(priority = 0)
	public void Go_To_Bath_Body_Products() throws InterruptedException, FileNotFoundException {
		HashMap<String, String> CartPage = YamlReader.getInstance().getDetails("LoginDetails");
		getTest().log(Status.PASS, "Test cases for al details of a product");
		pdpalldetails.BodyBath();
		getTest().log(Status.PASS,"Clicking on Bath & Body");
		pdpalldetails.bodybath_page_validation();
		getTest().log(Status.PASS,"Bath & Body page validated ");
		pdpalldetails.SoapProduct();
		getTest().log(Status.PASS,"Clicking on Soap Product");
		pdpalldetails.details_page();
		getTest().log(Status.PASS,"Plp page validated");
		pdpalldetails.P_Name();
		getTest().log(Status.PASS,"Product name displaying");
		pdpalldetails.P_Review();
		getTest().log(Status.PASS,"Product review showing");
		pdpalldetails.P_Price();
		getTest().log(Status.PASS,"Price showing");
		pdpalldetails.Actual_Price();
		getTest().log(Status.PASS,"Actual price showing");
		pdpalldetails.Offer();
		getTest().log(Status.PASS,"Offer showing");
		pdpalldetails.ExpectedDeliveryDate();
		getTest().log(Status.PASS,"Expected delivery date showing");
		pdpalldetails.SaveBtn();
		getTest().log(Status.PASS,"Save button showing");
		pdpalldetails.AddtoBag();
		getTest().log(Status.PASS,"Add to bag showing");
		pdpalldetails.BrandName();
		getTest().log(Status.PASS,"Brand name showing");
		pdpalldetails.ExpiryDate();
		getTest().log(Status.PASS,"Expiry date displaying");
		pdpalldetails.AboutProduct();
		getTest().log(Status.PASS,"About product showing");
		pdpalldetails.MakeItSpecial();
		getTest().log(Status.PASS,"Make it special showing");
		pdpalldetails.GoodToKnow();
		getTest().log(Status.PASS,"Good to know showing");
		pdpalldetails.Ingredient();
		getTest().log(Status.PASS,"Ingredient showing");
		pdpalldetails.HowToUse();
		getTest().log(Status.PASS,"How to use showing");
		pdpalldetails.ProductAuthenticity();
		getTest().log(Status.PASS,"Product authenticity showing");
		pdpalldetails.ReturnProduct();
		getTest().log(Status.PASS,"Return product showing");
		pdpalldetails.CashOnDelivery();
		getTest().log(Status.PASS,"Cash on dilivery showing");
		pdpalldetails.SimilarProduct();
		getTest().log(Status.PASS,"Similar product showing");
		pdpalldetails.Customer_Also_Bought();
		getTest().log(Status.PASS,"Customer also bought showing");
		pdpalldetails.AdditionalInfo();
		getTest().log(Status.PASS,"Additional info showing");
		pdpalldetails.Breadcrumbs();
		Thread.sleep(5000);
		getTest().log(Status.PASS,"Breadcrumbs showing");

//---------------------Back to home---------------------------//
		pdpalldetails.HomePage();
	}

	@Test(priority = 1)
	public void go_to_pdp_page() {
		driver.navigate().back();
	}
	@Test(priority = 2)
	public void go_to_home() {
		driver.navigate().back();
		driver.navigate().back();
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}