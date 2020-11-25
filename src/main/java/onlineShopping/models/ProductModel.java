package onlineShopping.models;

public class ProductModel {
    private String productType = "Monitori";
    private static String tempPrice;
    private static String tempProductName;

    public String getProductType() {
        return productType;
    }

    public static String getTempPrice() {
        return tempPrice;
    }

    public static void setTempPrice(String tempPrice) {
        ProductModel.tempPrice = tempPrice;
    }

    public static String getTempProductName() {
        return tempProductName;
    }

    public static void setTempProductName(String tempProductName) {
        ProductModel.tempProductName = tempProductName;
    }

}
