package desktop_pagefactory.test.Cart;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.DriverClass;

import java.util.List;

public class CartPagePF extends DriverClass {


//////////////With SSR Xpaths////

    @FindBy(id = "search-input")
    WebElement txt_searchbox;

    @FindBy(xpath = "//button[@xpath='1']")
    WebElement btn_close;

    @FindBy(xpath = "//button[normalize-space()='Add to Bag']")
    WebElement btn_addproduct;

    @FindBy(xpath = "//button[normalize-space()='View Bag']")
    WebElement btn_viewbag;

    @FindBy(xpath = "//span[contains(text(),'Lotus Herbals Safe Sun UV Screen Matte Gel Pa+++ S')]")
    WebElement txt_productname;

    @FindBy(xpath = "//button[normalize-space()='Makeup']")
    WebElement btn_MakeupBusinessGroupName;

    @FindBy(xpath = "//a[normalize-space()='Kidswear'] | //button[contains(text(), 'Kidswear')]")
    WebElement  category;

    @FindBy(xpath = "//a[@href='/?root=nav']")
    WebElement btn_BackToHomePage;

    @FindBy(xpath = "//*[contains(text(),'Add to Bag')]")
    WebElement AddProductOnPDPPage;

    @FindBy(xpath = "//*[contains(text(),'View Bag:')]")
    WebElement ViewBagOnPDP;

    @FindBy(xpath = "//button[@title='Increase Quantity']")
    WebElement btn_IncreaseProductQuanitity;

    @FindBy(xpath = "//button[@class='cartButton']")
    WebElement btn_Bagfromhome;

    @FindBy(xpath = "//button[normalize-space()='SHOP OUR PRODUCTS']")
    WebElement Btn_EmptyBagButton;

    @FindBy(xpath = "//div[@class='product-quantityWrap-1hb']//span[@class='section-text-380'][normalize-space()='Remove']")
    WebElement btn_removeitem;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/a[1]/div[1]/img[2]")
    WebElement btn_ProductImageOnBagPage;

    @FindBy(xpath = "//input[@id='coupon_code']")
    WebElement txt_PromoCodeField;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")
    WebElement btn_applyPromoCode;

    @FindBy(xpath = "//img[@alt='close']")
    WebElement btn_CloseButtononPromoCode;

    @FindBy(css = "main.main-root-1Ca div.main-page-2Ue:nth-child(2) div.category-categoryPage-1Pv section.category-gallery-2t8 div.category-gallery_wrapper-pST div.gallery-root-2sM div.gallery-items-138 div.item-root-3CB:nth-child(1) div.item-wishlist_addition-1nD button.item-addToWishListBtn-eVk span.item-inWishlist-1Mk > svg:nth-child(1)")
    WebElement btn_wishlist;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/header[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/span[3]")
    WebElement btn_ViewProflieList;

    @FindBy(linkText = "My Wish List")
    WebElement btn_MyWishList;

    @FindBy(xpath = "//span[@class='totalsSummary-proceedButtonText-1Kl']//span[contains(text(),'Proceed')] | //span[normalize-space()='Proceed']")
    WebElement btn_Proceed;

    //(xpath = "//span[contains(text(),'Change')]")
    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[3]/label[1]/div[1]/button[1]/span[1]")
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

    @FindBy(xpath = "//button[@title='Decrease Quantity']")
    WebElement btn_lowerProductQunitity;

    @FindBy(xpath = "(//button[@title='Increase Quantity'])[1]")
    WebElement btn_HighertheProductQuanity;

    @FindBy(xpath = "(//button[@title='Decrease Quantity'])[1]")
    WebElement btn_LowertheProductQuanity;

    //	@FindBy(xpath = "ul[1]/li[1]/div[1]/div[1]/a[1]/div[1]/img[2]")
    @FindBy(xpath = "//img[@class='product-image-2L2 image-loaded-2-o']")
    WebElement btn_ClickOnProduct;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/article[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/img[2]")
    WebElement Clk_ProductOnPLP;

    // To find list of all products
    @FindBy(xpath = "//ul[@class='productList-root-1dQ']")
    WebElement productList;
    ////////////////////////////////////////////

    //ValidationsXpaths

    @FindBy(xpath = "//span[contains(text(),'Insight Cosmetics Nail Polish Remover Wipes - 30 S')]")
    WebElement Get_ProductTextOnProductsPage;

    @FindBy(xpath = "//div[contains(text(),'Insight Cosmetics Nail Polish Remover Wipes - 30 S')]")
    WebElement Get_ProductTextOnCartPage;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1)")
    public
    WebElement ECProductName;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > h2:nth-child(1)")
    public
    WebElement ECProductNameNext;

    @FindBy(css = ".product-name-22W")
    public
    WebElement ACProductName;

    @FindBy(xpath = "(//div[@class='product-name-22W'])[2]")
    public WebElement ACProductNameNext;


    @FindBy(xpath = "//h3[normalize-space()='Your Bag is empty']")
    WebElement ECCartEmpty;

    @FindBy(xpath = "//span[contains(text(),'Select and Proceed')]")
    WebElement btn_SelectAndProcessWithAddress;

    @FindBy(xpath = "//body/div[@id='__next']/div[3]/div[3]/div[9]/div[2]/div[2]/img[1]")
    WebElement Clk_BestSeller;

    @FindBy(xpath = "//body[1]/div[2]/div[3]/div[3]/div[9]/div[2]/div[3]/img[1]")
    WebElement Clk_SameProduct;

    @FindBy(xpath = "//span[contains(text(),'Best Selling Mascara')]")
    WebElement ECBestSeller;

    @FindBy(xpath = "//span[contains(text(),'More products from Maybelline New York')]")
    WebElement ECSameProduct;

    @FindBy(xpath = "//span[contains(text(),'maybelline new york')]")
    WebElement ECSameProductPage;

    @FindBy(xpath = "//span[contains(text(),'Sign Out')]")
    WebElement btn_logout;

    @FindBy(xpath = "//button[normalize-space()='View 10 Colors']")
    WebElement btn_viewoptions;

    @FindBy(xpath = "//span[normalize-space()='Blue']")
    WebElement btn_ChooseColours;

    @FindBy(xpath = "(//img[@alt='img'])[4]")
    WebElement ClickOnProducttoPD;

    @FindBy(xpath = "//button[@class='reaminaingOffers']")
    WebElement btn_ClickOnOffers;

    @FindBy(xpath = "//div[normalize-space()='You can only add a maximum of 29 products in your Cart.'] | //div[@class='messageContainer']")
    WebElement btn_Maxtoast;

    //-------------------Wish-List Validation---------------------------------//

    @FindBy(xpath = "//h2[normalize-space()='Simple Product 1894']")
    public
    WebElement pdp_page_product_name;

    @FindBy(xpath = "//div[@class='product-name-22W']")
    WebElement bag_page_product_name;

    //---------------------Add product from PD page----------------------//
    @FindBy(xpath = "//div[@id='1']//div[1]//div[1]//div[2]//a[1]")
    WebElement product;

    @FindBy(xpath = "//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ']")
    WebElement btn_addToBag;


//--------------------------------------------------------------------//

    WebDriver driver;
    WebDriverWait shortWait, longWait;

    public CartPagePF(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
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
        Thread.sleep(5000);
        btn_addproduct.click();
        btn_viewbag.click();
    }

    public void addProductFromPDP() throws InterruptedException {
        // now wait for the Category to be clickable and click it.
        Thread.sleep(3000);
        product.click();
//        By btn_addToBag = By.xpath("//button[@class='addSaveToBagstyle__AddToBagWrap-sc-ims6j7-4 cdJEpQ");
        longWait.until(ExpectedConditions.elementToBeClickable(btn_addToBag));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        btn_addToBag.click();
    }

    public void AddProducts() throws InterruptedException {
        Thread.sleep(5000);
        btn_addproduct.click();
        //btn_viewbag.click();
    }


    public void AddProductANdViewOnPDP() {
        AddProductOnPDPPage.click();
        ViewBagOnPDP.click();
    }

    public void ClickOnCategory() throws InterruptedException {
        // wait for the alert to appear and then disappear
        shortWait = new WebDriverWait(driver, 3);
        longWait = new WebDriverWait(driver, 30);
        By loginPopup = By.xpath("//div[@class='LoginModalstyle__StyledModal-sc-gdaafp-0 aCrgk']");
//        shortWait.until(ExpectedConditions.visibilityOfElementLocated(loginPopup));
        longWait.until(ExpectedConditions.invisibilityOfElementLocated(loginPopup));
        System.out.println("About to click the category.");

        // now wait for the Category to be clickable and click it.
        shortWait.until(ExpectedConditions.elementToBeClickable(category));
        category.click();
    }

    public void BackToHome() throws InterruptedException {
        Thread.sleep(4000);
        btn_BackToHomePage.click();
    }

    public void ChangeProductQuantity() {
        btn_IncreaseProductQuanitity.click();
        //btn_BackToHomePage.click();
    }


    public void RemoveProductFromBag() throws InterruptedException {
//		btn_BackToHomePage.click();
//		btn_Bagfromhome.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Locating element by xpath text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//*[normalize-space()='Remove']"));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(5000);
        btn_removeitem.click();
    }

    public void RemoveProduct() throws InterruptedException {
        Thread.sleep(5000);
        btn_removeitem.click();
    }


    public void EmptyBag() {
        Btn_EmptyBagButton.click();
    }

    public void clickOnMyBag() throws InterruptedException {
        Thread.sleep(4000);
        btn_Bagfromhome.click();
    }

    public void ProductImageOnBagPage() {
        btn_ProductImageOnBagPage.click();
    }

    public void ApplyPromoCode(String CouponCode) {
        //txt_PromoCodeField.click();
        txt_PromoCodeField.sendKeys(CouponCode);
        btn_applyPromoCode.click();
    }


    public void AddProductToWishlist() {
        btn_wishlist.click();
    }

    public void WishlistOnProfile() {
        btn_ViewProflieList.click();
        btn_MyWishList.click();
    }

    public void ClickOnCheckOut() throws InterruptedException {
        Thread.sleep(5000);
        btn_Proceed.click();
    }

    public void ClickOnAddAdressPage() {
        btn_ScrollUp.click();
        btn_ChangeAddressButton.click();
        btn_AddNewAddressButton.click();
        btn_AddAddressButton.click();
    }

    public void EnterAddressPageFullName(String FullName) throws InterruptedException {
        //btn_ScrollUp.click();
        Thread.sleep(5000);
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

    public void clickOnVerifyAddAddress() throws InterruptedException {
        btn_AddAddressButton.click();
        btn_SelectAndProcessWithAddress.click();
        Thread.sleep(5000);
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

    public void LowerProductQuantity() {
        btn_lowerProductQunitity.click();
    }


    public void IncreaseProductFromBag() throws InterruptedException {
//		btn_ScrollUp.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Locating element by xpath text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//Span[normalize-space()='Remove']"));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(5000);
        btn_HighertheProductQuanity.click();
        Thread.sleep(5000);
    }

    public void IncreaseProductFromBagMaxOut() throws InterruptedException {
//		btn_ScrollUp.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Locating element by xpath text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//Span[normalize-space()='Remove']"));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(5000);
        for (int i = 0; i <= 3; i++) {
            btn_HighertheProductQuanity.click();
            Thread.sleep(3000);
        }
        Thread.sleep(5000);
    }

    public void DecreaseProductFromBag() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Locating element by xpath text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//Span[normalize-space()='Remove']"));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(5000);
        btn_LowertheProductQuanity.click();
    }

    public void ClickOnProductCart() throws InterruptedException {
        Thread.sleep(5000);
        btn_ClickOnProduct.click();
    }

    public void TextValidationsOnProductPage() {
        //validation
        String ProductNameInPD = Get_ProductTextOnProductsPage.getText();
        String ProductNameInCart = Get_ProductTextOnCartPage.getText();

        //compare the text
        if (ProductNameInCart.equals(ProductNameInPD)) {
            System.out.println("The actual and expected results are same.Title of Product is" + ProductNameInCart);
        }
    }

    public void ValidateproductNameTag(String addproducttext) {
        Assert.assertEquals(addproducttext, ACProductName.getText());
        System.out.println(ACProductName.getText());
        System.out.println(addproducttext);
    }

    public void ValidateproductNameTagNext(String addproducttextNext) {
        Assert.assertEquals(addproducttextNext, ACProductNameNext.getText());
        System.out.println(ACProductName.getText());
        System.out.println(addproducttextNext);
    }

    public void EmptyBagValidationonBag() {
        String ACCartEmpty = "Your Bag is empty";

//		ECCartEmpty.getText();
        Assert.assertEquals(ACCartEmpty, ECCartEmpty.getText());
        System.out.println("Product should be added to whish-list and colour of whish-list icon should be change in to orrange");
    }

    public void ProductImgInProductListPage() {
        Clk_ProductOnPLP.click();
    }


    public void AreLookingSession() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Locating element by xpath text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'Are you looking for')]"));

        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(5000);
    }


    public void ClickOnBestSeller() throws InterruptedException {
        Clk_BestSeller.click();
        Thread.sleep(5000);
    }

    public void ValidateBestSeller() {
        String ACBestSeller = "Best Selling Mascara";
        ECBestSeller.getText();
        Assert.assertEquals(ACBestSeller, ECBestSeller.getText());

    }


    public void ClickOnSameBrand() throws InterruptedException {
        Clk_SameProduct.click();
        Thread.sleep(5000);
    }

    public void ValidateSameBrand() {
        String ACSameProduct = "More products from Maybelline New York";
        ECSameProduct.getText();
        Assert.assertEquals(ACSameProduct, ECSameProduct.getText());
    }

    public void ValidationOFPageSammeBrand() {
        String ACSameProductPage = "Maybelline New York";
        ECSameProductPage.getText();
        Assert.assertEquals(ACSameProductPage, ECSameProductPage.getText());
    }

    public void Logout() {
        btn_ViewProflieList.click();
        btn_logout.click();
    }


    public void PDPClickOnOffers() {
//        waitForElementToBeClickable(ClickOnProducttoPD);
        ClickOnProducttoPD.click();
        btn_ClickOnOffers.click();

    }

    public void ClickViewOption() throws InterruptedException {
        btn_viewoptions.click();
        Thread.sleep(3000);
        btn_ChooseColours.click();

    }

    public void CountOfNthProduct() {
        Actions actions = new Actions(driver);
        Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
        sendEsc.perform();
        Action sendpagedown = actions.sendKeys(Keys.PAGE_DOWN).build();
        sendpagedown.perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpathrows = "//*[@class=\"ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb\"]/div";
        List<WebElement> listTotal = driver.findElements(By.xpath(xpathrows));

        System.out.println("total no of rows" + listTotal.size());

        for (int i = 1; i <= listTotal.size(); i++) {
            String xpathcolms = "//*[@class=\"ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb\"]/div[" + i + "]/div[2]";
            List<WebElement> listColm = driver.findElements(By.xpath(xpathcolms));

            System.out.println("Total No of Columns" + listColm.size());

            for (int j = 1; j < listColm.size(); j++) {
//				String xpathforProductName = "//*[@class=\"ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb\"]/div["+i+"]/div/div[1]/div[2]/a/div/div[2]/h2[2]";//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]/h2
                String xpathforProductName = "//*[@class=\"ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb\"]/div[" + i + "]/div";   ///div[1]/div[1]/div[2]/a[1]/div[1]/div[2]/h2";
//				WebElement contentEle = driver.findElement(By.xpath(xpathforProductName));
//				System.out.println(contentEle.getText().toString());
            }
            System.out.println("-------------------");
        }
    }


    public void NoOfOffers() {
        Actions actions = new Actions(driver);
        Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
        sendEsc.perform();
        Action sendpagedown = actions.sendKeys(Keys.PAGE_DOWN).build();
        sendpagedown.perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String xpathrows = "//*[@class='offersWrapper']/div";
        List<WebElement> listTotal = driver.findElements(By.xpath(xpathrows));
        System.out.println("total no of rows" + listTotal.size());

//		for (int i = 4; i <= listTotal.size(); i++) {
        String xpathcolms = "//*[@class='offersWrapper']/div/span";
        List<WebElement> listColm = driver.findElements(By.xpath(xpathcolms));

        System.out.println("Total No of Columns" + listColm.size());
//		}

        for (int j = 2; j <= listTotal.size(); j++) {
//				String xpathforProductName = "//*[@class=\"ProductListstyle__ProductListContainer-sc-1r0vbhp-0 fIkKJb\"]/div["+i+"]/div/div[1]/div[2]/a/div/div[2]/h2[2]";//div[1]//div[1]//div[2]//a[1]//div[1]//div[2]/h2
            String xpathforOffersName = "//*[@class='offersWrapper']/div[" + j + "]/div/div/div/span";
//            WebElement contentEle = driver.findElement(By.xpath(xpathforOffersName));


//            System.out.println(contentEle.getText().toString());
        }
        System.out.println("-------------------");
    }


    public void AddProductMaxinProductList() throws InterruptedException {
        Actions actions = new Actions(driver);
        Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
        sendEsc.perform();
        Action sendpagedown = actions.sendKeys(Keys.PAGE_DOWN).build();
        sendpagedown.perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String AddProductsinlist = "//button[normalize-space()='Add to Bag']";
        List<WebElement> listTotal = driver.findElements(By.xpath(AddProductsinlist));

        System.out.println("total no of rows" + listTotal.size());

        for (int i = 0; i <= listTotal.size() * 3; i++) {
//				if(btn_Maxtoast.isDisplayed()){
//					break;
//				}
            btn_addproduct.click();
            Thread.sleep(3000);

        }
//		}
    }

    public void ValidationOnMax() {
        String MaxToastMessage = "You can only add a maximum of 29 products in your Cart.";
        Assert.assertEquals(MaxToastMessage, btn_Maxtoast.getText());

    }

    public void ProductListCount() throws InterruptedException {

        Actions actions = new Actions(driver);
        Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
        sendEsc.perform();
        Action sendpagedown = actions.sendKeys(Keys.PAGE_DOWN).build();
        sendpagedown.perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String AddProductsinlist = "//ul[@class='productList-root-1dQ']/li";
        List<WebElement> listTotal = driver.findElements(By.xpath(AddProductsinlist));

        System.out.println("total no of productlist" + listTotal.size());
    }


    public void RemoveCompleteListFromCart() throws InterruptedException {

        Actions actions = new Actions(driver);
        Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
        sendEsc.perform();
        Action sendpagedown = actions.sendKeys(Keys.PAGE_DOWN).build();
        sendpagedown.perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String AddProductsinlist = "//ul[@class='productList-root-1dQ']/li";
        List<WebElement> listTotal = driver.findElements(By.xpath(AddProductsinlist));

        System.out.println("total no of productlist" + listTotal.size());

        for (int i = 1; i <= listTotal.size(); i++) {
            btn_removeitem.click();
            driver.navigate().refresh();
            Thread.sleep(4000);
        }
    }


    public void wishlist_validation(String productName) {
        Assert.assertEquals(productName, bag_page_product_name.getText());
    }


    //To find list of all products on Cart page.
    public void listOfAllProducts() {
        List<WebElement> allProducts = productList.findElements(By.tagName("li"));
        for (int i = 1; i < allProducts.size(); i++) {
            System.out.println(allProducts.get(i).getText());
        }
    }

}

