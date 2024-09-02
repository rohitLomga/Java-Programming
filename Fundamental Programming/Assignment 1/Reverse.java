package Assignment1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Reverse of the number ---");

        System.out.println("Enter any number : ");
        int number = scanner.nextInt();

        int remainder = 0;
        int reverse = 0;

        while (number > 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reversed number : " + reverse);

        scanner.close();
    }
}
