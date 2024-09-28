//Q1).Write a Java program that prompts the user to enter their name and age.
// The program should then display the entered name and age in the following format:
import java.util.Scanner;
class User_data{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your age:";)
        int age=sc.nextInt();
         System.out.println("Your name is :"+name);
         System.out.println("Your age is :"+age);



    } 
}