//Question:

//Write a Java program that prompts the user to enter their income.
 //The program should then determine if the user is eligible for a scholarship based on the entered income. 
 //If the income is 7000 or above, the program should display “Your scholarship is available”. 
 //Otherwise, it should display “Not eligible for scholarship”.
import java.util.Scanner;
class Income{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your income:");
        int income=sc.nextInt();
        System.out.println("your income is:"+income);
        if (income>=7000)
        {
            System.out.println("Your scholarship is available");
        }
        else{
            System.out.println("Not eligible for scholaship");
        }


            }

}