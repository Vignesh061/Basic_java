                        // his code demonstrates multilevel inheritance in Java.

// Explanation:
// In multilevel inheritance, a class inherits from another class,
//  and then a third class inherits from that second class. This forms a chain of inheritance.
// In your code:

// The class Puppy extends Dog.
// The class Dog extends Animal.
// Thus, the inheritance hierarchy looks like this:

// Animal → Dog → Puppy



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
class Puppy extends Dog{
    void weep()
            {
                System.out.println("dog is weeping");
            }
    }
public class Multilevel_inheritance
            {
                public static void main(String[] args)
                {
                    Puppy p1 = new Puppy();
                    p1.weep();
                    p1.bark();
                    p1.eat();
                
            }


}