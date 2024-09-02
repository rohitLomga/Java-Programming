package Assignment8;

import java.util.Scanner;

public class SumOfEachRowAndColumn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrix
        int size = 3;

        // Create a 3x3 matrix
        int[][] matrix = new int[size][size];

        // Input elements into the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        // Calculate and print the sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < size; j++) {
            int columnSum = 0;
            for (int i = 0; i < size; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("Column " + j + ": " + columnSum);
        }
    }
}
