package Assignment_12._Vehicle_and_Owner;

public class Vehicle {
    String make;
    String model;
    String year;

    public Vehicle(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){

        return make;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }
}