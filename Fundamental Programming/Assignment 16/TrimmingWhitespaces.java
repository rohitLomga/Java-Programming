package Assignment_16;

import java.util.Scanner;

public class TrimmingWhitespaces {
    public static void main(String [] args){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter the sentence : ");
        String sentence = scanner.nextLine();

        System.out.println(sentence.trim());
    }
}
