package Constructor;
//concept of constructor overlaoding
class Student3{
    String name ;
    int age;

    Student3()  //without creating this constructor  if you create an bject in main like Student3 s1 = new Student3();
    {           //then it will give error ,bcoz we have created a parameterized constructor so compiler will not create the default one , so we have to create no parameter constructor  manually.
        name = "Nishant";
        age = 30;
    }

    Student3(int age)
    {
        this.age = age;
    }

    Student3(String name , int age)
    {
        this.name = name ;
        this.age = age ;
    }    

    void display()
    {  
        System.out.println(name);
        System.out.println(age);   

    }


}
public class demo5 {
    public static void main(String[] args) {
    
        Student3 s1 = new Student3();
        Student3 s2 = new Student3(45);
        Student3 s3 = new Student3("Sushant" ,35);

        /*Accoring to rule we have learned compiler will insert default constructor when thre is no constructor 
        in the class .But here we have created a parameterized constructor in the class there will be no default 
        constructor by the compiler 
         */

        s1.display();
        s2.display();
        s3.display();


    }
}
