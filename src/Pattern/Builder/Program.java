package Pattern.Builder;

import Pattern.Builder.Builder.FullProductBuilder;
import Pattern.Builder.Builder.InfoProductBuilder;
import Pattern.Builder.Product.Product;
import Pattern.Builder.Viewer.ProductBuilder;

public class Program {
    public static void main(String[] args) {
        ProductBuilder pr1 = new FullProductBuilder();
        Director dr1 = new Director(pr1);
        Product product = dr1.manufactureProduct();
        if (product!= null) {
            System.out.println("Коффее сделано\n");
            System.out.println(product);
        }

    }
}
