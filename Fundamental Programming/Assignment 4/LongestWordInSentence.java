package Assignment4;

import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence : ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        int maxLength = 0;

        // Print each word
        for (String word : words) {

            if (word.length() > maxLength){
                longestWord = word;
                maxLength = word.length();
            }
//            System.out.println(word);
        }

        scanner.close();
        System.out.println("The longest word of the sentence is : " + longestWord);
    }
}
