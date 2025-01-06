package Assignment_12._Contact_Management;

import java.util.Scanner;

public class MainContact {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int option;
        ContactManager newContact = new ContactManager();

        do {
            System.out.println("\n 1 . Add contact details");
            System.out.println(" 2 . Update Name");
            System.out.println(" 3 . Update Phone number");
            System.out.println(" 4 . Update Email");
            System.out.println(" 5 . Search Details by name");
            System.out.println(" 6 . Show all Details");
            System.out.println(" 0 . Exit");

            System.out.print("\nEnter your choice : ");
            option = scanner.nextInt();

            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("\nEnter the name : ");
                    String name = scanner.nextLine();

                    System.out.println("Enter the phone number : ");
                    String phone = scanner.nextLine();

                    System.out.println("Enter the email : ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, phone, email);
                    newContact.addContacts(contact);

                    break;

                case 2:
                    System.out.println("Enter the name you want to update : ");
                    name = scanner.nextLine();

                    System.out.println("Enter the new name : ");
                    String newName = scanner.nextLine();

                    newContact.updateName(name, newName);

                    break;

                case 3:
                    System.out.println("Enter the phone number which you want to update : ");
                    phone = scanner.nextLine();

                    System.out.println("Enter the new phone number : ");
                    String newPhone = scanner.nextLine();

                    newContact.updatePhoneNumber(phone, newPhone);
                    break;

                case 4:
                    System.out.println("Enter the email which you want to update : ");
                    email = scanner.nextLine();

                    System.out.println("Enter the new email : ");
                    String newEmail = scanner.nextLine();

                    newContact.updateEmail(email, newEmail);
                    break;

                case 5:
                    System.out.println("Enter the name whose details you want to see : ");
                    name = scanner.nextLine();

                    newContact.searchByName(name);
                    break;

                case 6:
                    newContact.listDetails();
                    break;
            }

        }while (option != 0);
    }
}
