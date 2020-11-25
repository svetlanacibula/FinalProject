package onlineShopping.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import onlineShopping.models.CustomerModel;
import onlineShopping.pages.CheckOutPage;
import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.Selenide.sleep;

public class CheckOutSteps {
    CustomerModel customerModel = new CustomerModel();
    CheckOutPage checkout = new CheckOutPage();

    @And("Choose delivery option and enter name, last name, phone")
    public void chooseDeliveryOptionAndEnterNameLastNamePhone() {
        checkout.setDeliveryOption();
        checkout.setDeliveryAdress();
        checkout.setFirstName(customerModel.getCustomerName());
        checkout.setLastName(customerModel.getCustomerLastName());
        checkout.setPhoneNumber(customerModel.getCustomerPhone());
    }

    @And("Validate product price")
    public void validateProductPrice() {
        checkout.validateProductPrice();
    }

    @And("Go to next step")
    public void goToNextStep() {
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
        screenshot("lastScreen");
    }
}
