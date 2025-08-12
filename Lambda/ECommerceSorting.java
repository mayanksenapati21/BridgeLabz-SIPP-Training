import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class ECommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 900, 4.5, 10),
            new Product("Phone", 700, 4.8, 15),
            new Product("Headphones", 100, 4.3, 25)
        );

        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price:\n" + products);

        // Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:\n" + products);

        // Sort by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:\n" + products);
    }
}
