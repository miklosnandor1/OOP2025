package oop.labor03.lab3_02;

import oop.labor03.lab3_01.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numAccounts = 0;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    // Bankszámla hozzáadása
    public void addAccount(BankAccount account) {
        if (numAccounts < MAX_ACCOUNTS) {
            accounts[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Maximum number of accounts reached!");
        }
    }


    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }


    public void closeAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                // Törlés: az utolsó elemet áthelyezzük a törölt helyére
                accounts[i] = accounts[numAccounts - 1];
                accounts[numAccounts - 1] = null;
                numAccounts--;
                return;
            }
        }
        System.out.println("Account not found!");
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName).append(" ").append(lastName).append(" accounts:\n");
        for (int i = 0; i < numAccounts; i++) {
            result.append("\t").append(accounts[i].toString()).append("\n");
        }
        return result.toString();
    }
}