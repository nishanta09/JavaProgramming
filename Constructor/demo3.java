package Constructor;
class Shadowing{

int x;
int y;

void display ()
{
    System.out.println(this);
}

public Shadowing()
{

}



}
public class demo3 {
    public static void main(String[] args) {
        
        Shadowing s1 = new Shadowing(); 
        Shadowing s2 = new Shadowing();
       

        s1.display();
        System.out.println(s1);

        

        /*
        
        Shadowing s1 = new Shadowing(); rule  is simple whenever object is created then it's address
        given to refernce variable but before there is another person called "this" that has the same address.
        Another concept is if program will move to line s2 then "this" has refernce to s2 and so on.
        Your current object is always pointed by two people "this" and reference variable.
        Q what is the proof?
        */


        s1.display();
        System.out.println(s1);

        /*above will print the same address for "this" and refernce variable and so on for the rest of the example*/

        s2.display();
        System.out.println(s2);



        /*
        Another use of "this" when jvm confused to assign the value

        
        */






    }
}
