package onlineShopping.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static onlineShopping.models.ProductModel.setTempProductName;

public class ProductPage {

    private SelenideElement productName = $("h1");
    private SelenideElement addToCart = $(".icon-cart");
    private SelenideElement goToCart = $(withText("pirkumu grozu"));

    public void setProductName() {
        setTempProductName(productName.getOwnText());
    }

    public void setAddToCart() {
        addToCart.click();
    }

    public void setGoToCart() {
        goToCart.click();
    }


}
