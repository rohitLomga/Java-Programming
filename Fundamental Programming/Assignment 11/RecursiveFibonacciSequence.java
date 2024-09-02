package Assignment_11;

import java.util.Scanner;

public class RecursiveFibonacciSequence {

    public static int fibonacci(int number){
        if(number == 0){
            return 0;
        } else if (number == 1) {
            return 1;
        }else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Fibonacci Sequence using recursion ---");

        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        System.out.println("Fibonacci : " + fibonacci(number));
        scanner.close();
    }
}
