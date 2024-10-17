                                  // Inheritance Hierarchy:
// Animal → Parent class
// Dog extends Animal → Child class of Animal
// Puppy extends Dog → Grandchild class of Animal
// Cat extends Animal → Sibling class of Dog
// Concept Demonstrated:
// Multilevel Inheritance: Puppy inherits from Dog, which in turn inherits from Animal.
// Method Inheritance: Classes that extend other classes can reuse the methods of the parent class (like eat() in this case).
// Unique Behavior: Each class can have its own specific methods, like bark() for Dog and weep() for Puppy.
// This code showcases how inheritance works in Java, enabling reuse of common functionality (like eat()) and adding specific behavior for different classes.








class Animal{
    void eat()
    {
        System.out.println("Animal  eating");

    }
}
class Dog extends Animal{
    void bark()
        {
            System.out.println("Dog is barking");
        }
    }
class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meow");

    }
}
class Puppy extends Dog{
    void weep()
            {
                System.out.println("dog is weeping");
            }
    }
public class Hybride_inheritance
            {
                public static void main(String[] args)
                {
                    Puppy p1 = new Puppy();
                    Cat c1=new Cat();
                    c1.meow();
                    p1.weep();
                    p1.bark();
                    p1.eat();
                
            }


}