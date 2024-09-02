package Assignment3;

import java.util.Scanner;

public class SumOfCubesOfEvenNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number till where you want the sum of cubes of even number : ");
        int num = scanner.nextInt();

        int cube = 0;
        int sumOfCube = 0;
        int i = 2;

        while (i <= num){

            cube = i * i * i;
            sumOfCube += cube;

            i += 2;
        }

        System.out.println("Sum of cube of even numbers : " + sumOfCube);
    }
}
