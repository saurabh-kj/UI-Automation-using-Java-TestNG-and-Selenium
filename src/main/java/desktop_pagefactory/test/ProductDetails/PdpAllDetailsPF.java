package desktop_pagefactory.test.ProductDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

public class PdpAllDetailsPF {


	//-----------------------SSR------------------------------------------//
	@FindBy(xpath = "//*[normalize-space()='Bath & Body'] | //a[normalize-space()='Bath & Body']")
	WebElement body_bath;

	@FindBy(xpath = "//*[@class='ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg']")
	WebElement soap_product;

	@FindBy(xpath = "//h1[contains(text(),'mCaffeine Naked & Raw Tan Removal Coffee Body Scru')]")
	WebElement soap_name;

	@FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]")
	WebElement review;

	@FindBy(xpath = "//*[contains(.,'â‚¹ 90')]")
	WebElement price;

	@FindBy(xpath = "//*[@class='discountedPrice']")
	WebElement actualprice;

	@FindBy(xpath = "//div[@class='totalOffers']")
	WebElement offer;

	@FindBy(xpath = "//div[@class='pincodeMessagestyle__StyledPincodeMessage-sc-osgk57-0 bVqilB']//p[1]")
	WebElement expecteddeliverydate;

	@FindBy(xpath = "//button[@class='addSaveToBagstyle__SaveToBag-sc-ims6j7-1 ixbjmb']")
	WebElement savebutton;

	@FindBy(xpath = "//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
	WebElement addtobag;

	@FindBy(xpath = "//*[contains(@class,'TrellForYoustyle__StyledBrandName-sc-mjrr8m-6 dbNHBH')]")
	WebElement brandname;

	@FindBy(xpath = "//div[contains(text(),'Expiry')]")
	WebElement expiry;

	@FindBy(xpath = "//h2[normalize-space()='About The Product']")
	WebElement aboutproduct;

	@FindBy(xpath = "//h2[normalize-space()='What Makes it Special']")
	WebElement whatmakeitspecial;

	@FindBy(xpath = "//span[contains(text(),'Good To Know')]")
	WebElement goodtoknow;

	@FindBy(xpath = "//span[contains(text(),'Ingredients')]")
	WebElement ingredient;

	@FindBy(xpath = "//h2[normalize-space()='How To Use?']")
	WebElement howtouse;

	@FindBy(xpath = "//h2[normalize-space()='Product Authenticity']")
	WebElement productauthenticity;

	@FindBy(xpath = "//*[contains(@class,'TrellForYoustyle__StyledReturnDetails-sc-mjrr8m-22 bLLAlt')]")
	WebElement returnproduct;

	@FindBy(xpath = "//div[contains(text(),'COD Available')]")
	WebElement cod;

	@FindBy(xpath = "//*[contains(.,'Similar Products')]")
	WebElement similarproduct;

	@FindBy(xpath = "//*[.='Customer also bought']")
	WebElement customer_also_bought;

	@FindBy(xpath = "//p[normalize-space()='Additional Information']")
	WebElement additionalinfo;

	@FindBy(xpath = "//*[contains(.,'Hand Washes')]")
	WebElement breadcrumbs;

	@FindBy(xpath = "//*[contains(.,'Home')]")
	WebElement go_to_home;

	//--------------------------------------//
	WebDriver driver;

	public PdpAllDetailsPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	public void BodyBath() {
		body_bath.click();
	}

	public void SoapProduct() {
		soap_product.click();
	}

	public void P_Name() {
		try{
			soap_name.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void P_Review() {
		try{
			review.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void P_Price() {
		try{
			price.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void Actual_Price() {
		try{
			actualprice.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void Offer() {
		try{
			offer.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void ExpectedDeliveryDate() {
		try{
			expecteddeliverydate.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void SaveBtn() {
		try{
			savebutton.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void AddtoBag() {
		try{
			addtobag.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void BrandName() {
		try{
			brandname.isDisplayed();
		}catch (Exception e){
			return;
		}
	}
	public void ExpiryDate() {
		try{
			expiry.isDisplayed();
		}catch (Exception e){
			return;
		}
	}
	public void AboutProduct() {
		try{
			aboutproduct.isDisplayed();
		}catch (Exception e){
			return;
		}
	}
	public void MakeItSpecial() {
		try{
			whatmakeitspecial.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void GoodToKnow() {
		try{
			goodtoknow.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void Ingredient() {
		try{
			ingredient.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void HowToUse() {
		try{
			howtouse.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void ProductAuthenticity() {
		try{
			productauthenticity.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void ReturnProduct() {
		try{
			returnproduct.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void CashOnDelivery() {
		try{
			cod.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void SimilarProduct() {
		try{
			similarproduct.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void Customer_Also_Bought() {
		try{
			customer_also_bought.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void AdditionalInfo() {
		try{
			additionalinfo.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void Breadcrumbs() {
		try{
			breadcrumbs.isDisplayed();
		}catch (Exception e){
			return;
		}
	}

	public void HomePage(){go_to_home.click();}
//-----------validation------------------//

	public void bodybath_page_validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Bath & Body']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Bath & Body']")).isDisplayed());
	}
	public void details_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[normalize-space()='Bath & Body']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[normalize-space()='Bath & Body']")).isDisplayed());
	}
}
