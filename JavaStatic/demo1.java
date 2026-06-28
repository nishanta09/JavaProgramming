package JavaStatic;

class Program {
    static int a;
    static int b;

    int  p;        
    int  q;   

    static {


        System.out.println("I am inside static block");
        a =10 ;
        b = 20 ;
    }

    { //non static blokc or instance block

        System.out.println("I am inside non static block");
        p = 200;
        q = 300;
    }

    static void disp1 ()
    {
        System.out.println("I am inside static method");
        System.out.println(a);
        System.out.println(b);        
    }


    void disp2()
    {
        System.out.println("I am inside non static method");    
        System.out.println(p);    
        System.out.println(q);

    }


}



public class demo1 {
    
    public static void main(String[] args) {
        Program p = new Program();
        Program.disp1();
        p.disp2();
    }
}
