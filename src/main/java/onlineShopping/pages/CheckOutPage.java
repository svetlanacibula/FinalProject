package onlineShopping.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static onlineShopping.models.ProductModel.getTempPrice;

public class CheckOutPage {

    private SelenideElement deliveryOption = $(withText("ana klientu centr"));
    private SelenideElement deliveryAdress = $(".pickup-point-name");
    private SelenideElement firstName = $("#address_first_name");
    private SelenideElement lastName = $("#address_last_name");
    private SelenideElement phoneNumber = $("#address_phone_number");
    private SelenideElement totalPrice = $(".checkout-order-summary-total__price");
    private SelenideElement checkInfo = $(".checkout-shipping-continue-button");
    private SelenideElement paymentMethod = $$(".for-radio").get(1);

    public void setDeliveryOption() {
        deliveryOption.click();
    }

    public void setDeliveryAdress() {
        deliveryAdress.click();
    }

    public void setFirstName(String customerName) {
        firstName.setValue(customerName);
    }

    public void setLastName(String customerLastName) {
        lastName.setValue(customerLastName);
    }

    public void setPhoneNumber(String customerPhone) {
        phoneNumber.setValue(customerPhone);
    }

    public void validateProductPrice() {
        totalPrice.shouldHave(text(getTempPrice()));
    }

    public void setCheckInfo() {
        checkInfo.click();
    }

    public void setPaymentMethod() {
        paymentMethod.click();
    }
}
