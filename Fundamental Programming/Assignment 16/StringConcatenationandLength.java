package Assignment_16;

import java.util.Scanner;

public class StringConcatenationandLength {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name : ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name : ");
        String lastName = scanner.nextLine();

        String fullName = firstName.concat(lastName);

        System.out.println("Full name : " + fullName);
        System.out.println("Length of full name is : " + fullName.length());
    }
}
