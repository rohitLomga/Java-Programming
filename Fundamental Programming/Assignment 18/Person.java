package Assignment_18;
// Question 1 & 2

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    // Checking whether the Name is valid or not
    public void setName(String name) {
        if(name.equals("")){
            System.out.println("Name is empty");
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // Checking whether the age is valid or not
    public void setAge(int age) {
        if(age < 0){
            System.out.println("Age is negative");
            return;
        }
        this.age = age;
    }

    // Main method
    public static void main(String [] args){

        // Object 1 of Person
        Person person1 = new Person();
        person1.setName("John"); // Setting the name
        person1.setAge(30);// Setting the age in person1

        // Printing the value of person1
        System.out.println("Name : " + person1.getName() + ", Age : " + person1.getAge());

        Person person2 = new Person(); // Object 2

        // Setting the values of person2
        person2.setName("Alice");
        person2.setAge(25);

        // Printing the value of person2
        System.out.println("Name : " + person2.getName() + ", Age : " + person2.getAge());

        // Object 3
        Person person3 = new Person();

        // Trying the invalid values
        person3.setName("");
        person3.setAge(-5);
        System.out.println("Name : " + person3.getName() + ", Age : " + person3.getAge());
    }
}