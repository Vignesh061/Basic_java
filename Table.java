//Question
//Write a Java program that takes an integer input from the user and prints the multiplication table for that number up to 9.
 //The program should output each step of the multiplication in the format "i x number = result", where i ranges from 1 to 9.


import java.util.Scanner;
class Table{
   public static void main (String arg[])
   {
    //int[] num=new int[50];
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a Number of table: ");
    int nn=sc.nextInt();
    for(int i=1; i<10; i++)
    {
        System.out.println(i+"x"+nn+"=" + i*nn);
    }
   }
}