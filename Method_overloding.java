class Method_overloding{
    void sum( int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a, int b, int c)
     {
        System.out.println(a+b+c);
        
     }

    public static void main(String arg[])
    {

        Method_overloding obj1 = new Method_overloding();
        obj1.sum(10,29);
        obj1.sum(10,23,34);

    }
}