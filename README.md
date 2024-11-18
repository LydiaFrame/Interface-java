# Interface-java
This Java program demonstrates the use of interfaces to define specific employee roles and their responsibilities. The program models roles like **Baggers** and **Cashiers** as interfaces, with a **Manager** class implementing both roles.

## Features
- **`Bagger` Interface**: Defines behavior for assisting with bagging.
- **`Cashier` Interface**: Defines behavior for assisting with checkout.
- **`Manager` Class**: Implements both `Bagger` and `Cashier` interfaces, fulfilling the responsibilities of both roles and adding manager-specific tasks.

## Structure
- **Interfaces**:
  - `Bagger`: Represents bagger-specific responsibilities.
  - `Cashier`: Represents cashier-specific responsibilities.
- **Class**:
  - `Manager`: Implements both `Bagger` and `Cashier` interfaces and adds manager-specific methods.
- **TestMain**:
  - Main class to test the functionality of the `Manager` class and its role as a bagger and cashier.
