import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("Sorry! You are not eligible for casting your vote");
        }else{
            System.out.println("Congratulations! You are eligible for casting your vote");
        }
    }
}
