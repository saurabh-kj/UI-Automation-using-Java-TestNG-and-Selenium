package mobile_pagefactory.Cart;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.DriverClass;

public class CartPageAPF extends DriverClass {
	////////////////////////with SSR

	@FindBy(xpath = "//div[@class='AppInstallBannerstyle__BannerCloseOverlay-sc-1m29wyo-3 cSanma']")
	WebElement BtnBannerClose;

	@FindBy(xpath = "//span[@class='signInText']")
	WebElement btn_login_signup;

	@FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
	WebElement txt_mobileno;

	@FindBy(xpath = "//input[@placeholder='Enter Phone Number']")
	WebElement txt_mobilenoInCheckout;

	@FindBy(xpath = "//button[normalize-space()='Get OTP via SMS']")
	WebElement btn_GetOTP;

	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	WebElement txt_otp_value;

	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	WebElement txt_otp_valueInCheckout;

	@FindBy(xpath = "//button[normalize-space()='Verify Now']")
	WebElement btn_verify_now;

//	@FindBy(xpath = "(//img)[2]")
	@FindBy(xpath = "(//span[@class='header-hamburgerIconWrapper-1cw'])[1] | (//img)[2]")
	WebElement Btn_BurgerMenu;


	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement txt_searchbox;

	@FindBy(xpath = "//button[@xpath='1']")
	WebElement btn_close;

	@FindBy(xpath = "//*[contains(text(),'Add to Bag')]")
//	@FindBy(xpath = "//div[@class='ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb']//div[1]//div[2]//button[1]")
//	@FindBy(xpath = "//button[normalize-space()='Add to Bag']")
	WebElement btn_addproduct;

	@FindBy(xpath = "//button[@class='filterBtn moreFilter']")
	WebElement btn_offer;

//	@FindBy(xpath = "//button[normalize-space()='View Bag']")
	@FindBy(xpath = "//img[@alt='Cart Bag']")
	WebElement btn_viewbag;

	@FindBy(xpath = "//span[contains(text(),'Lotus Herbals Safe Sun UV Screen Matte Gel Pa+++ S')]")
	WebElement txt_productname;

	//@FindBy(xpath = "//span[@class='categoryBranch-categoryName-2ks']")
	@FindBy(xpath = "//span[contains(text(),'Makeup')]")
	WebElement btn_MakeupBusinessGroupName;

	@FindBy(xpath = "(//div[@class='itemWrap'])[3]")
//	@FindBy(xpath = "//li[1]//button[1]//div[1]")
	WebElement btn_ChooseCategory;

	@FindBy(xpath = "(//div[@class='imageWrap'])[4]")
//	@FindBy(xpath = "//span[normalize-space()='Mascara']")
	WebElement btn_Choosesubcategory;

	@FindBy(xpath = "(//span[@class='heading secondLevel'])[1]")
//	@FindBy(xpath = "//span[normalize-space()='Mascara']")
	WebElement btn_ChoosesubcategoryHW;


	@FindBy(xpath = "//span[contains(text(),\"Kohl's & Kajal\")]")
	WebElement btn_Choosesubcategorykajal;



	@FindBy(xpath = "//body/div[@id='root']/aside[1]/div[1]/div[1]/div[1]/button[1]/*[1]")
	WebElement btn_BackButtonOnBurgerMenu;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/header[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[2]")
	WebElement btn_SkinCareBusinessGroupName;

//	@FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/a[2]/img[1]")
	@FindBy(xpath = "(//img[@alt='Logo'])[1]")
	WebElement btn_BackToHomePage;

	@FindBy(xpath = "//div[@class='product-quantityItems-Kde']//button[@title='Increase Quantity']")
	WebElement btn_IncreaseProductQuanitity;

	@FindBy(xpath = "//a[@href='/Cart']")
	WebElement btn_MyBag;

//	@FindBy(xpath = "//a[@href='/Cart']")
//	@FindBy(xpath = "//button[@class='cartButton active']")
	@FindBy(xpath = "//img[@alt='Cart Bag']")
	WebElement btn_MyBaginCart;

	@FindBy(xpath = "//button[normalize-space()='SHOP OUR PRODUCTS']")
	WebElement btn_ShowOurProductButton;

	@FindBy(xpath = "//div[@class='product-quantityItems-Kde']//span[@class='section-text-380'][normalize-space()='Remove']")
	WebElement btn_removeitem;

	@FindBy(xpath = "//img[@class='product-image-2L2 image-loaded-2-o']")
	WebElement ProductImg;

	@FindBy(xpath ="/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/a[1]/div[1]/img[2]")
	WebElement btn_ProductImageOnBagPage;

	@FindBy(xpath = "//input[@id='coupon_code']")
	WebElement txt_PromoCodeField;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement btn_applyPromoCode;

	@FindBy(xpath = "//img[@alt='close']")
	WebElement btn_CloseButtononPromoCode;

	@FindBy(css = "main.main-root-1Ca div.main-page-2Ue:nth-child(2) div.category-categoryPage-1Pv section.category-gallery-2t8 div.category-gallery_wrapper-pST div.gallery-root-2sM div.gallery-items-138 div.item-root-3CB:nth-child(1) div.item-wishlist_addition-1nD button.item-addToWishListBtn-eVk span.item-inWishlist-1Mk > svg:nth-child(1)")
	WebElement btn_wishlist;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/header[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[3]")
	WebElement btn_ViewProflieList;

	@FindBy(linkText = "My Wish List")
	WebElement btn_MyWishList;

	@FindBy(xpath = "//span[contains(text(),'Proceed')]")
	WebElement btn_Proceed;

	@FindBy(xpath = "//button[@title='Decrease Quantity']")
	WebElement btn_DecreaseQuantity;

	//(xpath = "//span[contains(text(),'Change')]")
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[3]/label[1]/div[1]/button[1]")
	WebElement btn_ChangeAddressButton;

	@FindBy(xpath = "//button[contains(text(),'Add New Address')]")
	WebElement btn_AddNewAddressButton;

	@FindBy(xpath = "//span[contains(text(),'Add Address')]")
	WebElement btn_AddAddressButton;


	@FindBy(xpath = "//input[@id='firstname']")
	WebElement txt_FullName;

	@FindBy(xpath = "//input[@id='postcode']")
	WebElement txt_PinCode;

	@FindBy(xpath = "//input[@id='street0']")
	WebElement txt_Address;

	@FindBy(xpath = "//input[@id='street1']")
	WebElement txt_LandMark;

	@FindBy(xpath = "//div[@id='scroll_top']")
	WebElement btn_ScrollUp;

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	WebElement btn_PaymentMethodOnPlaceOrder;

	@FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[2]/div[2]/div[1]/div[1]/img[1]")
	WebElement btn_BackButtonToAddressPage;

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	WebElement btn_PlaceOrderByCash;

	@FindBy(xpath = "//label[contains(text(),'Cash On Delivery')]")
	WebElement btn_ChooseCashPaymentMethod;

	@FindBy(xpath = "//button[contains(text(),'Nivea')]")
	WebElement btn_ClickOnQuickFilter;

	@FindBy(xpath = "//span[contains(text(),'Out of Stock')]")
	WebElement btn_PickOutOFStockProduct;

	@FindBy(xpath = "(//img[@alt='img'])[1]")
	WebElement btn_ClickOnProductInCart;

	@FindBy(xpath = "//span[contains(text(),'Plum NaturStudio All-Day-Wear Kohl Kajal - Black B')]")
	WebElement Clk_KajalProduct;

	@FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/button[1]/span[1]/*[1]")
	WebElement btn_CheckOutBack;



	////////////////////////////////////////////

	//ValidationsXpaths

	@FindBy(xpath = "//span[contains(text(),'Insight Cosmetics Nail Polish Remover Wipes - 30 S')]")
	WebElement Get_ProductTextOnProductsPage;

	@FindBy(xpath = "//div[contains(text(),'Insight Cosmetics Nail Polish Remover Wipes - 30 S')]")
	WebElement Get_ProductTextOnCartPage;

	@FindBy(xpath = "//span[contains(text(),'Eye')]")
	WebElement btn_MinimizeSubcategory;


	AppiumDriver driver;

	public CartPageAPF(AppiumDriver driver) {
		super(driver);
		this.driver = driver;

		//PageFactory.initElements(driver, LoginWebPF.class);
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void enterMobileNo() {

		btn_login_signup.click();
		driver.hideKeyboard();
		txt_mobileno.sendKeys("9999999999");
		btn_GetOTP.click();
	}

	public void enterMobileNoWhatapp() {
		btn_login_signup.click();
		driver.hideKeyboard();
		txt_mobileno.sendKeys("8985730131");
	}

	public void otpValue() {
		txt_otp_value.sendKeys("987699");
	}

	public void otpValueWhatsapp() {
		txt_otp_value.sendKeys("987699");
	}

	public void clickOnVerifyNow() throws InterruptedException {
		btn_verify_now.click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
	}


	public void ClickOnBurgerMenu() throws InterruptedException {
		waitForElementToBeClickable(Btn_BurgerMenu);
		Btn_BurgerMenu.click();
		Thread.sleep(6000);

	}

	public void ClickCloseTheBanner() throws InterruptedException {
		Thread.sleep(4000);
		BtnBannerClose.click();
	}

	public void enterSearchBoxofProduct(String ProductName) throws InterruptedException {
		txt_searchbox.click();
		txt_searchbox.sendKeys(ProductName);
		txt_searchbox.sendKeys(Keys.ENTER);
		btn_close.click();
		Thread.sleep(5000);
		//txt_productname.sendKeys(Keys.CONTROL, Keys.END);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public void AddProductsInClick() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		//Locating element by xpath text and store in variable "Element"
//		WebElement Element = btn_offer;
//
//		// Scrolling down the page till the element is found
//		js.executeScript("arguments[0].scrollIntoView();", Element);
//		Thread.sleep(5000);
////		Element.click();
//		Thread.sleep(5000);


//		TouchActions action = new TouchActions(driver);
//		action.scroll(btn_addproduct, 10, 100);
//		action.perform();
		Thread.sleep(5000);

		btn_addproduct.click();
//		btn_viewbag.click();

	}

	public void AddProductsInClickAndViewBag() throws InterruptedException {
		Thread.sleep(3000);
		btn_addproduct.click();
		Thread.sleep(3000);
		btn_viewbag.click();

	}
	public void ClickOnBackToHome() throws InterruptedException {
		Thread.sleep(3000);
		btn_BackToHomePage.click();
		Thread.sleep(5000);
	}
	public void ClickBackOnSideBurgerMenu(){
		btn_Choosesubcategory.click();
		btn_BackButtonOnBurgerMenu.click();
	}

	public void ClickOnBusinessGroup() throws InterruptedException {
		System.out.println("Iam inside the step of home page methods");
		Thread.sleep(500);
		//btn_BackToHomePage.click();
		btn_MakeupBusinessGroupName.click();


	}

	public void ClickOnCategory(){
		btn_ChooseCategory.click();
	}

	public void ClickOnSubCategory() throws InterruptedException {
		Thread.sleep(2000);
		btn_Choosesubcategory.click();
	}

	public void ClickOnSubCategoryHW() throws InterruptedException {
		Thread.sleep(2000);
		btn_ChoosesubcategoryHW.click();
	}


	public void ClickOnSubCategorykajal(){
		btn_Choosesubcategorykajal.click();
	}

	public void ClickOnBusinessGroupSkincare() throws InterruptedException {
		System.out.println("Iam inside the step of home page methods");
		Thread.sleep(500);
		//btn_BackToHomePage.click();
		btn_MakeupBusinessGroupName.click();


	}

	public void ClickOnCategorySkincare() throws InterruptedException {
		btn_ChooseCategory.click();
		Thread.sleep(3000);
	}

	public void ClickOnSubCategorySkincare(){
		btn_Choosesubcategory.click();
	}
	public void ClickOnMyBag(){
		btn_MyBag.click();
		btn_ShowOurProductButton.click();
	}

	public void ClickOnMyBagInCart(){
		btn_MyBaginCart.click();
	}

	public void CheckBagisEmptyValidation(){
		System.out.println("Bag is empty validation Check on new signin of customer which is registered with us should have Empty bag on first time use of product(Bag Count)");
	}

	public void CheckBagCountValidation(){
		System.out.println("CheckBag count items validation   Check if you click on Bag if no product added should show placeholder message of the page //Your Bag is empty ");
	}

	public void ClickOnBusinessGroupNext() throws InterruptedException {
		System.out.println("Iam inside the step of home page methods");
		Thread.sleep(500);
		btn_BackToHomePage.click();
		btn_SkinCareBusinessGroupName.click();


	}

	public void ChangeProductQuantity() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Locating element by xpath text and store in variable "Element"
		WebElement Element = ProductImg;

		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);
//		Element.click();
		Thread.sleep(5000);
		btn_IncreaseProductQuanitity.click();

//		driver.navigate().back();
		//btn_BackToHomePage.click();

	}


	public void RemoveProductFromBag() throws InterruptedException {
		//btn_BackToHomePage.click();
		//btn_Bag.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Locating element by xpath text and store in variable "Element"
		WebElement Element = ProductImg;

		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);

		btn_removeitem.click();
		Thread.sleep(5000);
		driver.navigate().back();

	}

	public void RedirectToProductDescriptionPage(){
		btn_ClickOnProductInCart.click();
		for(int i=0;i<=1;i++) {
			driver.navigate().back();
		}
//		Btn_BurgerMenu.click();
//		btn_BackToHomePage.click();


	}

	public void ProductImageOnBagPage() {
		btn_ProductImageOnBagPage.click();

	}

	public void ApplyPromoCode(String CouponCode) {
		//txt_PromoCodeField.click();
		txt_PromoCodeField.sendKeys(CouponCode);
		btn_applyPromoCode.click();


	}

	public void RemoveAppliedPromoCode() throws InterruptedException {
		Thread.sleep(3000);
		btn_CloseButtononPromoCode.click();

	}

	public void AddProductToWishlist() {
		btn_wishlist.click();

	}

	public void WishlistOnProfile() {
		btn_ViewProflieList.click();
		btn_MyWishList.click();

	}

	public void ClickOnProceed() throws InterruptedException {
		Thread.sleep(5000);
		btn_Proceed.click();
		driver.navigate().back();
//		RemoveProductFromBag();
		driver.navigate().back();

	}
	public void ClickOnProceedForAddress() throws InterruptedException {
		Thread.sleep(5000);
		btn_Proceed.click();
	}

	public void LoginToAppInCheckOut(){
		txt_mobilenoInCheckout.sendKeys("9999999999");
		btn_GetOTP.click();
		txt_otp_valueInCheckout.sendKeys("123456");
		btn_verify_now.click();
		btn_CheckOutBack.click();

	}

	public void CheckoutBack(){
		btn_CheckOutBack.click();
	}

	public void MyBagPageProductValidation(){
		System.out.println("MyBagProcut validation Add one item to the Bag and verify.");
	}

	public void ClickDecreaseQuantity() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		//Locating element by xpath text and store in variable "Element"
//		WebElement Element = btn_removeitem;
//
//		// Scrolling down the page till the element is found
//		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);
		btn_DecreaseQuantity.click();
//		driver.navigate().back();
	}

	public void ClickOnKajalproduct(){Clk_KajalProduct.click();}

	public void ClickOnAddAdressPage() {
		btn_ScrollUp.click();
		btn_ChangeAddressButton.click();
		btn_AddNewAddressButton.click();
		btn_AddAddressButton.click();

	}



	public void EnterAddressPageFullName(String FullName) {
		//btn_ScrollUp.click();
		btn_ChangeAddressButton.click();
		btn_AddNewAddressButton.click();
		txt_FullName.sendKeys(FullName);
	}

	public void EnterPinCode(String PinCode) {
		txt_PinCode.sendKeys(PinCode);
	}


	public void EnterAddress(String Address) {
		txt_Address.sendKeys(Address);
	}

	public void EnterLandMark(String LandMark) {
		txt_LandMark.sendKeys(LandMark);
	}

	public void clickOnVerifyAddAddress() {
		btn_AddAddressButton.click();
	}

	public void ClickOnBackToCart() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();

	}

	public void ClickOnPaymentPageRedirection() throws InterruptedException {
		Thread.sleep(4000);
		btn_PaymentMethodOnPlaceOrder.click();

	}

	public void ClickBackButtonOnTheAddressPage() {
		btn_BackButtonToAddressPage.click();

	}

	public void DoubleClickOnPlaceOrder() {
		btn_ChooseCashPaymentMethod.click();
		Actions act = new Actions(driver);

		//Double click on element
		WebElement ele = driver.findElement(By.xpath("btn_PlaceOrderByCash"));
		act.doubleClick(ele).perform();
		//btn_PlaceOrderByCash.click();

	}

	public void OutOfStock() {
		btn_ClickOnQuickFilter.click();
		btn_PickOutOFStockProduct.click();


	}

	public void TextValidationsOnProductPage() {
		//validation
		String ProductNameInPD = Get_ProductTextOnProductsPage.getText();

		String ProductNameInCart = Get_ProductTextOnCartPage.getText();

		//compare the text
		if(ProductNameInCart.equals(ProductNameInPD))
		{
			System.out.println("The actual and expected results are same.Title of Product is" + ProductNameInCart);
		}

	}


}

