package Pattern.Builder.Builder;

import Pattern.Builder.Product.Product;
import Pattern.Builder.Viewer.ProductBuilder;

public class InfoProductBuilder implements ProductBuilder {
    private String name; //название товара
    private String price; //цена товара
    private String quantity;// количество товара
    private String description; //описание товара
    private String category; //категория товара

    public InfoProductBuilder(){
        super();
    }

    @Override
    public ProductBuilder fixName() {
        System.out.println("Информационая модель1");
        this.name = "Название товара ";
        return this;
    }

    @Override
    public ProductBuilder fixPrice() {
        this.price = "Описание товара";
        return this;
    }

    @Override
    public ProductBuilder fixQuantity() {
        this.quantity = "Количество товара";
        return this;
    }

    @Override
    public ProductBuilder fixDescription() {
        System.out.println("Информационая модель2");
        this.description = "Описание товара ";
        return this;
    }

    @Override
    public ProductBuilder fixCategory() {
        System.out.println("Информационая модель3");
        this.category = "Категория товара ";
        return this;
    }

    @Override
    public Product build() {
        Product product = new Product(name, description, category);
        if (product.fillingCheck()) {
            return product;
        } else {
            System.out.println("Не все поля заполнены");
        }
        return null;
    }
}
