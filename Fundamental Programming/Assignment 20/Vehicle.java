package Assignment_20;

public class Vehicle {
    private int maxSpeed;
    private String color;

    // Default Constructor
    public Vehicle() {

    }

    // Paramaterized Constructor
    public Vehicle(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo(){
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Color : " + color);
    }
}

// Question 1
// Inheriting the Vehicle class
class Car extends Vehicle{
    public static void main(String [] args){
        Car car1 = new Car();
        car1.displayInfo();
    }
}

// Question 2
// Inheriting the Vehicle class
class Bike extends Vehicle{

    private boolean hasSideCar = true;

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        Bike bike1 = new Bike(); // Bike object to access the attributes of Vehicle class
        System.out.println("Max Speed : " + bike1.getMaxSpeed());
        System.out.println("Color : " + bike1.getColor());
        System.out.println("Has Side Car : " + (hasSideCar ? "Yes" : "No"));
    }

    // Main Method
    public static void main(String [] args){
        Bike bike = new Bike();
        bike.displayInfo();
    }
}

// Question 3
// Not completed
class Truck extends Vehicle{


    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}