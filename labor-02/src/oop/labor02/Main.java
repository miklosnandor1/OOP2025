package oop.labor02;
import java.util.Random;
import oop.labor02.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
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

