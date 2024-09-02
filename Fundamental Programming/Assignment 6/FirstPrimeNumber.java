package Assignment6;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            int isPrime = 1; // Assume the number is prime (1 means prime)

            // Check if the number is divisible by any number from 2 to half of the number
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = 0; // Number is not prime (0 means not prime)
                    break; // Exit the inner loop if a divisor is found
                }
            }

            if (isPrime == 1) { // If isPrime is still 1, the number is prime
                System.out.println("The first prime number between 1 and 100 is: " + num);
                break; // Exit the outer loop after finding the first prime number
            }

        }
    }
}
