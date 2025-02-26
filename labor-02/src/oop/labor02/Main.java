package oop.labor02;
import java.util.Random;

import oop.labor02.bank.BankAccount;
import oop.labor02.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {


//        BankAccount account1 = new BankAccount("BT5684568468464");
//        System.out.println(account1.getAccountNumber());
//
 //        System.out.println(account1.getBalance());
//
 //        account1.deposit(500);
//
   //      System.out.println(account1.getBalance());
//
   //      boolean result = account1.withdraw(500);
     //   if ( !result ){
       //     System.out.println("You do not have sufficient funds for this operation!");
 //       }

        Random rand = new Random();
        Rectangle[] rectangles = new Rectangle[10];

        for (int i = 0; i < rectangles.length; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
        }

        double totalArea = 0;
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
            totalArea += rect.area();
        }

        System.out.println("Total area of all rectangles: " + totalArea);
    }

    }


