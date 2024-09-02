package Assignment5;

import java.util.Scanner;

public class ConvertDoubleToInteger {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number : ");
        double doubleNum = scanner.nextDouble();

        int IntoInt = (int)doubleNum;

        System.out.println("Integer number : " + IntoInt);
        scanner.close();
    }
}
