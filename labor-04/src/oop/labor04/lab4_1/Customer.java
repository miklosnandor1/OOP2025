package oop.labor04.lab4_1;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void closeAccount(String accountNumber) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            accounts.remove(account);
        }
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName).append(" ").append(lastName).append(" accounts:\n");
        for (BankAccount account : accounts) {
            result.append("\t").append(account.toString()).append("\n");
        }
        return result.toString();
    }
}