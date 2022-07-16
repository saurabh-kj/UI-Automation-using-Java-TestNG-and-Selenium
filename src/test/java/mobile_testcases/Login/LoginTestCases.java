package mobile_testcases.Login;

import mobile_pagefactory.Cart.CartPageAPF;
import mobile_pagefactory.Login.LoginAPF;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import utils.BaseClass;

import java.io.FileNotFoundException;
import java.io.IOException;

@Test
public class LoginTestCases {
	AppiumDriver driver;
	LoginAPF loginAPF;

	@Parameters({"env", "browsername"})

	@BeforeClass
	public void setup(@Optional("url") String env, @Optional("android") String browsername) throws IOException, InterruptedException {
		BaseClass baseClass = new BaseClass(env, browsername);
		baseClass.chromeDriverManager(env);
		this.driver = (AppiumDriver) baseClass.getDriver();

		loginAPF = new LoginAPF(this.driver);
		CartPageAPF Cart = new CartPageAPF(driver);
		Cart.ClickCloseTheBanner();

	}

	@Test
	public void loginHappyFlow() throws FileNotFoundException, InterruptedException {
		loginAPF.clickHamburger();
		loginAPF.login();
	}


	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}