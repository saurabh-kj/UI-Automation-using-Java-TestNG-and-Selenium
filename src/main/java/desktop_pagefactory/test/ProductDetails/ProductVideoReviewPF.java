package desktop_pagefactory.test.ProductDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import utils.DriverClass;

public class ProductVideoReviewPF extends DriverClass {


	@FindBy(xpath="//*[contains(text(),'Skin Care')]")
	WebElement skinproduct;

	@FindBy(xpath="//*[@class='ProductTilestyle__ProductName-sc-1bpfvho-3 gZLkfg']")
	WebElement subproduct;

	@FindBy(xpath="//*[@class='card']")
	WebElement reviewvideo;

	@FindBy(xpath="(//button[contains(@aria-label,'Go to next slide')])[2]")
	WebElement nextvideo;

	@FindBy(xpath="//*[contains(@src,'https://cdn.trell.co/images/orig/yEKceVOApD8puhRlwoiBzf8trKfLI4qY.svg?auto=format&fit=max&w=96')]")
	WebElement exitfromvideo;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement go_to_home;

	@FindBy(xpath = "//div[@class='card']")
	WebElement review_video_available;

	final WebDriver driver;
	public ProductVideoReviewPF(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}

	public void BathBody() {
		waitForElementToBeClickable(skinproduct);
		skinproduct.click();
	}
	public void BathBodyProduct() {
		subproduct.click();
	}
	public void VideoPlay() {
		waitForElementToBeClickable(reviewvideo);
		reviewvideo.click();
	}
	public void NextVideo() {
		nextvideo.click();
	}
	public void ExitFromVideo() {
		exitfromvideo.click();
	}
	public boolean CheckReviewVideoIsThere(){
		review_video_available.isDisplayed();
		return true;
	}
	//-------------------------------validations----------------------------//
	public void bath_baby_validation(){
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(.,'Skin Care')]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[contains(.,'Skin Care')]")).isDisplayed());
	}
	public void bath_body_for(){
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='All Skin types']//span[@class='iconWrap'][normalize-space()='All Skin types']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[@id='All Skin types']//span[@class='iconWrap'][normalize-space()='All Skin types']")).isDisplayed());
	}

}
