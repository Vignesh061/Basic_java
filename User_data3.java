//Q4).Write a Java program that prompts the user to enter their name, score, and department. 
//The program should then display the entered information .
import java.util.Scanner;
class User_data3{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Entern your score:");
        Float score=sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter your department:");
        String dep=sc.nextLine();
        System.out.println("Your  name is:"+name);
        System.out.println("Your  score is:"+ (score/10+"10"));
        System.out.println("Your department is:"+dep);

    }

}