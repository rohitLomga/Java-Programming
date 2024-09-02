package Assignment3;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int count = scanner.nextInt();

        // Variables to store Fibonacci numbers
        int first = 0;
        int second = 1;
        int current;

        // Counter to keep track of the number of Fibonacci numbers printed
        int printedCount = 0;

        // Print the Fibonacci numbers
        System.out.println("First " + count + " Fibonacci numbers are:");

        while (printedCount < count) {
            // Print the current Fibonacci number
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            current = first + second;
            first = second;
            second = current;

            // Increment the printed count
            printedCount++;
        }
    }
}

