package onlineShopping.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    private SelenideElement searchField = $(Selectors.byId("q"));
    private SelenideElement submitButton = $(".main-search-submit ");
    private SelenideElement productSection = $$(".sn-filter-link").get(1);
    private SelenideElement monitorSection = $$(".sn-filter-link").get(1);
    private SelenideElement cookieAccept =$("#CybotCookiebotDialogBodyButtonAccept ");

    public void searchProduct(String productType) {
        searchField.setValue(productType);
    }

    public void setSubmitButton() {
        submitButton.click();
    }

    public void setProductSection() {
        productSection.click();
    }

    public void setMonitorSection() {
        monitorSection.click();
    }

    public void setCookieAccept () {
        if(cookieAccept.exists()){
            cookieAccept.click();
        }
    }

}
