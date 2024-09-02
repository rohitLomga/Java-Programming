package Assignment1;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("--- Largest of three numbers ---");

        System.out.println("Enter the first number : ");
        num1 = scanner.nextInt();

        System.out.println("Enter the third number : ");
        num2 = scanner.nextInt();

        System.out.println("Enter the third number : ");
        num3 = scanner.nextInt();


        // Using nested ternary operator to find the greatest number
        int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("The greatest number is: " + greatest);
        scanner.close();
    }
}
