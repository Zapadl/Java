package Pattern.Builder.Builder;

import Pattern.Builder.Product.Product;
import Pattern.Builder.Viewer.ProductBuilder;

public class FullProductBuilder implements ProductBuilder {
    private String name; //название товара
    private String price; //цена товара
    private String quantity;// количество товара
    private String description; //описание товара
    private String category; //категория товара

    public FullProductBuilder(){
        super();
    }

    @Override
    public ProductBuilder fixName() {
        System.out.println("Полная Модель1");
        this.name = "Название товара ";
        return this;
    }

    @Override
    public ProductBuilder fixPrice() {
        System.out.println("Полная Модель2");
        this.price = "цена товара ";
        return this;
    }

    @Override
    public ProductBuilder fixQuantity() {
        System.out.println("Полная Модель3");
        this.quantity = " количество товара ";
        return this;
    }

    @Override
    public ProductBuilder fixDescription() {
        System.out.println("Полная Модель4");
        this.description = "описание товара ";
        return this;
    }

    @Override
    public ProductBuilder fixCategory() {
        System.out.println("Полная Модель5");
        this.category = "категория товара ";
        return this;
    }

    @Override
    public Product build() {
        Product product = new Product(name,price,quantity, description, category);
        if (product.fillingCheck()) {
            return product;
        } else {
            System.out.println("Не все поля заполнены");
        }
        return null;
    }
}
