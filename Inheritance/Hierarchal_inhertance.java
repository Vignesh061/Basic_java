                                // hierarchical inheritance



// The code showcases hierarchical inheritance, with both Dog and Puppy as subclasses of Animal.
// Each subclass can have its own unique methods (bark() in Dog, weep() in Puppy), and they can also access methods from the Animal class (like eat()).
// This structure allows for organized code that can be reused and extended in an efficient manner.




class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Puppy extends Animal{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}
public class Hierarchal_inhertance{
    public static void main(String[] args){
        Puppy p1=new Puppy();
        p1.weep();
        // p1.bark();
         // You cannot call bark() on p1 because Puppy does not extend Dog
        // Uncommenting the next line will cause a compile-time error
        // p1.bark();  
        p1.eat();
}
}