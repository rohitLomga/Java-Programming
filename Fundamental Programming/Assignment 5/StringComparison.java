package Assignment5;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("String Comparison");
        System.out.println("Enter first string : ");
        String string1 = scanner.nextLine();

        System.out.println("Enter second string : ");
        String string2 = scanner.nextLine();

        boolean result = string1.equals(string2);

        System.out.println(result);
        scanner.close();
    }
}
