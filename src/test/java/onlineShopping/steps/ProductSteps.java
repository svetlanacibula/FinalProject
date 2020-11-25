package onlineShopping.steps;

import cucumber.api.java.en.And;
import onlineShopping.pages.ProductFilterPage;
import onlineShopping.pages.ProductPage;

public class ProductSteps {
    ProductFilterPage filter = new ProductFilterPage();
    ProductPage product = new ProductPage();

    @And("Go to product page")
    public void goToProductPage() {
        filter.setOpenProductPage();
    }

    @And("Add product to cart")
    public void addProductToCart() {
        product.setProductName();
        product.setAddToCart();
    }
}
