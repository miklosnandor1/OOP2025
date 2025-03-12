package oop.labor03.lab3_02;

import oop.labor03.lab3_01.BankAccount;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        Customer customer2 = new Customer("Mary", "WHITE");


        for (int i = 1; i <= 5; i++) {
            customer1.addAccount(new BankAccount("OTP0000" + i));
        }
        for (int i = 6; i <= 14; i++) {
            customer2.addAccount(new BankAccount("OTP0000" + i));
        }


        System.out.println(customer1.toString());
        System.out.println(customer2.toString());


        for (int i = 0; i < customer1.getNumAccounts(); i++) {
            customer1.getAccount("OTP0000" + (i + 1)).deposit(Math.random() * 1000);
        }
        for (int i = 0; i < customer2.getNumAccounts(); i++) {
            customer2.getAccount("OTP0000" + (i + 6)).deposit(Math.random() * 1000);
        }


        System.out.println(customer1.toString());
        System.out.println(customer2.toString());


        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP00014");


        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}