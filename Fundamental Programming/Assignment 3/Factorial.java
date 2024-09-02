package Assignment3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;
        int factorial = 1;

        System.out.println("Enter the number : ");
        number = scanner.nextInt();

            int temp = number;
            while (temp > 0) {
                factorial *= temp;
                temp--;
            }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
