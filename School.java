//2)• Create a class called "School" with main function
//• Create a function called passorfail which should return the string "Pass/Fail"
//• Inside Main function get integer input from user for total mark.
//• Pass that input to the passorfail function and let the function decide whether student is passorfail
import java.util.Scanner;
class School{

    String passorfail(int mark)
    {
        if(mark>=35)
        {
            return "PASS";
        }
        else{
            return "FAIL" ;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your mark:");
        int total_mark = sc.nextInt();
        School obj1 = new School();
        String result=obj1.passorfail(total_mark);
        System.out.print(result);


    }
}
