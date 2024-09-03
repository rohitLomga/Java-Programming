package Assignment_4;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfCharacterInString {


        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            // Create a HashMap to store character frequencies
            HashMap<Character, Integer> charFrequency = new HashMap<>();

            // Iterate through each character in the string
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                // If the character is already in the HashMap, increment its count
                if (charFrequency.containsKey(currentChar)) {
                    charFrequency.put(currentChar, charFrequency.get(currentChar) + 1);
                } else {
                    // Otherwise, add the character to the HashMap with a count of 1
                    charFrequency.put(currentChar, 1);
                }
            }

            // Display the character frequencies
            System.out.println("Character frequencies:");
            for (HashMap.Entry<Character, Integer> entry : charFrequency.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            // Close the scanner
            scanner.close();
        }


}
