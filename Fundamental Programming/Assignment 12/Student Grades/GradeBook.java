package Assignment_12._Student_Grades;

import java.util.ArrayList;
import java.util.Collections;

public class GradeBook {
    ArrayList <Student> students;

    int average;

    public GradeBook(){
        students = new ArrayList<>();
    }

    // Method to add students
    public void addStudents(Student newStudent){
        students.add(newStudent);
    }

    // Method to calculate the average of the grades
    public void averageOfGrades(){
        double total = 0;
//        double grades = 0;
        int size = students.size();

//        for(Student s : students){
//            grades = s.getGrades();
//            total += grades;
//        }
        for (int i = 0; i < size; i++) {
            Student s = students.get(i);
            double grades = s.getGrades();
            total += grades;
        }

//        double average = 0;
//        average = total / size; //students.size();

        double average = (size > 0) ? total / size : 0; // Check for division by zero

        System.out.println("Size : " + size);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
    }

    // Method to find the highest grade of the students
    public void highestGrade(){

        double maxGrade = students.get(0).getGrades();

//        for(int i = 0; i < students.size(); i++){
//            if (maxGrade < students.get(i).getGrades()){
//                maxGrade = students.get(i).getGrades();
//            }
//        }
//        for (Student s : students) {
//            if (s.getGrades() > highestGrade) {
//                highestGrade = s.getGrades();
//            }
//        }
        System.out.println("Highest grade : " + maxGrade);
    }

    // Method to update the grades
//    public void updateGrade()
}
