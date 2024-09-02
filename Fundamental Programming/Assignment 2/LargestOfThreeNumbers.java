import java.util.scanner

public class LargestOfThreeNumbers {
  public staitc void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // Largest of three numbers using ternary operators
    System.out.println("--- Largest of three numbers ---");

    System.out.println("Enter the first number : ");
    int num1 = scanner.nextInt();

    System.out.println("Enter the second number : ");
    int num2 = scanner.nextInt();

    System.out.println("Enter the third number : ");
    int num3 = scanner.nextInt();

    int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num2);

    System.out.println(largest + " is the largest number.");
    scanner.close();
    
  }
}
