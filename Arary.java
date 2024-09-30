//Question:
//Write a Java program that prompts the user to input the size of an array and then allows the user to enter that many elements into the array. 
//The program should store these elements in the array, but no output is required at this point.

import java.util.Scanner;
class Arary{
    public static void main(String arg[])
    {
        int[] s=new int[50];//create a array for a size
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a size of an array:");
        int n =sc.nextInt();//get a number of array
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a element of " +(i+1)+ ":" );
            s[i]=sc.nextInt();
        }
        

    }
}