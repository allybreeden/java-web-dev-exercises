package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//        double radius = input.nextDouble();
        double radius;
        do {
            System.out.println("Enter a positive number for the radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a number. Enter a number: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        // part one of STUDIO
        // 3.14 * radius * radius;

        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        input.close();
    }
}
