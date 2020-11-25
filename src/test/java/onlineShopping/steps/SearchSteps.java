package onlineShopping.steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import onlineShopping.models.ProductModel;
import onlineShopping.pages.HomePage;
import onlineShopping.pages.ProductFilterPage;
import static com.codeborne.selenide.Selenide.open;

public class SearchSteps {
    HomePage home = new HomePage();
    ProductModel productModel = new ProductModel();
    ProductFilterPage filter = new ProductFilterPage();

    @Before
    public void setUp() {
        Configuration.startMaximized = true;
    }

    @Given("Open 1a homepage")
    public void open1AHomepage() {
        open("https://www.1a.lv/");
    }

    @When("Search for product")
    public void searchForProduct() {
        home.setCookieAccept();
        home.searchProduct(productModel.getProductType());
        home.setSubmitButton();
    }

    @And("Choose it from left menu")
    public void chooseItFromLeftMenu() {
        home.setProductSection();
        home.setMonitorSection();
    }

    @And("Choose highly rated filter and first available brand")
    public void chooseHighlyRatedFilterAndFirstAvailableBrand() {
        filter.setProductRate();
        filter.setFindBrandSection();
        filter.setFirstAvailableBrand();
    }

}
