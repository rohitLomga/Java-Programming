package Assignment10;

import org.ietf.jgss.GSSContext;

import java.util.Scanner;

public class CalculatingAreas {

    // Area of the circle
    public static double calculateArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }

    // Area of the rectangle
    public static double calculateArea(double length, double width){
       double area = length * width;
        return area;
    }

    // Area of the triangle
    public static double calculateArea( double base, float height){
        double triangleHeight = height;

        double area = 0.5 * base * height;

        return area;
    }

    // Main function
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculating Areas ---");

        System.out.println("\n--- Circle ---");

        // Circle
        System.out.println("Enter the radius : ");
        double radius = scanner.nextDouble();
        System.out.println("The area of the circle is : " + calculateArea(radius));

        // Rectangle
        System.out.println("\n--- Rectangle ---");
        System.out.println("Enter the length : ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width : ");
        double width = scanner.nextDouble();

        System.out.println("The area of the rectangle is : " + calculateArea(length,width));

        // Triangle
        System.out.println("\n--- Triangle ---");
        System.out.println("Enter the base : ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height : ");
        float height = scanner.nextFloat();

        System.out.println("The area of the triangle is : " + calculateArea(base, height));

        scanner.close();
    }
}
