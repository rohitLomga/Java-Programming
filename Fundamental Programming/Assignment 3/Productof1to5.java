package Assignment3;

public class Productof1to5 {
    public static void main(String[] args) {

        int number = 1;
        int product = 1;

        // Loop from 1 to 5
        while (number <= 5) {
            product = product * number;
            // Increment the number
            number++;
        }

        System.out.println("Product of 1 to 5: " + product);
    }
}
