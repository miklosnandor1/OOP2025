package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readCustomersFromCSVFile("lab4_2_input.csv");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static ArrayList<Customer> readCustomersFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            Customer currentCustomer = null;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String type = items[0].trim();
                if (type.equals("Customer")) {
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    currentCustomer = new Customer(firstName, lastName);
                    customers.add(currentCustomer);
                } else if (type.equals("Account")) {
                    String accountNumber = items[1].trim();
                    double balance = Double.parseDouble(items[2].trim());
                    BankAccount account = new BankAccount(accountNumber);
                    account.deposit(balance);
                    if (currentCustomer != null) {
                        currentCustomer.addAccount(account);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}