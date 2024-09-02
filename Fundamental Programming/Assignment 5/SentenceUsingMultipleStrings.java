package Assignment5;

import java.util.Scanner;

public class SentenceUsingMultipleStrings {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String string1, string2, string3;

        System.out.println("\nEnter three strings to make a sentence \n");

        System.out.println("Enter the first string : ");
        string1 = scanner.nextLine();

        System.out.println("Enter the second string : ");
        string2 = scanner.nextLine();

        System.out.println("Enter the third string : ");
        string3 = scanner.nextLine();

        String sentence = string1 + " " + string2 + " " + string3 + ".";

        scanner.close();

        System.out.println("Sentence : " + sentence);
    }
}
