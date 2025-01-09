package Assignment_16;

import java.util.Scanner;

public class SplittingStrings {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some strings : ");
        String strings = scanner.nextLine();

        String stringArray[] = strings.split(" ");

//        System.out.println(strings.split(""));
        System.out.print("[ ");
        for(String splitted : stringArray){
            System.out.print('\"'+ splitted + '\"' + ", ");
        }
        System.out.print("]");
    }
}
