package Assignment7;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = scanner.nextInt(); // Taking size of an array

        int[] array = new int[size]; // Initializing the array

        System.out.println("Enter the elements of array : ");
        for(int i = 0; i < array.length; i++){ // Taking elements of an array
            array[i] = scanner.nextInt();
        }

        // Reversing the array
        for(int i = array.length - 1; i > 0; i--){
            System.out.println("Reverse of an array : " + array[i]);
        }
        scanner.close();
    }
}
