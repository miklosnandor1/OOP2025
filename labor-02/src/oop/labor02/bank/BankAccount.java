package oop.labor02.bank;

public class BankAccount {

    private String accountNumber;
    private double balance;


    public BankAccount(String account) {
        accountNumber = account;
        balance = 0;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }

    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            balance -= amount;
        }

        return false;
    }
}
