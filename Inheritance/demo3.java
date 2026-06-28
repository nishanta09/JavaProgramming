package Inheritance;
/*
The super keyword in Java is used to refer to the immediate parent class object in an inheritance hierarchy. 
It allows a subclass to explicitly access parent class members when they are hidden or overridden. 
This keyword helps maintain clarity and control while working with inheritance.

Used to call parent class constructors using super().
Helps access parent class methods and variables when overridden or hidden.
Ensures proper inheritance behavior and code reusability.


Below is the example of constructor chaining between parent class and child class
Constructor Chaining Using super() (Parent Class) 
Constructor chaining between classes occurs when a child class constructor calls the parent class constructor using the super() keyword. 
It ensures that the parent class object is initialized before the child class object.

It must be the first statement in the child class constructor.
Used in inheritance to initialize superclass members.
*/
class Father {     //extends object yu cannot see 


    Father()

    {   //super()  will be the first statemnet in constructor whether you write or not 
        //super(2) you can also call parametrized this will explicit bcoz you are adding
        System.out.println("Parent class constructr");
    }

}


class Son extends Father {
       
    
    Son()
    {    //super()  will be the first statemnet in constructor whether you write or not ,you cannot see and adding will not be a problem.
        // one more thing super() will go in search of default constructor and is imlicit call .
        System.out.println("Child class constructor");
    }
}



public class demo3 {

    public static void main(String [] args) {
        
        new Son();

    }
    
}
/*
Most Important Rule

Java automatically inserts only:

super();

It never automatically inserts:

super("abc");
super(10);
super(name);

If the parent constructor requires arguments, you must write them yourself.

Memory Trick
No constructor written?
       ↓
Java adds super()

Parent has super() ?
       ↓
Yes → Works

No → Compile Error

So:

Default constructor → automatic super()
Parameterized parent constructor → write super(arguments) manually.



*/