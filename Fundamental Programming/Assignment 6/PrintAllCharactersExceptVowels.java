package Assignment6;

import java.util.Scanner;

public class PrintAllCharactersExceptVowels {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Print All Characters Except Vowels ---");

        System.out.println("Enter any string (word) : ");
        String string = scanner.nextLine();

        int i;
        for(i = 0; i < string.length(); i++){
            char ch = string.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }

            System.out.println(string.charAt(i));
        }
    }
}
