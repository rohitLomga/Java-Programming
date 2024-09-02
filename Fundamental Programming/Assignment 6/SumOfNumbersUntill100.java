package Assignment6;

import java.util.Scanner;

public class SumOfNumbersUntill100 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter the number : ");

        while (true){
            number = scanner.nextInt();

            if(number > 0){
                sum += number;
                if (sum == 100){
                    break;
                }
            }else {
                break;
            }

        }
        System.out.println("Sum of entered number is : " + sum);
        scanner.close();
    }

}
