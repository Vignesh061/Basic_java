class Student{
    int rollno;
    String name;
// Class Definition
// Attributes (Instance Variables):

// int mark: Holds the student's mark (an integer value).
// String name: Holds the student's name.

    Student (int a, String b)

    {
//         Constructor:

// The constructor Student(int a, String b) is used to initialize the instance variables.
// When a Student object is created, the constructor is called with two arguments: an integer for the mark and a string for the name. 
// These values are assigned to the mark and name attributes of the object.
        
         name=b;
         rollno=a;
         System.out.println("Rollno is :" + rollno);
         System.out.println("Name is :" + name);


    }
//     main Method
// This is the entry point of the program. In the main method:
// A new Student object is created using the new keyword: Student stu = new Student(50, "vicky");.
// 50 is passed as the mark, and "vicky" as the name.
// The object's mark and name attributes are printed to the console using System.out.println(stu.mark) and System.out.println(stu.name). 
// As a result, the values 50 and "vicky" are printed.
    public static void main(String arg[])
    {
        Student stu=new Student(115,"vicky");
        // System.out.println(stu.mark);
        // System.out.println(stu.name);

    }
}