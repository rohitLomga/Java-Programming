package Assignment9;

import java.util.Scanner;

public class AreaOfCircle {

    static double CalculateArea(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculation of the area of the circle ---");

        System.out.println("Enter the value of radius : ");
        double radius = scanner.nextDouble();

        double areaCircle = CalculateArea(radius);
        System.out.println("Area of the circle is : " + areaCircle);

        scanner.close();

    }
}
