package Constructor;

/*Understanding the program flow of static , non static , constructor who will execute the first */
class ProgramFLow{

    static{
        System.out.println("Static block executed");
    }

    {
        System.out.println("Non static block executed");
    }

    ProgramFLow()
    {
        System.out.println("Constructor executed");
    }




}
public class demo7 {
    public static void main(String[] args) {
        new ProgramFLow();

        
    }
}
