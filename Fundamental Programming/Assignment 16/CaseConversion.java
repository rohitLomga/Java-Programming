package Assignment_16;

import java.util.Scanner;

public class CaseConversion {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = scanner.nextLine();

        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));

            }else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}
