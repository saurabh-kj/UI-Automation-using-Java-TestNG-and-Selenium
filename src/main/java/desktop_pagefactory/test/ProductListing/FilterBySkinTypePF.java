package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.DriverClass;

public class FilterBySkinTypePF extends DriverClass{
	//-------------------------mc-staging--------------------------------//

	@FindBy(xpath="//button[normalize-space()='Skin'] | //a[@href=\"/skin-care/c/6\"]")
	WebElement mekup;

	@FindBy(xpath="//span[normalize-space()='Skin Type']")
	WebElement skintype;

	@FindBy(xpath="//label[@for='Normal Skin']//span[@class='checkmark']")
	WebElement allskintype;

	@FindBy(xpath="//*[@class='cancelIcon']")
	WebElement exitfromfilter;


	final WebDriver driver;
	public FilterBySkinTypePF(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}
	public void  Mekup(){
		waitForElementToBeClickable(mekup);
		mekup.click();
	}
	public void skintype() {
		waitForElementToBeClickable(skintype);
		skintype.click();
	}
	public void allskintype() {
//		Actions actions = new Actions(driver);
//		Action sendpagedown =  actions.sendKeys(Keys.PAGE_DOWN).build();
//		sendpagedown.perform();
		waitForElementToBeClickable(allskintype);
		allskintype.click();
	}
	public void exitfromfilter() {
		waitForElementToBeClickable(exitfromfilter);
		exitfromfilter.click();
	}

	//----------------validations------------------------//
	public void mekup_page_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()='Skin']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Skin']")).isDisplayed());
	}
	public void skin_type_filter(){
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='All Skin types']//span[@class='iconWrap'][normalize-space()='Normal Skin']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[@id='All Skin types']//span[@class='iconWrap'][normalize-space()='Normal Skin']")).isDisplayed());
	}
}
