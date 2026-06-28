package polymorphism;

class Parent3 {
    
    public void display1()
    {
        System.out.println("I am inside parent display1");
    }

    public void display2() 
    {
        System.out.println("I am inside parent display2");
    }
}

class Child4 extends Parent3 {

                                //display2 is  known as inherited methods

    @Override
    public void display2()      //this is  called overriden methods
    {
        System.out.println("I have implemented display2 inherited method into overriden method");
    }

    public void display1()      //this is called child specific methods
    {   super.display1();        // to  call the parent method 
        System.out.println("I am inside child display1");
    }

}


public class Overriden {
    public static void main(String[] args) {

        Child4 ch = new Child4();
        ch.display1();    
        ch.display2();
        

    }
}
