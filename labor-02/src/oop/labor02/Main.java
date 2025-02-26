package oop.labor02;

import oop.labor02.bank.BankAccount;

public class Main {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("BT5684568468464");
        System.out.println(account1.getAccountNumber());

        System.out.println(account1.getBalance());

        account1.deposit(500);

        System.out.println(account1.getBalance());

        boolean result = account1.withdraw(500);
        if ( !result ){
            System.out.println("You do not have sufficient funds for this operation!");
        }

    }

}
