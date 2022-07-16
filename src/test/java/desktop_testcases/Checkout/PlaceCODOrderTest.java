package desktop_testcases.Checkout;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import desktop_pagefactory.test.Checkout.PlaceOrderPF;
import utils.BaseClass;

@Listeners(utils.ListenerClass.class)
public class PlaceCODOrderTest {

	//	private static final TimeUnit Thred = null;
	WebDriver driver = null;
	PlaceOrderPF placeCODOrder;

	@Parameters({"env","browsername"})

	@BeforeClass
	public void browser_is_open(@Optional("url") String env,@Optional("chrome") String browsername) throws IOException {
		BaseClass baseClass=new BaseClass(env,browsername);
		baseClass.chromeDriverManager(env);
		this.driver = baseClass.getDriver();

		System.out.println("  ===  I am inside LoginDemoSteps_POM  ===== ");
		System.out.println("Inside Step - browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		placeCODOrder = new PlaceOrderPF(driver);

	}
	//---------------------place cod order--------------------//
	@Test(priority = 0)
	public void Place_COD_OrderTest() throws InterruptedException {
		placeCODOrder.addProduct_to_Cart();
		System.out.println("addProduct function done. Product added to Cart");
		placeCODOrder.updateCart();
		System.out.println("updateCart function. Cart updated");
		placeCODOrder.loginToVerify();
		System.out.println("logged in successfully");
		placeCODOrder.checkoutCOD();
		System.out.println("checkout Completed");
		placeCODOrder.fetchOrderID();
		System.out.println("");
	}

	@AfterClass
	public void tearDown(){
		driver.findElement(By.xpath("//a[@href='/?root=nav']")).click();
		System.out.println("Yor are navigated to Homepage");
	}

}
