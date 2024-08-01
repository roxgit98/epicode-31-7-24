import esercizio.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1L, "libro1", "libri", 105.99),
                new Product(2L, "libro2", "libri", 107.99),
                new Product(3L, "libro3", "libri", 209.99),
                new Product(4L, "pupazzo", "baby", 25.99)
        );

        List<Product> products1 = List.of(new Product(1L, "giocattolo1", "baby", 50.0),
                new Product(2L, "libro4", "libri", 70.0));
    }

    
}
