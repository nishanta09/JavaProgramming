package JavaStatic;

class Program2{
    static int a ;

    static{
            System.out.println("Inside static block");
            a=10;
    }

    int b;

    void display()
    {
        System.out.println(a);    
        System.out.println(b);
    }
}



public class demo2 {
    public static void main(String[] args) {

        Program2 p1 = new Program2();
        Program2 p2 = new Program2();

        p1.display();
        p2.display();
        
    }
}
