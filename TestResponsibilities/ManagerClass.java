/*
 * Program: ManagerClass.java
 * Student: Lydia Frame 
*/

public class ManagerClass implements Bagger, Cashier {

    private String name; // Instance variable to store the manager's name

    // Constructor to initialize the manager's name
    public ManagerClass(String name) {
        this.name = name;
    }

    // Implements the HelpBagging method from the Bagger interface
    @Override
    public void HelpBagging() {
        System.out.println("Our manager is assisting with bagging.");
    }

    // Implements the assistWithCheckout method from the Cashier interface
    @Override
    public void HelpCheckout() {
        System.out.println("Our manager is assisting with checkout.");
    }

    // Additional method specific to the Manager role
    public void manageStore() {
        System.out.println(name + " is managing the store.");
    }

}
