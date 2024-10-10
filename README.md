# Shopping Spring Program

## Overview

This repository contains the code for a Shopping application implemented in Java using object-oriented principles. The application models a shopping system for grocery items, with functionality to create, manage, and manipulate a collection of these items. The program features exception handling for specific scenarios, such as empty collections or missing elements, and incorporates custom exceptions to manage errors effectively. This project demonstrates the use of encapsulation, comparisons between objects, and handling operations through custom exceptions.

## Project Out

```bash
Does list contain Pistachio Ice Cream? true
Does list contain Dill Pickles? false
Let's add 3 jars of pickles.
Let's remove the ice cream.
Does list contain Pistachio Ice Cream? false
Here is the whole shopping list:
NAME                     CATEGORY          AISLE     QUANTITY  PRICE

-------------------------------------------------------------------------
Mayo                     Dressing / Mayo   1         1         2.99

-------------------------------------------------------------------------
Green Tea                Tea               6         2         1.99

-------------------------------------------------------------------------
Lucky Charms             Cereal            7         1         3.99

-------------------------------------------------------------------------
Admiral Ackbar Cereal    Cereal            7         1         4.99

-------------------------------------------------------------------------
Tide Pods                Laundry           9         4         1.99

-------------------------------------------------------------------------
Spam                     Can Meat          1         6         2.99

-------------------------------------------------------------------------
Honey Wheat              Pancake Mix       7         1         1.99

-------------------------------------------------------------------------
Clorox                   Bleach            9         1         6.99

-------------------------------------------------------------------------
Velveeta                 Cheese            13        2         3.99

-------------------------------------------------------------------------
I Can't Believe It's Not Butter            13        2         2.99

-------------------------------------------------------------------------
Uncle Bens               Rice              2         1         1.99

-------------------------------------------------------------------------
Dill Pickles             Condiments        4         3         2.99

-------------------------------------------------------------------------
```

## Features

1. **Grocery Class**: Represents individual grocery items with properties such as name, category, aisle, price, and quantity.
2. **Custom Exceptions**: Handles specific error cases with `EmptyCollectionException` and `ElementNotFoundException`.
3. **Comparable Implementation**: Enables sorting and comparison of grocery items based on name and category.
4. **Encapsulation**: Uses private fields with public getter and setter methods to maintain control over the grocery item properties.
5. **Copy Constructor**: Facilitates cloning of existing grocery items for easier management and manipulation.

## Class Descriptions

### Grocery Class

The `Grocery` class models a grocery item with the following attributes:

- **name**: The name of the grocery item (e.g., "Milk").
- **category**: The category of the grocery item (e.g., "Dairy").
- **aisle**: The aisle where the item is located in the store.
- **price**: The price of the grocery item.
- **quantity**: The quantity to purchase.

The class provides multiple constructors, including a copy constructor for duplicating grocery items. It implements the `Comparable<Grocery>` interface to enable comparison based on the item's name and category. This feature is useful for sorting and searching through a collection of grocery items.

#### Key Methods

- **getName(), setName()**: Accessor and mutator for the name field.
- **getCategory(), setCategory()**: Accessor and mutator for the category field.
- **getAisle(), setAisle()**: Accessor and mutator for the aisle field.
- **getPrice(), setPrice()**: Accessor and mutator for the price field.
- **getQuantity(), setQuantity()**: Accessor and mutator for the quantity field.
- **toString()**: Returns a string representation of the grocery item.
- **compareTo(Grocery t)**: Compares two grocery items based on their names and categories.

### EmptyCollectionException Class

This custom exception class handles cases where an operation is attempted on an empty collection of grocery items. It extends the `Exception` class and accepts a message parameter to provide specific details about the error.

### ElementNotFoundException Class

This custom exception class is used when a requested grocery item is not found in the collection. It extends the `Exception` class and accepts a message parameter to provide specific details about the missing element.

## Installation and Setup

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/your-repo/shopping-application.git
   ```

2. **Navigate** to the Project Directory:

   ```bash
   cd shopping-application

   ```

3. **Compile the Project**: Compile the Java files using your preferred IDE or run the following command:

   ```bash
   javac Shopping/*.java

   ```

4. **Run the Application**: Run the main class (if provided) to start the application.

## How to Use

**Creating a Grocery Item**

You can create a new grocery item by calling one of the constructors of the `Grocery` class:

    ```java
    Grocery milk = new Grocery("Milk", "Dairy", 3, 2.99f, 1);
    Grocery bread = new Grocery("Bread", "Bakery");
    ```

## Using Custom Exceptions

Handle custom exceptions like `EmptyCollectionException` or `ElementNotFoundException` when performing operations on collections:

```java
try {
// Example code that could cause exceptions
} catch (EmptyCollectionException e) {
System.out.println("Collection is empty: " + e.getMessage());
} catch (ElementNotFoundException e) {
System.out.println("Element not found: " + e.getMessage());
}
```

## Unit Testing

The project includes comprehensive test cases to validate each feature of the shopping list implementation. Each test case is built using JUnit to ensure correctness and robustness of the code.

## Test Classes

The project includes test classes designed to validate the functionality of the shopping list application. The following test classes are implemented:

### ShoppingListArrayTest

This class contains unit tests for the `ShoppingListArray` class, ensuring that its methods function correctly. The tests cover various operations, including:

- **Adding Items:** Tests the `add` method, ensuring it increases the size of the shopping list, adds new items, and properly combines quantities of existing items.
- **Removing Items:** Tests the `remove` method to confirm it successfully removes items and adjusts the list size, as well as handling cases where items are not found.
- **Finding Items:** Tests the `find` method, validating that it can locate items by their index and appropriately handles cases of an empty list.
- **Indexing Items:** Tests the `indexOf` method to check if it accurately returns the index of an item or throws an exception if the item is not found.
- **Checking Existence:** Tests the `contains` method to confirm if an item is present in the shopping list.
- **List Size:** Tests the `size` method to ensure it reflects the correct number of items in the list.
- **Checking Emptiness:** Tests the `isEmpty` method to verify if the shopping list is empty.

### ShoppingListArrayListTest

This class contains unit tests for the `ShoppingListArrayList` class, validating its behavior and ensuring reliability. The tests include:

- **Adding Items:** Tests the `add` method to ensure it correctly adds new items, updates existing items with the same name, and handles null entries gracefully.
- **Removing Items:** Tests the `remove` method, checking its functionality for both existing and non-existing entries, including handling cases where the list becomes empty.
- **Finding Items:** Tests the `find` method to confirm that it accurately locates items and handles cases when the list is empty or when items are not found.

These test classes leverage the JUnit framework to automate testing and ensure robust functionality within the shopping list application.

## Future Enhancements

1. **Add a Shopping Cart Feature**: Implement a shopping cart to manage items before checkout.
2. **Expand Grocery Categories**: Include more categories and subcategories for a richer shopping experience.
3. **Persistence**: Store and retrieve grocery items from a database or file system.
4. **User Interface**: Develop a GUI for a more interactive user experience.

## License

This project is open-source and available under the [MIT License](LICENSE).
