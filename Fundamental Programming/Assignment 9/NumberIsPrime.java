package Assignment9;

import java.util.Scanner;

public class NumberIsPrime {
    public static void main(String[] args) {
        // Example usage
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Prime number check ---");

        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        // Check for numbers less than 2
        if (num <= 1) {
            return false;
        }

        // Check for factors from 2 to num / 2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
