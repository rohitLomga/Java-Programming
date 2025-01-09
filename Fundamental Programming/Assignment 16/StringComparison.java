package Assignment_16;

import java.util.Scanner;

public class StringComparison {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string : ");
        String str2 = scanner.nextLine();

        String result = str1.equals(str2) ? "Strings are identical" : "Strings are not identical";

        System.out.println(result);
    }
}
