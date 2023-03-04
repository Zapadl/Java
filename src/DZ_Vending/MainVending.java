package DZ_Vending;

public interface MainVending<T> {
    void initProduct(T product);
    T getProduct(String name);
}
