package Pattern.Builder.Product;

public class Product {
    private String name; //название товара
    private String price; //цена товара
    private String quantity;// количество товара
    private String description; //описание товара
    private String category; //категория товара

    public Product(){
        super();
    }

    public Product(String name, String price, String quantity, String description, String category) {
        this();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.category = category;
    }

    public Product(String name, String description, String category) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //проверка заполнения полей товара
    public boolean fillingCheck(){
        return(name !=null && !name.trim().isEmpty()) &&
            (price !=null && !price.trim().isEmpty()) &&
            (quantity!=null &&!quantity.trim().isEmpty()) &&
            (description!=null &&!description.trim().isEmpty()) &&
            (category!=null &&!category.trim().isEmpty());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Product [name=").append(name)
                .append(", price=").append(price)
                .append(", quantity=").append(quantity)
                .append(", description=").append(description)
                .append(", category=").append(category);
    return builder.toString();
    }
}
