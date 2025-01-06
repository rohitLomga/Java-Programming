package Assignment_12._Student_Grades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        GradeBook student = new GradeBook();

        int choice;

        do {
            System.out.println("1 . Add student");
            System.out.println("2 . Show highest average");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice){
                case 1 :
                    System.out.println("Enter the name : ");
                    String name = scanner.nextLine();

                    System.out.println("Enter the grade : ");
                    double grade = scanner.nextDouble();

                    Student newStudent = new Student(name, grade);
                    break;

                case 2:
                    student.averageOfGrades();
                    break;


            }

        }while (choice != 0);
    }
}
