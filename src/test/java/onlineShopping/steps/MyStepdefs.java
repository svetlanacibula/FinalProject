package onlineShopping.steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import onlineShopping.models.CustomerModel;
import onlineShopping.models.ProductModel;
import onlineShopping.pages.*;

import static com.codeborne.selenide.Selenide.*;

public class MyStepdefs {

    HomePage home = new HomePage();
    ProductModel productModel = new ProductModel();
    ProductFilterPage filter = new ProductFilterPage();
    ProductPage product = new ProductPage();
    CartPage cart = new CartPage();
    CustomerModel customerModel = new CustomerModel();
    CheckOutPage checkout = new CheckOutPage();

    @Before
    public void setUp() {
        Configuration.startMaximized = true;
    }

    @Given("Open 1a homepage")
    public void open1AHomepage() {
        open("https://www.1a.lv/");
    }

    @When("Search for product and choose it from left menu and from submenu")
    public void searchForProductAndChooseItFromLeftMenuAndFromSubmenu() {
        home.searchProduct(productModel.getProductType());
        home.setSubmitButton();
        home.setProductSection();
        home.setMonitorSection();
    }

    @And("Choose highly rated filter and first available brand")
    public void chooseHighlyRatedFilterAndFirstAvailableBrand() {
        filter.setProductRate();
        filter.setFindBrandSection();
        filter.setFirstAvailableBrand();
    }

    @And("Go to product page")
    public void goToProductPage() {
        filter.setOpenProductPage();
    }

    @And("Add product to cart")
    public void addProductToCart() {
        product.setProductName();
        product.setAddToCart();
    }

    @Then("Go to cart and enter email to submit without registration")
    public void goToCartAndEnterEmailToSubmitWithoutRegistration() {
        product.setGoToCart();
        cart.setProductPrice();
        cart.checkProductFinalName();
        cart.setCartCheckout();
        cart.setIncognitoEmail(customerModel.getCustomerEmail());
        cart.setIncognitoSubmit();
    }

    @And("Choose delivery option and enter name, last name, phone")
    public void chooseDeliveryOptionAndEnterNameLastNamePhone() {
        checkout.setDeliveryOption();
        checkout.setDeliveryAdress();
        checkout.setFirstName(customerModel.getCustomerName());
        checkout.setLastName(customerModel.getCustomerLastName());
        checkout.setPhoneNumber(customerModel.getCustomerPhone());
        checkout.checkingProductPrice();
        checkout.setCheckInfo();
        sleep(2000);
        checkout.setCheckInfo();
    }

    @And("Choose payment method")
    public void choosePaymentMethod() {
        checkout.setPaymentMethod();
    }

    @After
    public void takeScreenshot() {
        screenshot("TestFinalScreen");
    }
}
