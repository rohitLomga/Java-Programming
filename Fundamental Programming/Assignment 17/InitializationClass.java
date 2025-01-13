package Assignment_17;
// Question 9
// Not understood the question clearly

public class InitializationClass {
    static {
        System.out.println("Static block executed");
//        static int value = 10;
    }
    static int value = 10;

    public static void main(String [] args){
        System.out.println(value);
    }

}
