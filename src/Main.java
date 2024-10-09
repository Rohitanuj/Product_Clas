import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

class Product {                                           // Product Class
    public int Product_id;
    public String name;
    public double price;
    public String Category;

    public Product(int Product_id, String name, double price, String category) {     // Constructor
        this.name = name;
        this.price = price;
        Category = category;
        this.Product_id = Product_id;
    }

    public String getName() {                            // name Getter function
        return name;
    }

    public String getCategory() {                        //Category Getter Function
        return Category;
    }

    public int getProduct_id() {                         // Product_id Getter Function
        return Product_id;
    }

    public double getPrice() {                           // Price Getter Function
        return price;
    }


}

public class Main {
    public static void main(String[] args) {             // main Class

        List<Product> ProductList = new ArrayList<>();    // initializing List

        ProductList.add(new Product(101, "TV", 150.0, "ELECTRONICS"));               // Creating Object and adding in List
        ProductList.add(new Product(102, "Sofa", 200.0, "FURNITURE"));               // Creating Object and adding in List
        ProductList.add(new Product(103, "Shirt", 50.0, "CLOTHING"));                // Creating Object and adding in List
        ProductList.add(new Product(104, "Laptop", 250.0, "ELECTRONICS"));           // Creating Object and adding in List
        ProductList.add(new Product(105, "Refrigerator", 300.0, "HOME_APPLIANCES")); // Creating Object and adding in List
        ProductList.add(new Product(106, "Table", 120.0, "FURNITURE"));              // Creating Object and adding in List

        for (Product product : ProductList) {                                                                     // Creating for-eachLoop to traverse the List
            if (product.getPrice() > 100 && !Objects.equals(product.getCategory(), "ELECTRONICS")) {           // Applying Filter according to our requirements
                System.out.println("Product_ID: " + product.getProduct_id() + " Name: " + product.getName() + ", Price: " + product.getPrice() + ", Category: " + product.getCategory()); //Printing output

            }
        }
    }
}