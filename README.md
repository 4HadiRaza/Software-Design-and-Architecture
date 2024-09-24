# Software-Design-and-Architecture
Creator Principle
Definition: The Creator Principle states that a class should be responsible for creating instances of classes that it closely uses or aggregates. In simpler terms, if a class A contains or is closely associated with class B, then class A is a good candidate to create instances of class B.

When to Use the Creator Principle:
Containment: When one class contains another (e.g., a ShoppingCart contains LineItems).
Association: When one class uses another (e.g., a Library uses Books).
Initialization: When a class is responsible for initializing another class in a way that it makes sense to do so.

Example Scenario

Let’s consider a simple e-commerce system where we have a ShoppingCart class and a LineItem class. A ShoppingCart will typically contain multiple LineItem objects.
Class Definitions
LineItem: Represents an item in the shopping cart.
ShoppingCart: Contains multiple LineItem objects and is responsible for creating them.



Explanation of the provided Code:
LineItem Class:
•	Contains fields for productName, quantity, and price.
•	Has a constructor to initialize these fields and a method totalPrice() to calculate the total price for that item.
ShoppingCart Class:
•	Contains a list of LineItem objects.
•	The addLineItem method creates a new LineItem using the Creator Principle and adds it to the list.
•	The totalCartValue method iterates through all the LineItem instances to calculate the total cost of the cart.
Main Class:
•	Demonstrates how to create a ShoppingCart, add items to it, and print the total value of the cart.
Benefits:
This implementation clearly demonstrates the Creator Principle in Java, maintaining encapsulation and clarity regarding the responsibilities of each class. The ShoppingCart class is responsible for creating and managing LineItem instances, leading to a more organized and maintainable codebase.
