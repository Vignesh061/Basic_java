Q//uestion:

//Write a Java program that determines a user’s eligibility for a loan. 
//The program should prompt the user to input their salary and age. The conditions for loan eligibility are:

//If the salary is greater than or equal to 20,000 or the age is less than or equal to 25, the user is eligible to apply for a loan.
//If eligible, the user is asked to enter the loan amount.
//If the loan amount is less than or equal to 50,000, the program prints "You are eligible for loan."
//If the loan amount exceeds 50,000, the program prints "Maximum loan amount is 50,000."
//If the user does not meet the initial conditions, print "You are not eligible for loan."


import java.util.Scanner;
class Loan{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your salary:");
        int salary=sc.nextInt();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        
        if(salary>=20000 || age<=25)
        {
            System.out.print("Enter a loan amount :");
            int ln=sc.nextInt();
            if(ln<=50000)
            {
                System.out.println("You are eligible for loan");
            }
            else
            {
                System.out.println("Maximum loan amount is 50000 ");
            }
        }
        else{
            System.out.println("You are not eligible for loan");
        }
        
    }
}