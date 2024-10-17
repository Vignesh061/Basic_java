                            // Single_inheritance 

// What is Single Inheritance?
// Single inheritance means that one class (child class) inherits from one other class (parent class). In your case, for the code to demonstrate single inheritance, the son class should inherit from the dad class.
//  This way, the son class will have access to the properties (like money) of the dad class.
    
    
    
    
    
    
    class dad{ 
        int money=2000;

    }
    class son extends dad{
        
    }

    public class Single_inheritance{
        public static void main (String args[])
        {
            dad d1=new dad();
            System.out.println(d1.money);
            son s1=new son();
            System.out.println( "Dad's money:"+s1.money);
        }
    }
