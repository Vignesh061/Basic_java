//Question: Write a Java program that takes a user’s score as input and prints feedback based on the score.
 //The feedback should follow these rules:

//If the score is less than 50, print "you need to improve."
//If the score is between 50 and 70 (inclusive), print "Good job!"
//If the score is between 71 and 100 (inclusive), print "Excellent performance."
//If the score is greater than 100 or invalid, print "Invalid score."


import java.util.Scanner;

class Score{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your score:");
        int score=sc.nextInt();
        if (score<50  )
        {
            System.out.println("you need to improve ");

        }
        else if(score>=50 && score<=70)
        {
            System.out.println("Good job!");
        }
        else if(score>70 && score<=100)
        {
            System.out.println("Excelent performance");
        }
        else
        {
            System.out.println("Invalid score:");

        }
    }
}