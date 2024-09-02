package Assignment3;

public class NumbersFrom0to10And10to0 {
    public static void main(String[] args){
        int i = 0;

//        LOOP TO PRINT FROM 0 TO 10
        System.out.println("This is 0 to 10");
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int j = 10;

        // LOOP TO PRINT FROM 10 TO 0
        System.out.println("This is 10 to 0");
        while(j >= 0){
            System.out.println(j);
            j--;
        }
    }
}
