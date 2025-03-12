package oop.labor03.lab3_01;

import oop.labor03.lab3_01.BankAccount;
import oop.labor03.lab3_01.Customer;

public class Main {
    public static void main(String[] args) {




        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());

        account1.deposit(1000);
        System.out.println("Balance after deposit: " + account1.getBalance());

        boolean result = account1.withdraw(500);
        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        } else {
            System.out.println("Balance after withdrawal: " + account1.getBalance());
        }


        Customer customer1 = new Customer("John", "BLACK");
        System.out.println(customer1.toString());


        customer1.setAccount(account1);
        System.out.println(customer1.toString());


        customer1.getAccount().deposit(500);
        System.out.println(customer1.toString());


        Customer customer2 = new Customer("Mary", "WHITE");
        BankAccount account2 = new BankAccount("OTP00002");
        customer2.setAccount(account2);
        System.out.println(customer2.toString());


        customer2.closeAccount();
        System.out.println(customer2.toString());


        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

        customer2.setLastName(customer1.getLastName());

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());


    }

}
