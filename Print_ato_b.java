//Question:
//Write a Java program that takes two integers, a and b, as input and prints all the numbers from a to b (inclusive). 
//Ensure that a is less than or equal to b. If a is greater than b, the program should still print all the numbers from a to b in ascending order.

import java.util.Scanner;
class Print_ato_b{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number a:");
        int a=sc.nextInt();
        System.out.print("Enter a number b:");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            System.out.println(i);
            
        }

    }
}