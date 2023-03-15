package Pattern.Builder;

import Pattern.Builder.Product.Product;
import Pattern.Builder.Viewer.ProductBuilder;

public class Director {
    private ProductBuilder product;
    public Director(ProductBuilder product){
        super();
        this.product = product;
        if(this.product ==null){
            throw new IllegalArgumentException("Карточка не может быть пустой");
        }
    }
    public Product manufactureProduct(){
        return  product.fixName().fixPrice().fixQuantity().fixDescription().fixCategory().build();
    }
}
