package Assignment7;

import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt(); // Taking size of the array

        int[] array = new int[size]; // Initializing the array

        System.out.println("Enter the elements of array : ");
        for(int i = 0; i < size; i++){ // Taking input of array
            array[i] = scanner.nextInt();
        }

        int largest = 0;

        for(int j = 0; j < 5; j++){
            if(array[j] > largest){
                largest = array[j];
            }
        }

    System.out.println("Largest number in the array is : " + largest);

    }
}
