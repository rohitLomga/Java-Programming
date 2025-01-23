import java.util.Scanner;
// 1 . Comparision of two numbers

public class CheckTwoNumbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2 : ");
        int num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.println("Number1 and Number2 are equal");
        }else{
            System.out.println("Number1 and Number2 are not equal");
        }

    }
}
