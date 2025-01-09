package Assignment_16;

import java.util.Scanner;

public class FindingaCharacterinaString {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scanner.nextLine();

        System.out.println("Enter the index number : ");
        String character = scanner.nextLine();

//       character.toCharArray();

        System.out.println(str.indexOf(character));
    }
}
