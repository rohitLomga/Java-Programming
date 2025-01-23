package Assignment6;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Day of the week ---");

        System.out.println("Enter 1 to 7 to find the day of the week : ");
        int day = scanner.nextInt();
        String today;

        switch (day){
            case 1:
                today = "Monday";
                break;

            case 2:
                today = "Tuesday";
                break;

            case 3:
                today = "Wednesday";
                break;

            case 4:
                today = "Thursday";
                break;

            case 5:
                today = "Friday";
                break;

            case 6:
                today = "Saturday";
                break;

            case 7:
                today = "Sunday";
                break;

            default:
                System.out.println("A week has only seven days");
        }

        System.out.println(today);
    }
}
