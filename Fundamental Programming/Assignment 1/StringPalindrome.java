package Assignment1;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String stringInput = scanner.nextLine();

        String lowerString = stringInput.toLowerCase(); // Converting string into lowercase
        String withoutSpaceString = lowerString.replaceAll("\\s+", ""); // Removing spaces from the string

        // Reversing and converting the input string into string
        String reversed = new StringBuilder(withoutSpaceString).reverse().toString();

        // Comparing the string with removed spaces
        if(withoutSpaceString.equals(reversed)){
            System.out.println(withoutSpaceString + " and " + reversed + " are Palindrome.");
        }else {
            System.out.println(withoutSpaceString + " and " + reversed + " are not Palindrome.");
        }

        scanner.close();
    }
}
