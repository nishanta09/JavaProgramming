package Constructor;
public class shadow {
 
   static int a = 10 ;  // this is a global variable

    public static void main(String[] args) {
        
         System.out.println(a); // this will print the global variable a which is 10
        

            int a = 20 ; // this is a local variable which is shadowing the global variable a
            System.out.println(a);  // this will print the local variable a which is 20 because it is shadowing the global variable a

             System.out.println(shadow.a); // this will print the global variable a which is 10 because we are using the class name to access it
        
       
    }
}


 /* Shadowing in Java occurs when a variable declared within a specific scope has the same name as a variable declared in
an outer scope. In such cases, the inner variable “shadows” or hides the outer variable, making the outer variable
 temporarily inaccessible within that inner scope. This can lead to confusion and unintended behavior if not understood correctly. */