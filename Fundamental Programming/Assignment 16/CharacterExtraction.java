package Assignment_16;

import java.util.Scanner;

public class CharacterExtraction {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string : ");
        String str = scanner.nextLine();

        for(int i = 0; i < str.length(); i = i + 2){
                System.out.print(str.charAt(i));
        }
    }
}
