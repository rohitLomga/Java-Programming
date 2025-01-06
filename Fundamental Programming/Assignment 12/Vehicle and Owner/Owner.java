package Assignment_12._Vehicle_and_Owner;

import java.util.ArrayList;
import java.util.Scanner;

public class Owner {
    String name;
    String address;

    Scanner scanner = new Scanner(System.in);

    ArrayList<Vehicle> vehicles;

    public Owner(){
        vehicles = new ArrayList<>();
    }

    // Method for taking the owner's details through user
    public void addOwner(){
        System.out.print("Enter the name of the owner : ");
        name = scanner.nextLine();

        System.out.print("Enter the address : ");
        address = scanner.nextLine();
    }

    // Method to add vehicles
    public void addVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
        System.out.println("New vehicle added");
    }

    // Method to show the owner's details and the list of vehicles owned by him/her
    public void listOfVehicle(){
        System.out.println("\n--- Owner's Details ---");
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);

        // Checking whether vehicles are there or not
        if (vehicles.isEmpty()){
            System.out.println("No vehicles found");
            return;
        }
        // displaying the vehicles using for-each loop
        for(Vehicle v : vehicles){
            System.out.println("Make : " + v.getMake() + ", Model : " + v.getModel() + " , Year : " + v.getYear());
        }
    }

    // Method to remove vehicle
    public void removeVehicle(String model){
        for (Vehicle v : vehicles){
            if (v.getModel().equals(model)){
                vehicles.remove(v);
                System.out.println("Vehicle removed");
                return;
            }
        }

        System.out.println("No vehicles found of model : " + model);
    }
}
