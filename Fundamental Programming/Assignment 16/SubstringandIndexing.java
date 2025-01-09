package Assignment_16;

import java.util.Scanner;

public class SubstringandIndexing {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string : ");
        String word = scanner.nextLine();

        System.out.println("Enter the index number : ");
        int indexNo = scanner.nextInt();

        String newWord = word.substring(indexNo);
        System.out.println("New String is : " + newWord);
    }
}
