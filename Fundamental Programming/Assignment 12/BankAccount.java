package Assignment_12;

import java.util.Scanner;

public class BankAccount {

    Scanner scanner = new Scanner(System.in);

    // Attributes
    String accountNumber;
    String accountHolderName;
    double balance = 0;

    // Account Details Method
    public void AccountDetails(){
        // Taking the input of the account number
        System.out.print("Enter the account number : ");
        accountNumber = scanner.nextLine();

        // Taking the input of the account holder name
        System.out.print("Enter the name of the account holder name : ");
        accountHolderName = scanner.nextLine();
    }

    // Deposit Method
    public void Deposit(){
        System.out.print(" Enter the amount to deposit : ");
        double depositBalance = scanner.nextDouble();

        if (depositBalance > 0){
            // Adding the deposit balance to the main balance
            balance += depositBalance;
        }else if(depositBalance == 0){
            System.out.println(" Balance remains unchanged");
        }else {
            System.out.println("Error");
            System.out.println("Sorry ! You cannot enter the negative numbers or zero");
        }


    }

    // Withdraw method to withdraw the money
    public void Withdraw(){

        System.out.print(" Enter the amount to withdraw : ");
        double withdrawMoney = scanner.nextDouble();

        if(withdrawMoney <= 0){
            System.out.println("Error ! Please enter correct amount");

        }else if(withdrawMoney > balance){ // Checking whether the withdrawal amount is greater than available balance
            System.out.println("\nError (Insufficient Balance)");

        }else {
            // Updating the balance after the withdrawal of the money
            balance -= withdrawMoney;
        }

    }

    // Check balance method to check the balance of the account
    public void CheckBalance(){
        System.out.println("\n Account number : " + accountNumber);
        System.out.println(" Account Holder Name : " + accountHolderName);
        System.out.println(" Your balance is : " + balance);
    }

    // Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BankAccount bank1 = new BankAccount();

        System.out.println("\n--- Bank Account ---");

        // Taking the input of the bank details
        bank1.AccountDetails();

        do {
            System.out.println("\n 1 . Deposit Money");
            System.out.println(" 2 . Withdraw Money");
            System.out.println(" 3 . Check Balance");
            System.out.println(" 0 . Exit\n");

            System.out.print(" Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 0:
                    System.out.println("Thank you for banking with us");
                    System.exit(0);
                    break;

                case 1:
                    bank1.Deposit();
                    break;

                case 2:
                    bank1.Withdraw();
                    break;

                case 3:
                    bank1.CheckBalance();
                    break;

                default:
                    System.out.println("Please enter the correct number ( 0 - 3)");
            }
        }
        while (true);

    }
}
