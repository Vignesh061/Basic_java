import java.util.Scanner;
class cri{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter RCB win or loose:");
        String rcb=sc.nextLine();
        if(rcb.equals("win"))
        {
            System.out.println("Esala cup namtha");

        }
        else
        {
            System.out.println("No cup");

        }
        
        sc.close();


    }
}