package Assignment_20;

public class Employee {
    String name;
    String employeeId;
    int experience;

    // Default constructor
    Employee(){

    }

    Employee(String name, String employeeId, int experience){
        this.name = name;
        this.employeeId = employeeId;
        this.experience = experience;
    }
}

class Manager extends Employee{

    public void budget(){
        System.out.println("Budget");
    }
}

// Executive class extending manager class
class Executive extends Manager{
    public void company_performance_metrics(){
        System.out.println("Executive class");
    }

    // Main method
    public static void main(String [] args){

    }
}
