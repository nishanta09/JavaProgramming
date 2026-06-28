package Inheritance;


class Parent1  {
    void display1()
    {
        System.out.println("Inside parent display of demo2.java");
        
    }
}
class Child1 extends Parent1 {

    void display2()
    {
        System.out.println("Inside child1 display of demo2.java");
    }
}

class Child2 extends Child1
{   
        void display3()
        {
                System.out.println("Inside child2 display of demo2.java");
        }

    
}


public class demo2 {
    public static void main(String[] args) {
        Child2 c1 = new Child2();

        c1.display1(); 
        c1.display2();
        c1.display3();



    }
}
