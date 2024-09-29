//Question:

//Write a Java program that prompts the user to enter a number. 
//The program should then check if the number is divisible by both 3 and 5. If the number is divisible by both, 
//the program should display “The number is divided by both 3 and 5”. 
//Otherwise, it should display “The number is not divided by 3 and 5”.
import java.util.Scanner;

class Div_3and_5{

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if((num%3==0)&&(num%5==0)) {
            System.out.println("The numder is divided by both 3 and 5");

        } else {
            System.out.println("The number is not divided by 3 and 5");
        }
    }

}
