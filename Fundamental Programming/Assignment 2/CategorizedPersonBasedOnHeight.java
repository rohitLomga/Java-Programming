import java.util.Scanner;

public class CategorizedPersonBasedOnHeight {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the height of the person in cm : ");

        int heightOfPerson = scanner.nextInt(); // Read user input0

        if(heightOfPerson > 0 && heightOfPerson < 150){
            System.out.println("Dwarf");
        }else if(heightOfPerson > 150 && heightOfPerson <= 165) {
            System.out.println("Average height");
        }else if(heightOfPerson > 165){
            System.out.println("Tall");
        }else{
            System.out.println("Please! Enter valid number");
        }


    }
}
