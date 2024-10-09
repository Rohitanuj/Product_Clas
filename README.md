Class Properties
The Product class has the following fields:

id: A unique identifier for the product (int).
name: The name of the product (String).
Category: A brief description of the Category(String).
price: The price of the product (double).

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
Category: A Category of the product (String).
price: The price of the product (double).
Example Java Class
java



Methods;
Constructors
Product(): Default constructor, creates a Product object with no initial values.
Product(int id, String name, String category, double price): Parameterized constructor, allows setting all product properties upon object creation.


Getters:
int getId(): Returns the product ID.
String getName(): Returns the name of the product.
String getCategory(): Returns the product description.
double getPrice(): Returns the product price.


