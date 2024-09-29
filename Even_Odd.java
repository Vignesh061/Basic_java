//Question:

//Write a Java program that prompts the user to enter a number. 
//The program should then determine if the number is even or odd. If the number is even, the program should display “it is an even number”. 
//Otherwise, it should display “it is an odd number”.

import java.util.Scanner;
class Even_Odd{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1=sc.nextInt();

       if(num1%2==0) {
        System.out.print("it is even number");
        
        }
        else{
            System.out.print("it is odd number:");
        }
    }
}