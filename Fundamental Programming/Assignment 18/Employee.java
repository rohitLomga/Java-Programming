package Assignment_18;
// Question 5

public class Employee extends Person{
    private int employeeId;
    private String department;

    // Getters and setters of two attributes
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Main method
    public static void main(String [] args){
        // Object 1
        Employee employee1 = new Employee();
        employee1.setEmployeeId(1001);
        employee1.setDepartment("Engineering");

        // Modifyinig the department
        employee1.setDepartment("HR");

        System.out.println(employee1.getEmployeeId() + ", " + employee1.getDepartment());


    }
}
