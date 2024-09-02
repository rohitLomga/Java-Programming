package Assignment5;

import java.util.Scanner;

public class IsNumberIsGreaterThan100 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTo check the number whether it is greater or less than 100 with boolean ");
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();

        boolean result = num > 100;

        System.out.println(result);
        scanner.close();
    }
}
