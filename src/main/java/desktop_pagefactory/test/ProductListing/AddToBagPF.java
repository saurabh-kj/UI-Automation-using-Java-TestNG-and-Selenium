package desktop_pagefactory.test.ProductListing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AddToBagPF {
	
    @FindBy(xpath="//header/div[@id='navigationHeader']/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1] | //a[normalize-space()='Fragrances']")
	WebElement fragrance;
	
    @FindBy(xpath="//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[2]")
	WebElement fragranceproduct;
	
	@FindBy(xpath="//span[contains(text(),'Add to Bag')]")
	WebElement addtobag;
	
	@FindBy(xpath="//span[contains(text(),'View Bag')]")
	WebElement viewbag;
	
	final WebDriver driver;
	public AddToBagPF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public void fragrance() {
		fragrance.click();
	}
	public void fragranceproduct() {
		fragranceproduct.click();
	}
	public void addbag() {
	addtobag.click();	
	}
	public void viewbag() {
		viewbag.click();
	}

}
