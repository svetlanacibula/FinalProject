package onlineShopping.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static onlineShopping.models.ProductModel.*;

public class CartPage {
    private SelenideElement productPrice = $(".detailed-cart-item__total");
    private SelenideElement finalPrice = $("#cart-full-total-price");
    private SelenideElement productFinalName = $(".detailed-cart-item__name-link");
    private SelenideElement cartCheckout = $(byValue("Veikt apmaksu"));
    private SelenideElement containerForGuest = $("#new_user_guest");
    private SelenideElement incognitoEmail = containerForGuest.$("#user_email");
    private SelenideElement incognitoSubmit = containerForGuest.$(".users-session-form__submit");


    public void setProductPrice() {
        setTempPrice(productPrice.getOwnText());
    }

    public void checkProductPrice() {
        finalPrice.shouldHave(text(getTempPrice()));
    }

    public void checkProductFinalName() {
        productFinalName.shouldHave(text(getTempProductName()));
    }

    public void setCartCheckout() {
        finalPrice.scrollTo();
        cartCheckout.click();
    }

    public void setIncognitoEmail(String customerEmail) {
        incognitoEmail.setValue(customerEmail);
    }

    public void setIncognitoSubmit() {
        incognitoSubmit.click();
    }


}
