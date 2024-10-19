// Exercise - 1

// Step 1:

// Create a Class Named Animal:

// Add a field called name of type String. 
// Add a field called age of type int.
// Add a method called makeSound() 
//that prints "Animal makes a sound".


// Exercise - 1

// Step 2:

// Create a Subclass Named Dog that Inherits from Animal: ←

// • Add a field called breed of type String.

// • Override the makeSound() method
// to print "Dog barks".

// • Add a method called fetch() 
//that prints "Dog is fetching"



// Exercise - 1

// Step 3:

// • Create a Subclass Named Cat that Inherits from Animal:

// →

// • Add a field called color of type String.

// • Override the makeSound() 
//method to print "Cat meows".

// • Add a method called climb()
// that prints "Cat is climbing".



class Animal{
    
String name;
int age;
void makeSound()
{
    System.out.print("Animal makes sounds");
}
}

class Dog  extends Animal{
       String breed;
       void makeSound()
       {
        System.out.println("Dog is barking");
       }
       void fetch()
       {
        System.out.println("Dog is fetching");
       }
}

class Cat extends Animal {
    String color;
    void makeSound()
    {
        System.out.println("Cat meows");
    }
    void climb()
    {
        System.out.println("Cat is climbing");
    }
}

public class Animals{
    public static void main(String[] args){

        // Creating a object name for Dog
        Dog d1=new Dog();
        d1.name="Timmy";
        d1.age=5;
        d1.breed="Golden";
        System.out.println("Dog name is :"+ d1.name );
        System.out.println("Dog age is :"+ d1.age);
        System.out.println("Dog breed type is :"+d1.breed);
        d1.makeSound();
        d1.fetch();

        //Creating a object name for cat

        Cat c1=new Cat();
        c1.name="Poony";
        c1.age=5;
        c1.color="Brown";
        System.out.println("Cat name is :"+c1.name);
        System.out.println("Cat age is :"+c1.age);
        System.out.println("Cat color is :"+c1.color);
        c1.makeSound();
        c1.climb();
        

    }
}

 



