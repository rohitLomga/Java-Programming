package Assignment_12._Student_Grades;

public class Student {
    String name;
    double grades;

    public Student(String name, double grades){
        this.name = name;
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public String getName(){
        return name;
    }

    public double getGrades(){
        return grades;
    }
}
