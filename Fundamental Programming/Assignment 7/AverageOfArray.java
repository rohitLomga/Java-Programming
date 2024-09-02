package Assignment7;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt(); // Size of the array

        int[] array = new int[size]; // Initializing the size of array

        int sum = 0;

        // Elements of the array
        for(int i = 0; i < size; i++){
            System.out.println("Enter the element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        // Calculating the average of the array using for each array
//        for(int i = 0; i < array.length; i++){
//            sum += i;
//
//        }
        for (int i : array ){
            sum += i;
        }

        float fsum = sum;
        float fsize = size;
        float average = fsum / fsize;

        System.out.println("Average of the array : " + average + "\nSum of the array : " + sum );

    }
}
