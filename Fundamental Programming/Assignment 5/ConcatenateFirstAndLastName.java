package Assignment5;

import java.util.Scanner;

public class ConcatenateFirstAndLastName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;

        System.out.println("Enter first name : ");
        firstName = scanner.nextLine();

        System.out.println("Enter last name : ");
        lastName = scanner.nextLine();

        String fullName = firstName.concat(lastName);

        scanner.close();
        System.out.println("Full name : " + fullName);
        System.out.println("Full name : " + firstName + " " + lastName);
    }
}
