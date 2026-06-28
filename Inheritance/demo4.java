package Inheritance;
/*
Constructor chaining is the process of calling one constructor from another constructor within the same class or from a parent class. 
It helps reduce code duplication and improves code readability by reusing existing constructor logic. Constructor chaining is achieved using the this() and super() keywords.

Uses this() for constructors within the same class.
Uses super() to call a parent class constructor.

Yes, conceptually every constructor starts by calling a parent constructor.

In Java, the first statement of a constructor must be either:

super(...);

or

this(...);

*/

class Temp {

    Temp()
    {       
        System.out.println("Operation on various numbers:-");
    }

    Temp (int a) 
    {
        this();
        System.out.println(a);
    
    }

    Temp (int a , int b)
    {   
        this(5);
        System.out.println(a + b);  
    }
}



public class demo4 {
    public static void main(String [] args)
    {
        new Temp(4,5);
    }
}
