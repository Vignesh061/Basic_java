//Question:

//Write a Java program that prompts the user to enter their mark. 
//The program should then determine if the user has passed or failed based on the entered mark. A mark of 35 or above is considered a pass. 
//The program should display “PASS” if the mark is 35 or above, and “FAIL” otherwise.

import java.util.Scanner;
class Result{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter your mark:");
        int mark=sc.nextInt();
        if (mark>=35) {
            System.out.print("PASS");

        }
        else
        {
            System.out.print("FAIL");
        }

    }
}