import java.util.Scanner;

public class DisplayValueOfNBasedOnM {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        if(m  > 0){
            System.out.println("The value of n = 1");
        } else if (m == 0) {
            System.out.println("The value of n = 0");
        }else{
            System.out.println("The value of n = -1");
        }
    }
}
