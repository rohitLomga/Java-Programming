package Assignment4;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);

        // Close the scanner
        scanner.close();
    }
}
