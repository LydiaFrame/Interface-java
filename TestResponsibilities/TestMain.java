/*
 * Program: TestMain.java
 * Student: Lydia Frame 
 * Purpose: demonstrates the use of interfaces to define specific employee roles and their responsibilities. 
 *          The program models roles like **Baggers** and **Cashiers** as interfaces, 
 *           with a **Manager** class implementing both roles.
*/

public class TestMain {

    public static void main(String[] args) {
        // Create a Manager instance
        ManagerClass manager = new ManagerClass("Alex");

        // Call a manager-specific method
        manager.manageStore();

        // Call methods defined in the interfaces
        manager.HelpBagging();
        manager.HelpCheckout();

    }
}
