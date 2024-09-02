package Assignment6;

import java.util.Scanner;

public class SpecificCharacterInString {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string (word) : ");
        String word = scanner.nextLine();

        System.out.println("Enter any character to search in the word : ");
        char character = scanner.next().charAt(0);

        int i;

        for(i = 0; i < word.length() ; i++){
            word.charAt(i);

            if(character == word.charAt(i)){
                break;
            }

        }

        // Applying decisions whether character is present or not in the string
        if(i < word.length()){
            System.out.println(character + " is found in the position " + (i + 1) + " in " + word + ".");
        }else {
            System.out.println(character + " is not found in " + word);
        }



    }
}
