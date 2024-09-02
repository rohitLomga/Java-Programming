package Assignment1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sum of digits ---");

        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        int rem = 0;
        int sum = 0;

        while (number != 0){
            rem = number % 10;
            sum += rem;
            number /= 10;
        }

        System.out.println("The sum of given integer is : " + sum);
        scanner.close();
    }
}
