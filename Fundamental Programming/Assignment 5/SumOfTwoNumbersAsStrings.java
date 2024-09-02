package Assignment5;

import java.util.Scanner;

public class SumOfTwoNumbersAsStrings {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String num1, num2;

        System.out.println("Enter any number : ");
        num1 = scanner.nextLine();

        System.out.println("Enter any number : ");
        num2 = scanner.nextLine();

        int num1Intoint = Integer.parseInt(num1);
        int num2Intoint = Integer.parseInt(num2);

        int sum = num1Intoint + num2Intoint;

        scanner.close();
        System.out.println("Sum of two strings : " + sum);
    }
}
