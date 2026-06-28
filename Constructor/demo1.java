package Constructor;
class Student{

     String name;      
     int age;
     double height;

     void display()
     {
        
        System.out.println("Name  is : " + name + " Age is: " + age  + " Height is: " + height);

     }




}
public class demo1 {
    public static void main(String[] args) {
        
    
    Student s1 = new Student();
    s1.name="Nishnat";
    s1.age= 45;
    s1.height = 6;

    s1.display();   

    Student s2 = new Student();
    s2.name="Nishnat";
    s2.age= 45;
    s2.height = 6;

    s2.display(); 

    //what if 100 object we have to initialize so it will be a problem and time taking
        /*  when we  write Student s1 =  new Student() , instance members of class Student name,age,height
        are all in invalid state means all are with the default values  0 with their respective data type
        but later we prviding the values using s1.name etc 
        Initially they are 0,null , 0.0  and we are providing the values through object calling.*/
    
        /*s1.name="Nishnat";
         s1.age= 45;
         s1.height = 6; if we not write all these and directly call s1.display
         it will display null , 0 , 0.0 .
         */


         /*
            1.when you call s1.display1() which is not defined it will give error.
            THen why Student s1 = new Student() i.e Student() which is also a method when 
            called during object creation it will not give error why?
            ->bcoz default constructor automatically added during compilation process i.e Student()
            name = null
            age =0
            height= 0.
            note:-I will insert the constructor only when there is no constructor in the class.
            
            and later we defining using s1.name etc;

            note:- during object creation I am calling you Student() that's why I am calling with 
            a special name called constructor.

            Another method such as display() they are called after object created.
         
         
         */
    }
}
