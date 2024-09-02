package Assignment8;

import java.util.Scanner;

public class SumOfEachRowAndColumn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sum of each row and column of 3 * 3 matrix ---");

        int rows = 3;
        int columns = 3;
        int i, j;


        int[][] matrix = new int[rows][columns];

        // Taking input of rows and columns of a 3 * 3 matrix
        for(i = 0; i < rows; i++){
            System.out.println("Enter the elements of row " + (i + 1) + " and ");
            for(j = 0; j < columns; j++){
                System.out.print(" column " + (j + 1) + " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing the elements of entered matrix
        System.out.println("--- \nEntered matrix ---");
        for (i = 0; i < rows; i++){
            for(j = 0; j < columns; j++){
                if(j == (rows - 1)){
                    System.out.println("\t" + matrix[i][j]);
                }else {
                    System.out.print("\t" + matrix[i][j]);
                }
            }
        }

        int firstRow = 0;
        int secondRow = 0;
        int thirdRow = 0;

        int firstColumn = 0;
        int secondColumn = 0;
        int thirdColumn = 0;

        for(i = 0; i < rows; i++){
            for (j = 0; j < columns; j++){
                if(i == 0){
                    firstColumn = firstColumn + matrix[0][j];
                }else if (i == 1){
                    secondColumn = secondColumn + matrix[1][j];
                } else if (i == 2) {
                    thirdColumn = thirdColumn + matrix[2][j];
                } else if (j == 0) {
                    firstRow += matrix[i][0];
                } else if (j == 1) {
                    secondRow += matrix[i][1];
                } else if (j == 2) {
                    thirdRow += matrix[i][2];
                }
            }
        }

        System.out.println("Sum of first Column : " + firstColumn);
        System.out.println("Sum of Column 2 : " + secondColumn);
        System.out.println("Sum of Column 3 : " + thirdColumn);
        System.out.println("Sum of Row 1" + firstRow);
        System.out.println("Sum of Row 2" + secondRow);
        System.out.println("Sum of Row 3" + thirdRow);
    }
}
