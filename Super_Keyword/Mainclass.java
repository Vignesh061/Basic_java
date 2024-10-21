// package Super_Keyword;

class Person{
    String name;
    Person(String name)
    {
        this.name=name;

    }
}

class Employee extends Person{
    Employee(String name){
        super(name);
    }
}

public class Mainclass {
    public static void main(String[] args){
        Employee E1= new Employee("Your name");
        System.out.println("Employee Name: " + E1.name);
    }

}
