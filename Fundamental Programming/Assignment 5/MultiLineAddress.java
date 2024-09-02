package Assignment5;

import java.util.Scanner;

public class MultiLineAddress {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the details of your address \n");
        System.out.println("Enter the street : ");
        String street = scanner.nextLine();

        System.out.println("Enter city : ");
        String city = scanner.nextLine();

        System.out.println("Enter zip code : ");
        int zipCode = scanner.nextInt();


        scanner.close();
        System.out.println("\nDetails of your address");
        System.out.println("Street : \t" + street +  "\nCity : \t" + city + "\nZip Code : \t" + zipCode);
    }
}
