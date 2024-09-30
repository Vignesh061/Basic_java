//1)• Create a class called "Find" with main function
//• Create a function called evenorodd with integer parameter called int num
//• Inside Main function get integer input from user.
//• Pass that input to the evenorodd function and let the function decide whether the number is even or odd
import java.util.Scanner;
class Find_Function{

    void evenorodd(int num)
    {
        if(num%2==0)
        {
            System.out.print(num + "is Even number ");
        }
        else{
            System.out.print(num + "is Odd number ");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check (odd or even):");
        int number=sc.nextInt();
        Find_Function obj1=new Find_Function();
        obj1.evenorodd(number);
    }
}