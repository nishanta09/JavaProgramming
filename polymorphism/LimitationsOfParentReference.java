package polymorphism;
class Parent {
    void disp1()
    {
        System.out.println("Inside parent disp1");
    }

    void disp2()
    {
        System.out.println("Inside parent disp2");
    }
}

class Child extends Parent
{
    @Override
    void disp2()
    {
        System.out.println("Inside child disp2");
    }

    void disp3()
    {
        System.out.println("Inside child disp3");
    }
}

class Child2 extends Parent{

@Override

void disp2()

{

System.out.println("Inside Child2 disp2");

}



void disp3()

{

System.out.println("Inside Child2 disp3");

}
}




public class LimitationsOfParentReference {
    public static void main(String[] args) {
        Parent child1 = new Child();
        child1.disp1();
        child1.disp2();
     //   child1,disp3();  // compile time error cannot acces child specific method with parent refernce;

            ((Child)(child1)).disp3();
    }
}
