//Question:
//Write a Java program to print a right-angled triangle pattern of asterisks (*). The program should use nested loops to print a pattern where each row contains a number of asterisks equal to its row number.
 //For example, in the first row, print 1 asterisk, in the second row print 2 asterisks, and so on, until the third row.

class patten{
    public static void main(String arg[])
    {
        for(int i=1;i<=3;i++)
        {
            for (int j=1;j<=i;j++)
            {
                    System.out.print("*");
            }
            System.out.println();
          
        }
        
    } 

}