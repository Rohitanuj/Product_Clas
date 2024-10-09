Class Properties
The Product class has the following fields:

id: A unique identifier for the product (int).
name: The name of the product (String).
Category: A brief description of the Category(String).
price: The price of the product (double).


Example Java Class:
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


Product Class README
Overview
This Product class is a simple representation of a product entity in a Java application. It encapsulates the properties of a product and provides methods for accessing and modifying these properties. This class can be used in e-commerce, inventory management systems, or any application that handles product data.

Features
Encapsulation: The class follows object-oriented principles, ensuring that all fields are private and accessed through public getter and setter methods.
Serializable: The class implements the Serializable interface, allowing product objects to be easily saved and restored in streams.
Constructors: Includes multiple constructors for flexibility in object creation.
toString(): A toString() method for a formatted string representation of the product.
Class Properties
The Product class has the following fields:

id: A unique identifier for the product (int).
name: The name of the product (String).
description: A brief description of the product (String).
price: The price of the product (double).
quantity: The available quantity in stock (int).
Example Java Class
java
Copy code
import java.io.Serializable;

public class Product implements Serializable {

    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;

    // Default constructor
    public Product() {}

    // Parameterized constructor
    public Product(int id, String name, String description, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString method
    @Override
    public String toString() {
        return "Product {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

Methods;
Constructors
Product(): Default constructor, creates a Product object with no initial values.
Product(int id, String name, String category, double price): Parameterized constructor, allows setting all product properties upon object creation.


Getters:
int getId(): Returns the product ID.
String getName(): Returns the name of the product.
String getCategory(): Returns the product description.
double getPrice(): Returns the product price.


