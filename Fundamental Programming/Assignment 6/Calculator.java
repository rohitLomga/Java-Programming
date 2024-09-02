package Assignment6;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---  Simple calculator  ---");

        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter any operator from these ( +, -, *, /) : ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        switch (operator){
            case '+' :
                result = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is : " + result);
                break;

            case '-' :
                result = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 + " is : " + result);
                break;

            case  '*' :
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is : " + result);
                break;

            case '/' :
                result = num1 / num2;
                System.out.println("The quotient of " + num1 + " and " + num2 + " is : " + result);
                break;

            default:
                System.out.println("Please enter the correct operator");

        }


    }
}
