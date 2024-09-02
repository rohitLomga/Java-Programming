package Assignment6;

public class FirstDivisibleNumber {
    public static void main(String [] args){

        System.out.println("-- First divisible number by 3 and 7 between 1 and 100 --");

        int i;
        for(i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 7 == 0){

                break;
            }
        }
        System.out.println(i);
    }
}
