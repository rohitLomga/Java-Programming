package Assignment_16;

import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String string = scanner.nextLine();

        System.out.println("Enter what you want to remove : ");
        String remove = scanner.nextLine();

        System.out.println("Enter new character");
        String replace = scanner.nextLine();

        System.out.println(string.replace(remove,replace));
    }
}
