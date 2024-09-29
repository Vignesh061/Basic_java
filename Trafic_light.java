//Question:

//Write a Java program that simulates a traffic light system. The program should prompt the user to enter a color (Red, Yellow, or Green) and display the corresponding action:

//If the color is "Red," print "Stop."
//If the color is "Yellow," print "Be Ready."
//If the color is "Green," print "Go."
//If the input is any other color, print "Invalid colour."




import java.util.Scanner;
class Trafic_light{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a colour:");
        String colour=sc.nextLine();
        if(colour.equals("Red"))
        {
            System.out.println("Stop");
        }
        else if(colour.equals("Yellow"))

        {
            System.out.println("Be Ready");

        }
        else if(colour.equals("Green"))
        {
            System.out.println("Go");
        }
        else
        {
            System.out.println("Invalid colour");        }


    }
}