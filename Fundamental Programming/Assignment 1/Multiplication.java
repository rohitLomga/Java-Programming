package Assignment1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Multiplication ---");
        System.out.println("Enter the number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the number : ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("The product of " + num1+ " and " + num2 + " is : " + product);
        scanner.close();
    }
}
