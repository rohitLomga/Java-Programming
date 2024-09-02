package Assignment8;

import java.util.Scanner;

public class TransponseOfAMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Transpose of a matrix ---");

        System.out.println("Enter the number of rows : ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns of matrices : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns]; // First matrix

        int[][] transposedMatrix = new int[rows][columns]; // Second matrix


        // User input of first matrix
        System.out.println("--- First Matrix ---");
        for(int i = 0; i < rows; i++){
            System.out.println("Enter the elements of row " + (i + 1));
            for(int j = 0; j < columns; j++){
                System.out.print(" and column " + (j + 1 )+ " : ");

                matrix[i][j] = scanner.nextInt();
            }
        }

        // Swapping the matrix
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        // Printing the entered matrix
        System.out.println("\nEntered  Matrices : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if (j == (rows -1)){
                    System.out.println("\t" + matrix[i][j]);

//                    System.out.println(resultMatrix[i][j]);
                }else {
                    System.out.print("\t" + matrix[i][j]);

                }
            }
        }

        // Printing the transposed the matrix
        System.out.println("\nTransposed Matrices : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if (j == (rows -1)){
                    System.out.println("\t" + transposedMatrix[i][j]);

//                    System.out.println(resultMatrix[i][j]);
                }else {
                    System.out.print("\t" + transposedMatrix[i][j]);

                }
            }
        }

    }
}
