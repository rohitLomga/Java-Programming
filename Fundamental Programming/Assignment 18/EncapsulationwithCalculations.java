package Assignment_18;
// Question 3
public class EncapsulationwithCalculations {
    int age;
    int currentYear;

    EncapsulationwithCalculations(int age, int currentYear){
        this.age = age;
        this.currentYear = currentYear;
    }

    // Method to calculate retiment year
    public void retirementCalculation(){
        if(age < 0 || age > 65) return;

        int remainingYear = 65 - age;
        int retirementYear = currentYear + remainingYear;
        System.out.println("Retirement year is : " + retirementYear);
    }

    // Main method
    public static void main(String [] args){
        // Object 1
        EncapsulationwithCalculations person1 = new EncapsulationwithCalculations(43, 2023);
        person1.retirementCalculation();
    }
}
