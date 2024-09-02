package Assignment_11;

import java.util.Scanner;

public class FactorialUsingRecursion {

    public static long factorial(long number){
        if (number == 0){
            return 1;
        }else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Factorial using recursion ---");

        System.out.println("Enter the number : ");
        long number = scanner.nextLong();

        System.out.println("Factorial : " + factorial(number));

        scanner.close();
    }
}