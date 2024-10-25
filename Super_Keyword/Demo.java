// Parent class
class Animal {
    // Constructor of the parent class
    Animal() {
        System.out.println("Animal created");
    }

    // Method in the parent class
    void sound() {
        System.out.println("Animal sound");
    }
}

// Child class
class Dog extends Animal {
    // Constructor of the child class
    Dog() {
        // Call to the parent class constructor
        super();
        System.out.println("Dog created");
    }

    // Method in the child class
    void sound() {
        // Call to the parent class method
        super.sound();
        System.out.println("Dog barks");
    }
}

// Main class
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog(); // This will call the Dog constructor
        dog.sound(); // This will call the sound method in Dog
    }
}