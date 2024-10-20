class Teacher{
    String name;
    Teacher()
    {
        System.out.println("Hello");

    }
    void myname( String name)
    {
       this.name=name;
    }
    public static void main(String arg[])
    {
        Teacher  t1 =new Teacher();
        t1.myname("world");
        System.out.println(t1.name);
    }
}