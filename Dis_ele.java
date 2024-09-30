//Question:
//Write a Java program that reads a specified number of integers from the user, stores them in an array, and then prints all the elements of the array. The program should first ask the user for the size of the array and then prompt them to enter that many integers. 
//Finally, the program will print each element of the array.



import java.util.Scanner;
class Dis_ele{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[50];
        System.out.print("Enter a size of an array:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           System.out.print("Enter an element " + (i + 1) + ":");
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }

    }
}