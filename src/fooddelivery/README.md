---

# 🍔 Food Delivery CLI System

A simple console-based Food Delivery application built using **Core Java**. This project is designed to demonstrate **Layered Architecture** and **Object-Oriented Programming (OOP)** concepts without using any external frameworks or databases.

## ✨ Features

* **Register Customer**: Add a new customer with a unique ID.
* **Place Order**: Create a new food order with automatic calculation of total amounts.
* **View Orders**: Fetch and display all orders placed by a specific customer.
* **Cancel Order (Bonus)**: Remove an order using its unique Order ID.

## 🛠️ Tech Stack & Constraints

* **Language**: Core Java (Java 8+)
* **Data Storage**: `HashSet` (In-memory collections only. No Databases, No ArrayLists)
* **Architecture**: Layered Architecture
* **Input/Output**: Java `Scanner` (Console-based)

## 🏗️ Project Architecture

The application strictly follows a 4-tier layered architecture:

1. **UI Layer (`fooddelivery.ui`)**: Handles user inputs using `Scanner` and displays menus.
2. **Controller Layer (`fooddelivery.controller`)**: Acts as a bridge between the UI and Service layers.
3. **Service Layer (`fooddelivery.service`)**: Contains all the business logic and calculations (e.g., checking if a user exists, calculating `price * quantity`).
4. **Repository Layer (`fooddelivery.repository`)**: Manages data storage and retrieval using `HashSet`.

**Execution Flow:**
`UI` ➔ `Controller` ➔ `Service` ➔ `Repository` ➔ `HashSet`

## 📁 Folder Structure

```text
src/
 └── fooddelivery/
      ├── bean/
      │    ├── Customer.java
      │    └── Order.java
      ├── controller/
      │    └── FoodDeliveryController.java
      ├── repository/
      │    └── FoodDeliveryRepository.java
      ├── service/
      │    └── FoodDeliveryService.java
      └── ui/
           └── FoodDeliveryUI.java

```

## 🚀 How to Run

1. Clone the repository to your local machine.
2. Open the project in any Java IDE (IntelliJ IDEA, Eclipse, or VS Code).
3. Navigate to `src/fooddelivery/ui/FoodDeliveryUI.java`.
4. Run the `main` method.
5. Follow the on-screen menu instructions in the console.

---

