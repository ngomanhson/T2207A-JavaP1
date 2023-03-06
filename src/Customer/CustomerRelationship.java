package Customer;
import java.util.HashMap;
import java.util.Scanner;

public class CustomerRelationship {
    private HashMap<String, Customer> customers;
    private Scanner input;

    public CustomerRelationship() {
        customers = new HashMap<>();
        input = new Scanner(System.in);
    }
    public void addCustomer() {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter email: ");
        String email = input.nextLine();
        System.out.print("Enter phone: ");
        String phone = input.nextLine();

        Customer customer = new Customer(name, email, phone);
        customers.put(name, customer);
        System.out.println("Customer added successfully");
    }

    public void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("There are no customers in the list");
        } else {
//            System.out.println("Customers on the list: ");
            System.out.println("            CRM            ");
            System.out.println("Name                  Phone");
            for (String name : customers.keySet()) {
                Customer customer = customers.get(name);
                System.out.println(customer.getName() + "               " + customer.getPhone());
            }
        }
    }

    public void findCustomerByName() {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        if (customers.containsKey(name)) {
            Customer customer = customers.get(name);
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
        } else {
            System.out.println("Customer not found");
        }
    }
}
