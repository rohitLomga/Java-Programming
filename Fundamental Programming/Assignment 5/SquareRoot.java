package Assignment5;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number to find it\'s square root : ");
        int num = scanner.nextInt();

        double squareRoot = Math.sqrt(num);

        System.out.println("Square root of " + num + " is : " + squareRoot);
        scanner.close();
    }
}
