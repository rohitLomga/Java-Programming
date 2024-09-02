package Assignment5;

import java.util.Scanner;

public class ConcatenateNumbersAsStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String num1, num2;

        System.out.println("\nConcatenation of two strings as numbers\n");

        System.out.println("Enter any number : ");
        num1 = scanner.nextLine();

        System.out.println("Enter any number : ");
        num2 = scanner.nextLine();

        String sum = num1 + num2;

        scanner.close();

        System.out.println("Concatenated number : " + sum);
    }
}
