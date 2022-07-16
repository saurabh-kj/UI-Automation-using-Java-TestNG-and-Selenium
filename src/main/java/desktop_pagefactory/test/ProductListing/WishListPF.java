package desktop_pagefactory.test.ProductListing;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.DriverClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static utils.extent.ExtentTestManager.getTest;

public class WishListPF extends DriverClass {

    @FindBy(xpath = "//header/div[@id='navigationHeader']/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement hair;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[2]")
    WebElement hairpfor;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]")
    WebElement addBag;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]")
    WebElement remBag;

    @FindBy(xpath = "(//span[@class='ProductTilestyle__WishListIcon-sc-1bpfvho-13 bPyhqf'])[1]")
    WebElement AddProductToWishList;

    @FindBy(xpath = "(//span[@class='ProductTilestyle__WishListIcon-sc-1bpfvho-13 bPyhqf'])[1]")
    WebElement ClickOnProductWishlist;

    @FindBy(xpath = "//div[@class='messageContainer']")
    WebElement wishlistStatus;

    @FindBy(xpath = "//button[@class='cartButton']")
    WebElement viewBag;

    @FindBy(xpath = "(//img)[6]")
    WebElement ProfileIcon;

    @FindBy(xpath = "//button[normalize-space()='My Wish List']")
    WebElement MyWishList;

    @FindBy(xpath = "//span[@class='product-text-3nU'][normalize-space()='Save For Later'][1]")
    WebElement btn_wishCart;

    @FindBy(xpath = "//*[@viewBox='0 0 16 20']")
    WebElement wishlistIcon;

    @FindBy(xpath = "//div[contains(text(), 'Item is already wishlisted, please remove' )]")
    WebElement wishFailToast;

    @FindBy(xpath = "//div[contains(text(), 'Item saved to Wishlist' )]")
    WebElement wishSuccessToast;

    @FindBy(xpath = "//div[contains(text(),'Saved')]")
    WebElement ECWishlistPDP;

    @FindBy(xpath = "//span[contains(text(),'Sirona Depigmentation Face Serum Vitamin C, 30ml')]")
    WebElement ECProductName;

	//---------------------Add product from PD page----------------------//
	@FindBy(xpath = "//div[@id='1']//div[1]//div[1]//div[2]//a[1]")
	WebElement product;

	@FindBy(xpath = "//button[@class='addSaveToBagstyle__SaveToBag-sc-ims6j7-1 ixbjmb']")
	WebElement btn_addToWishList;

	//--------------------Wishlist page from Header-------------------//
	@FindBy(xpath = "//div[@class = 'header-my_account_wrapper-2hM'] || //ul[@class='loggedInwrap']")
	WebElement header;

	@FindBy(xpath = "//div[@class='header-cedDropDown-3WQ']//a[normalize-space()='My Wish List'] || //button[normalize-space()='My Wish List']")
	WebElement wishlistOption;


//-------------------------------Methods----------------------------//

    WebDriverWait shortWait, longWait;
    final WebDriver driver;

    public WishListPF(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        //PageFactory.initElements(driver, ProductDetailsPF.class)
    }

    public void hair() {
        hair.click();
    }

    public void hairfor() {
        hairpfor.click();
    }

    public void addbag() {
        addBag.click();
    }

    public void removefrombag() {
        remBag.click();
    }


    public void WishlistFromCart() throws InterruptedException {
        viewBag.click();
        WebDriverWait longWait = new WebDriverWait(driver, 30);
        By plpPage = By.xpath("//button[normalize-space()='Add to Bag']");
        longWait.until(ExpectedConditions.invisibilityOfElementLocated(plpPage));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String wishProduct = driver.findElement(By.className("product-name-22W")).getText();
        //Click all available Save for Later button
        By button = By.xpath("//span[@class='product-text-3nU'][normalize-space()='Save For Later'][1]");
        longWait.until(ExpectedConditions.visibilityOfElementLocated(button));
/*		List<WebElement> buttons = driver.findElements(By.xpath("(//span[@class='product-saveForLaterBtn-3fs']//span[@class='product-text-3nU']"));
		for (int i = 0; i < buttons.size(); i++){
			buttons.get(i).click();
			Thread.sleep(3000);*/
        btn_wishCart.click();
        try {
            if (wishSuccessToast.isDisplayed()) {
                getTest().log(Status.PASS, "Item is wishlisted successfully");
                System.out.println("Item is wishlisted successfully");
            } else if (wishFailToast.isDisplayed()) {
                getTest().log(Status.PASS, "Item is already wishlisted");
                System.out.println("Item is already wishlisted");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry!!! not able to capture the toast at the moment.");
        }
    }

	public void navigateMyWishlist(){
//		longWait = new WebDriverWait(driver, 20);
//		longWait.until(ExpectedConditions.visibilityOf(header));
		Actions action = new Actions(driver);
		action.moveToElement(header).perform();
		wishlistOption.click();
	}

	public void verifyWishlistedItem(){
//		navigateMyWishlist();
		List<WebElement> allTitles = driver.findElements(By.className("item-productName-2bT"));
		System.out.println(allTitles);
        for (int i = 0; i < allTitles.size(); i++) {
            String title = allTitles.get(i).getText();
            System.out.println(title);
        }
	}

    public void validatewishlistPDP() {
        ClickOnProductWishlist.click();
        String ACWishlistPDP = "Saved";
        Assert.assertEquals(ACWishlistPDP, ECWishlistPDP.getText());
        System.out.println(ECWishlistPDP.getText());
        ECWishlistPDP.click();
    }

    public void addToWishlistFromPDP() throws InterruptedException {
		longWait = new WebDriverWait(driver, 30);
        Thread.sleep(3000);
        product.click();
//        By btn_addToBag = By.xpath("//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ");
        longWait.until(ExpectedConditions.elementToBeClickable(btn_addToWishList));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
		btn_addToWishList.click();
    }

    public void Profilewishlist() throws InterruptedException {
        ProfileIcon.click();
        MyWishList.click();
        Thread.sleep(5000);
    }

    public void WishListValidation() {
        String ACProductName = "Sirona Depigmentation Face Serum Vitamin C, 30ml";
        Assert.assertEquals(ACProductName, ECProductName.getText());
        System.out.println(ECWishlistPDP.getText());
        ECWishlistPDP.click();
    }

    public void clickOnWishlistOnPLP() throws InterruptedException {
        Thread.sleep(3000);
        wishlistIcon.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("Wishlisted the product.");
        toastSuccess();
    }

    public void toastSuccess() throws InterruptedException {
//		Thread.sleep(2000);
        try {
            if (wishlistStatus.isDisplayed()) {
                if (wishlistStatus.getText().equals("Item Wishlisted")) {
                    System.out.println(wishlistStatus.getText());
                }
            }
        } catch (Exception e) {
            System.out.println("Item is not wishlisted. Caught some error");
        }

    }

}
