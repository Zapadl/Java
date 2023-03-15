package Pattern.Builder.Viewer;

import Pattern.Builder.Product.Product;

public interface ProductBuilder {
    public ProductBuilder fixName();
    public ProductBuilder fixPrice();
    public ProductBuilder fixQuantity();
    public ProductBuilder fixDescription();
    public ProductBuilder fixCategory();
    public Product build();
}
