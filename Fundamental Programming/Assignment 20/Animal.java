package Assignment_20;

// Question 4
public class Animal {
    protected String legs;
    protected String foodChain;
}

// Cat class
class Cat extends Animal{
    public void purr(){
        System.out.println("Purr");

    }

    public static void main(String [] args){
        Dog dog = new Dog();
        dog.bark();

        Cat cat = new Cat();
        cat.purr();
    }
}

// Dog class
class Dog extends Animal{
    public void bark(){
        System.out.println("Bark");
    }
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.bark();
// Doubt why cat is executing
        Cat cat = new Cat();
        cat.purr();
    }

}
