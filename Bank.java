package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to " + name + " bank.");
    }

    public void showCustomers() {
        System.out.println("List of Customers in " + name + " bank:");
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());
        }
    }
}
