package Assignment_18;
// Question 4

public class ImmutablePerson {
    final String name;
    final int age;

    // constructor
    ImmutablePerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Main method
    public static void main(String [] args){
        ImmutablePerson person1 = new ImmutablePerson("Jane", 20);
//        person1.age = 30;
//        person1.name = "Anne";
    }

}
