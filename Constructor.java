class Constructor{
    int mark;
    String name;
    Constructor () {


        System.out.println("hello");
    }
    
     public static void main (String arg[]){
        Constructor obj1 = new Constructor();
        System.out.println(obj1.mark);
        System.out.println(obj1.name);
        // System.out.println(obj1.Constructor);
     }
}