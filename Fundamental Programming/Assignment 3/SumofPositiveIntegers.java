package Assignment3;

import java.util.Scanner;

public class SumofPositiveIntegers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter the number to add , Enter 0 to exit or total of that numbers : ");
        while(true){

            number = scanner.nextInt();

            if(number > 0){
                sum += number;
            }else {
                break;
            }
        }

        scanner.close();

        System.out.println("Sum of all numbers : " + sum);
    }



}
