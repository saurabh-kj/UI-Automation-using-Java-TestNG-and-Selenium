package desktop_testcases.ProductDetails;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import desktop_pagefactory.test.Login.LoginWebPF;
import desktop_pagefactory.test.ProductDetails.ProductDetailsPF;
import utils.BaseClass;

@Listeners(utils.ListenerClass.class)
public class ProductDetailsPage {
	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	LoginWebPF login;
	ProductDetailsPF prdetail;

	@Parameters({"env","browsername"})

	@BeforeClass
	public void LoginToWebsite(@Optional("url") String env, @Optional("chrome") String browsername) throws IOException, InterruptedException {
		BaseClass baseClass=new BaseClass(env,browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();
		System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");

		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);


		login = new LoginWebPF(driver);
		prdetail=new ProductDetailsPF(driver);

		login.clickLogin();
		login.enterMobileNo("9999999999");
		login.otpValue("987699");
		login.clickOnVerifyNow();

	}
	//--------------product name addtobag save button and images showing---------------//
	@Test(priority = 0)
	public void go_to_products_module() {
		prdetail.Other();
		prdetail.SelectProduct();
		prdetail.addbag();
		prdetail.save();
		prdetail.image1();
		prdetail.image2();
		prdetail.image3();

	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}


