package Assignment6;

public class SkipMultiplesOf5 {
    public static void main(String [] args){
        System.out.println("--- Print numbers from 1 to 50 but do not print the multiples of 5 USING continue  ---");

        for(int i = 1; i <= 50; i++){
            if (i % 5 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
