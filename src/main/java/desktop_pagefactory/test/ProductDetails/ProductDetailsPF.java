package desktop_pagefactory.test.ProductDetails;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

	public class ProductDetailsPF {
		
		@FindBy(xpath="//*[@href='/kidswear/c/772']")
		WebElement other;
		
		@FindBy(xpath="//*[@class='ProductTilestyle__ImageContainer-sc-1bpfvho-16 dFLALf']")
		WebElement selectproduct;

		@FindBy(xpath="//*[@class='Heading-sc-1ciy20x-0 ihzFTn']")
		WebElement productname;

		@FindBy(xpath="//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
		WebElement addtobag;
		
		@FindBy(className="//button[@class='addSaveToBagstyle__SaveToBag-sc-ims6j7-1 ixbjmb']")
		WebElement save;
//................CLick on image...........//
		
		@FindBy(xpath="//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
		WebElement image1;
		
		@FindBy(xpath="//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
		WebElement image2;
		
		@FindBy(xpath="//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/img[1]")
		WebElement image3;

		@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
		WebElement go_to_home;

		final WebDriver driver;
		public ProductDetailsPF(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
			//PageFactory.initElements(driver, ProductDetailsPF.class);
		}

		public void Other() {
			other.click();
		}
	    public void SelectProduct() {
	    	selectproduct.click();
	    }
	    public void addbag() {
	    	addtobag.isDisplayed();
	    }
	    public void save() {
	    	save.isDisplayed();
	    }
	    public void image1() {
	    	image1.click();
	    }
	    public void image2() {
	    	image2.click();
	    }
	    
	    public void image3() {
	    	image3.click();
	    }
	    
	    
	}


