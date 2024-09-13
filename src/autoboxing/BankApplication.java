package autoboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double firstTransaction) {
        this(name.toUpperCase(), new ArrayList<>());
        transactions.add(firstTransaction);
    }
}

class Bank {

    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (customer.name() == null) {
            System.out.println("There is a customer without a name");
            return;
        }

        for (Customer currentCustomer : customers) {
            if (currentCustomer.name().equalsIgnoreCase(customer.name())) {
                System.out.println("Customer " + customer.name() + " already exists");
                return;
            }
        }

        customers.add(customer);
    }

    public void addCustomer(String customerName, double firstTransaction) {
        addCustomer(new Customer(customerName, firstTransaction));
    }

    public Customer getCustomer(String customerName) {

        for (Customer customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }

        return null;


    }

    public void addTransaction(String customerName, double transaction) {
        Customer customer = getCustomer(customerName);

        if (customer == null) {
            System.out.println("Customer " + customerName + " does not exist");
            return;
        }

        customer.transactions().add(transaction);
    }

    public void printTransactions() {

        for (Customer customer : customers) {
            System.out.println("Customer name = " + customer.name());
            for (double transaction : customer.transactions()) {
                System.out.printf("%.2f; ", transaction);
            }
            System.out.println();
            System.out.println("-".repeat(15));
        }
    }
}


public class BankApplication {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("John Doe", 10.0);
        Customer customer2 = new Customer("Don Joe", 550.0);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer("Nolan Vovovich", 150.0);
        bank.addCustomer(new Customer("Doen john", 123.0));

        bank.addTransaction("Don Vovovich", 150d);
        bank.addTransaction("John Doe", -110d);

        bank.printTransactions();
    }
}

