package Assignment1;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        int num1;
        int num2;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Addition of two numbers ---");

        System.out.println("Enter the first number : ");
        num1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.println("Sum of two numbers : " + sum);
    }
}
