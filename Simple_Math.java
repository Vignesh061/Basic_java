//Q3).Write a Java program that prompts the user to enter three integers. 
//The program should then calculate and display the following:
//The product of the three integers.
//The sum of the three integers.
//The result of dividing the product by the sum.
import java.util.Scanner;
class Simple_math
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int a=sc.nextInt();
         System.out.print("Enter a number :");
        int b=sc.nextInt();
         System.out.print("Enter a number :");
        int c=sc.nextInt();
        int d=(a*b*c);
        System.out.println("Multiple value:"+d);
        int e=(a+b+c);
        System.out.println("Added value:"+e);
        int div=(d/e);
        System.out.println("Divided value:"+div);

    }
}