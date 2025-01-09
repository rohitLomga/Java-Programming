package Assignment_16;

import java.util.Scanner;

public class CountingSpecificCharacters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String string = scanner.nextLine();

        System.out.println("Enter to check the character : ");
        String character = scanner.nextLine();

        int count = 0;

        for(int i = 0; i < string.length(); i++){
            String c = Character.toString(string.charAt(i));
            if(character.equals(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
