package Assignment_12._Vehicle_and_Owner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int choice;

        Owner own = new Owner();

        System.out.println("--- Vehicle and owner ---");

        own.addOwner(); // Details of the owner

        do {
            System.out.println("\n 1 . Add vehicle");
            System.out.println(" 2 . Remove vehicle");
            System.out.println(" 3 . Show vehicles");
            System.out.println(" 0 . Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter the company of the vehicle : ");
                    String make = scanner.nextLine();

                    System.out.print("Enter the model : ");
                    String model = scanner.nextLine();

                    System.out.print("Enter the year : ");
                    String year = scanner.nextLine();

                    // Checking whether any detail is empty
                    if(make.equals("") || model.equals("") || year.equals("")){
                        System.out.println("Please fill all details");
                        return;
                    }

                    Vehicle newVehicle = new Vehicle(make, model, year);
                    own.addVehicle(newVehicle);

                    break;

                case 2:
                    System.out.print("Enter the model of the vehicle : ");
                    model = scanner.nextLine();

                    own.removeVehicle(model);
                    break;

                case 3:
                    own.listOfVehicle();
                    break;

                default:
                    System.out.println("Enter the correct number");

            }
        }while (choice != 0);
    }
}
