package oop.labor02.rectangle;

import java.util.Random;

public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers.");
        }
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Calculate area
    public double area() {
        return length * width;
    }


    public double perimeter() {
        return 2 * (length + width);
    }


    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }


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
