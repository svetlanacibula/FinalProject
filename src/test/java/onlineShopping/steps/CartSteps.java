package onlineShopping.steps;

import cucumber.api.java.en.And;
import onlineShopping.models.CustomerModel;
import onlineShopping.pages.CartPage;
import onlineShopping.pages.ProductPage;

public class CartSteps {

    CartPage cart = new CartPage();
    ProductPage product = new ProductPage();
    CustomerModel customerModel = new CustomerModel();

    @And("Proceed to cart")
    public void proceedToCart() {
        product.setGoToCart();
    }

    @And("Validate product name and set price")
    public void validateProductNameAndSetPrice() {
        cart.setProductPrice();
        cart.validateProductFinalName();
    }

    @And("Go to checkout")
    public void goToCheckout() {
        cart.setCartCheckout();
    }

    @And("Enter email to submit without registration")
    public void enterEmailToSubmitWithoutRegistration() {
        cart.setIncognitoEmail(customerModel.getCustomerEmail());
        cart.setIncognitoSubmit();
    }

}
