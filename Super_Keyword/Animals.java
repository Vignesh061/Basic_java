// package Super_Keyword;
// Default constructure

class Animal{
    int age=12;
    Animal(String name){
        System.out.println(name);
    }
    void makesound(){
        System.out.println("Animals makes sound");
    }
}

class Dog extends Animal{
    Dog() {
        super("Monkey");//call a paramater in a parent class
        super.makesound();//call a function in parent class 
        System.out.println("Animal age is "+ age);

        System.out.println("Dog");
    }

}

public class Animals {
    public static void main(String[] args){
        Dog dog = new Dog ();
        
    }
    // dog.close();

}
