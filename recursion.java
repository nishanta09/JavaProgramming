public class recursion {
    public static void main(String[] args)
    {
            print1(1);
            System.out.println("I am in print1 function");
    }


    static void print1(int n)
    {    if(n>=5)
    {
        return;
    }
        System.out.println(n);
       print1(n++);
    }

}
