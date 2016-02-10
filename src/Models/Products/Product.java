package Models.Products;

/**
 * Product.java
 * Purpose      :   Serves as a base model for a product (License, Equipment, and Consultation extend)
 * Author       :   Jared Frenzel
 * Created On   :   February 4, 2016
 */
public abstract class Product {
    private String productCode;
    private String productName;

    public String getProductCode() { return productCode; }
    public String getProductName() { return productName; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productCode != null ? !productCode.equals(product.productCode) : product.productCode != null) return false;
        return productName != null ? productName.equals(product.productName) : product.productName == null;

    }

    @Override
    public int hashCode() {
        int result = productCode != null ? productCode.hashCode() : 0;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        return result;
    }


    public void createFromJSON(String s) {

    }

    public void createFromCSV(String s) {

    }
}
