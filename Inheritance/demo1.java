package Inheritance;
/*
Every class in Java implicitly or explicitly extends java.lang.Object. 
 If a class declaration does not specify an extends clause (e.g., class Animal {}), 
 Java automatically treats it as class Animal extends Object {}.

Key Points:
Implicit Inheritance: If you define a class as public class Main { ... }, 
the compiler automatically treats it as public class Main extends Object { ... }. 
Available Methods: Consequently, the main class inherits standard methods like toString(), 
equals(), hashCode(), and getClass() from the Object class. 
No Multiple Inheritance: While every class extends Object, a Java class can only extend one other class.  
It cannot extend another user-defined class and Object simultaneously, as Object is the implicit parent for 
all classes not explicitly extending another class. 
 */


class Parent{
    void display()
    {
        System.out.println("Inside Parent display");
    }
}

class Child extends Parent
{   
        void display1()
        {
            System.out.println("Inside child display");
        }
}


public class demo1 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
        c1.display1();

      //  Parent p1 = new Parent();  // this one allowed
       // p1.display1();  // not allowed

        Parent p2 = new Child();  //Parent refernce to child object
        p2.display();
      //p2.display1();  // not allowed

        





        /*  

         */

    }
}
