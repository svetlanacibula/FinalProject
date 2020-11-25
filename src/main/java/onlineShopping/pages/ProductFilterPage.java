package onlineShopping.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class ProductFilterPage {
    private SelenideElement productRate = $(Selectors.byText("TOP prece"));
    private SelenideElement openProductPage = $(Selectors.byXpath("//div[@class='gtm-categories new-product-hover']"));
    private SelenideElement findBrandSection = $(withText("mols"));
    private SelenideElement allBrandSection = findBrandSection.sibling(0);
    private SelenideElement firstAvailableBrand = allBrandSection.$$("a").filter(Condition.visible).first();

    public void setProductRate() {

        productRate.click();
    }

    public void setFindBrandSection() {

        findBrandSection.scrollIntoView("{block: \"center\"}");
    }

    public void setFirstAvailableBrand() {

        firstAvailableBrand.click();
    }

    public void setOpenProductPage() {

        openProductPage.click();
    }
}

