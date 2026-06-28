package Constructor;


class Student1{
    String name;      
     int age;
     double height;


     public Student1(String name  , int age , double height){
        this.name = name;
        this.age= age;
        this.height=height;
     }
     void display()
     {
        
        System.out.println("Name  is : " + name + " Age is: " +  age  + " Height is: " + height);

     }

}
public class demo2 {
    public static void main(String[] args) {
        

        Student1 s1 = new Student1("Prashant" , 35 , 6.0);
        s1.display();
    }
}


/*  
note:-I will insert the constructor only when there is no constructor in the class.
if you add parameterized constructor , then compiler will no longer automatically generate a default constructor.

 */