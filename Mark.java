//Question:

//Write a Java program that takes five subject marks from the user as input. The program should calculate the total and average marks, then print each subject's marks, total marks, and the average mark.
// Based on the average, the program should give feedback:

//If the average is less than 35, 
//print "Additional class is required for you."
//Otherwise, print "You are good to go."


import java.util.Scanner;
class Mark{
    public static void main(String arg[])
{
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter your Mark 1:");
    int mark1=sc.nextInt();
    System.out.print("Enter your Mark 2:");
    int mark2=sc.nextInt();
    System.out.print("Enter your Mark 3:");
    int mark3=sc.nextInt();
    System.out.print("Enter your Mark 4:");
    int mark4=sc.nextInt();
    System.out.print("Enter your Mark 5:");
    int mark5=sc.nextInt();
    int total=(mark1+mark2+mark3+mark4+mark5);
    int avg=(total/5);
    
    System.out.println(" your Mark 1:"+mark1);
    System.out.println(" your Mark 2:"+mark2);
    System.out.println(" your Mark 3:"+mark3);
    System.out.println(" your Mark 4:"+mark4);
    System.out.println(" your Mark 5:"+mark5);
    System.out.println("Your total mark:"+total);
    System.out.println("Averagr mark:"+avg);
    if(avg<35)
    {
        System.out.println("Additional class is required for you");

    }
    else
    {
        System.out.println("You are good to go");
    }


}
}