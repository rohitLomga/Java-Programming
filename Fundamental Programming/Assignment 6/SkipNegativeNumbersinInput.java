package Assignment6;

import java.util.Scanner;

public class SkipNegativeNumbersinInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("--- Skip negative numbers and add positive numbers and 0 to break (total of positive numbers) ---");

        System.out.println("Enter the number : ");

        while (true){
            number = scanner.nextInt();

            if(number > 0){
                sum += number;

            }else if(number < 0){
                continue;
            }else {
                break;
            }

        }
        System.out.println("Sum of entered number is : " + sum);
        scanner.close();
    }
}
