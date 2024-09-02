package Assignment_11;

import java.util.Scanner;

public class RecursiveSumOfDigits {

    public static int sumOfDigits(int number){
        if(number == 0){
            return 0;
        }else {
            return number % 10 + sumOfDigits(number / 10);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sum of digits using recursion ---");

        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        System.out.println("Sum of the digits : " + sumOfDigits(number));

        scanner.close();
    }
}
