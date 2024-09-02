package Assignment8;

import java.util.Scanner;

public class MatricesAdditionOf2by2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Addition of 2 * 2 matrices ---");

        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns of matrices : ");
        int columns = scanner.nextInt();

        int[][] firstMatrix = new int[rows][columns]; // First matrix

        int[][] secondMatrix = new int[rows][columns]; // Second matrix

        int[][] resultMatrix = new int[rows][columns]; // Added matrix

        // User input of first matrix
        System.out.println("--- First Matrix ---");
        for(int i = 0; i < rows; i++){
            System.out.println("Enter the elements of row " + (i + 1));
            for(int j = 0; j < columns; j++){
                System.out.print(" and column " + (j + 1 )+ " : ");

                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        // User input of second matrix
        System.out.println("--- Second Matrix ---");
        for(int i = 0; i < rows; i++){
            System.out.println("Enter the elements of row " + (i + 1) );
            for(int j = 0; j < columns; j++){
                System.out.print(" and column " + (j + 1) + " : ");

                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        // Adding of the matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Printing the entered matrix
        System.out.println("\n First Matrices : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if (j == (rows -1)){
                    System.out.println("\t" + firstMatrix[i][j]);

//                    System.out.println(resultMatrix[i][j]);
                }else {
                    System.out.print("\t" + firstMatrix[i][j]);

                }
            }
        }
        // Printing the entered matrix
        System.out.println("\n Second Matrices : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if (j == (rows -1)){
                    System.out.println("\t" + secondMatrix[i][j]);

//                    System.out.println(resultMatrix[i][j]);
                }else {
                    System.out.print("\t" + secondMatrix[i][j]);

                }
            }
        }

        // Printing the sum of the matrix
        System.out.println("\nSum of two Matrices : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if (j == (rows -1)){
                    System.out.println("\t" + resultMatrix[i][j]);

//                    System.out.println(resultMatrix[i][j]);
                }else {
                    System.out.print("\t" + resultMatrix[i][j]);

                }
            }
        }



    }
}