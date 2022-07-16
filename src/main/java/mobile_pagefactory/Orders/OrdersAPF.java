package mobile_pagefactory.Orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class OrdersAPF {
    @FindBy(xpath = "(//img)[6]")
    WebElement btn_ClickOnProfile;


    //comments
    @FindBy(xpath = "//*[normalize-space()='My orders']")
    WebElement btn_MyOrders;

    @FindBy(xpath = "//*[@class='signInText']")
    WebElement btn_MyAccount;

    @FindBy(xpath = "//span[@class='order-details-order-no__value-39o'][1]")
            WebElement OD_OrderID;

    @FindBy(xpath = "//span[@class='order-details-order-placed__value-1Df'][1]")
            WebElement OD_OrderPlacedDateTime;

    @FindBy(xpath = "//span[@class='order-details-total__net-pay-1NR'][1]")
            WebElement OD_OrderTotal;

    @FindBy(xpath = "//span[@class='order-details-payment__method-type-1I8'][1]")
            WebElement OD_PaymentMethod;

    @FindBy(xpath = "//p[@class='order-details-address-details__owner-23s']")
    WebElement OD_CustomerUserName;

    @FindBy(xpath = "//p[@class='order-details-address-details__user-address-2Vs']")
            WebElement OD_DeliveryAddress;

    @FindBy(xpath = "//span[@class='order-details-address-details__ownerNumber-261']")
            WebElement OD_MobileNo;

    @FindBy(xpath = "//span[@class='order-details-orderDetails__vendorName-1wS']")
            WebElement OD_VendorName;

    @FindBy(xpath = "//p[@class='order-details-order-details__vendor-sub-heading-3Kk']")
            WebElement OD_Status;

    @FindBy(xpath = "//p[@class='order-details-order-details__vendorTatInfo-oxz']")
            WebElement OD_ExpectedStatus;

    @FindBy(xpath = "//div[@class='order-details-price-details__pay-breakup-1Jt']//span[@class='order-details-pay-breakup__amt-23L']")
    WebElement OD_Subtotal;

    @FindBy(xpath = "//div[@class='order-details-order-details__price-details-2m0']//div[2]//span[2]")
    WebElement OD_PromotionalDiscounts;

    @FindBy(xpath = "//div[@class='order-details-order-details__price-details-2m0']//div[3]//span[2]")
    WebElement OD_ShippingCharges;

    @FindBy(xpath = "//div[@class='order-details-price-details__pay-breakup-1Jt order-details-pay-breakup--grand-total-3k7']//span[@class='order-details-pay-breakup__amt-23L']")
    WebElement OD_ToPay;

//    @FindBy(xpath = "//div[@class='order-listing-orderWrap-2Iv']["+i+"]/button[1]/div[1]/div[1]/p[2]")
//    WebElement OrderIDS;


    WebDriver driver;

    public OrdersAPF(WebDriver driver) {
        this.driver = driver;

        //PageFactory.initElements(driver, LoginWebPF.class);
        //AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    public void MyOrdersInProfile() throws InterruptedException {
        btn_MyAccount.click();
//        btn_ClickOnProfile.click();
        btn_MyOrders.click();
        Thread.sleep(5000);

    }

    public void MyOrdersCount() throws InterruptedException {

        List<WebElement> childs = driver.findElements(By.xpath("//div[@class='myAccount-account_contentBar-KCu myAccount-account_contentBar--noOverflow-1ox']/div")); //Change the class here based on Variant list classes
        System.out.println("Total number Orders: " + childs.size());
    }

    public void AllOrderDetails() throws InterruptedException {

        List<WebElement> childs = driver.findElements(By.xpath("//div[@class='myAccount-account_contentBar-KCu myAccount-account_contentBar--noOverflow-1ox']/div")); //Change the class here based on Variant list classes
        System.out.println("Total number of orders: " + childs.size());
        for(int i =1;i<=childs.size();i++)
        {
            String OrderIDS = "//div[@class='order-listing-orderWrap-2Iv']["+i+"]/button[1]/div[1]/div[1]/p[2]";
            WebElement OrderID = driver.findElement(By.xpath(OrderIDS));
            //This above 2 line fetch order ID fro My orders page

            System.out.println("Order ID:- "+OrderID.getText().toString());

            String OrderPlacedTime = "//div[@class='order-listing-orderWrap-2Iv']["+i+"]/button[1]/div[1]/div[2]/p[2]";
            WebElement OrderPlacedDateandTime = driver.findElement(By.xpath(OrderPlacedTime));
            //This above 2 line fetch order ID fro My orders page

            System.out.println("Order Placed:- "+OrderPlacedDateandTime.getText().toString());


            String OrderStatus = "//div[@class='order-listing-orderWrap-2Iv']["+i+"]/button[1]/div[2]/p[1]";
            WebElement OrderStatusofOrder = driver.findElement(By.xpath(OrderStatus));
            //This above 2 line fetch order ID fro My orders page

            System.out.println("Order Status:- "+OrderStatusofOrder.getText().toString());
            System.out.println("\n ------------------------------\n");
        }
    }

    public void OrderDetailsCompletedBreakdownMD() throws InterruptedException {

        List<WebElement> childs = driver.findElements(By.xpath("//div[@class='myAccount-account_contentBar-KCu myAccount-account_contentBar--noOverflow-1ox']/div")); //Change the class here based on Variant list classes
        System.out.println("Total number of orders: " + childs.size());
        for(int i =1;i<=childs.size();i++) {
            String OrderIDS = "//div[@class='order-listing-orderWrap-2Iv'][" + i + "]/button[1]/div[1]";
            WebElement OrderID = driver.findElement(By.xpath(OrderIDS));
            OrderID.click();
            //Above 3 lines clickon the order one after other

            System.out.println("Order ID:- " + OD_OrderID.getText());
            System.out.println("Order Placed Date and time:- " + OD_OrderPlacedDateTime.getText());
            System.out.println("Order Total:- " + OD_OrderTotal.getText());
            System.out.println("Payment Type:- " + OD_PaymentMethod.getText());

            System.out.println("UserName:- " + OD_CustomerUserName.getText() );
            System.out.println("Delivery Address:- " + OD_DeliveryAddress.getText());
            System.out.println("Mobile number:- " + OD_MobileNo.getText());

            System.out.println("Vendor Name:- " + OD_VendorName.getText());
            System.out.println("Delivery Status:- " + OD_Status.getText());
            System.out.println("Expected Status:- " + OD_ExpectedStatus.getText());



            List<WebElement> NoOfOffers = driver.findElements(By.xpath("//div[@class='order-details-order-details_product-tile-1FM']")); //Change the class here based on Variant list classes
            System.out.println("Total number of products: " + NoOfOffers.size());

            for(int j =1;j<=NoOfOffers.size();j++){
                String OD_ProductName = "//div[@class='order-details-order-details_product-tile-1FM'][" + j + "]/div[1]/p";
                WebElement ProductName = driver.findElement(By.xpath(OD_ProductName));
                System.out.println("Product Name "+j+" :- " + ProductName.getText());
                //Above 3 lines is to fetch Product name

                String OD_ProductPrice = "//div[@class='order-details-order-details_product-tile-1FM'][" + j + "]/div[1]/div[1]/span[2]";
                WebElement ProductPrice = driver.findElement(By.xpath(OD_ProductPrice));
                System.out.println("Product Price "+j+" :- " + ProductPrice.getText());
                //above 3 line to fetch Product price

                String OD_ProductQuantity = "//div[@class='order-details-order-details_product-tile-1FM'][" + j + "]/div[1]/div[1]/span[1]/span[1]";
                WebElement ProductQuantity = driver.findElement(By.xpath(OD_ProductQuantity));
                System.out.println("Product Price "+j+" :- " + ProductQuantity.getText());

                System.out.println("\n");


            }

            System.out.println("\n");
            System.out.println("Subtotal :- " + OD_Subtotal.getText());
            System.out.println("Promotional Discounts :- " + OD_PromotionalDiscounts.getText());
            System.out.println("Shipping Charges :- " + OD_ShippingCharges.getText());

            System.out.println("To Pay :-" + OD_ToPay.getText());
            Thread.sleep(5000);
            driver.navigate().back();
            System.out.println("\n------------------------------\n");

        }
    }


}
