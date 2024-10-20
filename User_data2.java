//Q2).Write a Java program that prompts the user to enter their name, age, and address. 
//The program should then display the entered information
import java.util.Scanner;

class User_data2
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.ou.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your address:");
        String adress=sc.nextLine();
         System.out.println("Your name is :"+name);
         System.out.println("Your age is :"+age);
         System.out.println("Your adress is:"+adress);



    } 
}
