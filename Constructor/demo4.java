package Constructor;

class Shadowing1 {
    String name ;
    int age ;
    double height ;

    public Shadowing1(String name , int age , double height)   //if you not use this priority will be given to local variable and it will assign itself.
    {                                                          //name clash will also occur , also called shadwoing problem
          this.name = name;
          this.age = age;
          this.height = height;                    

    }

    void display()
    {
        System.out.println(name); 
        System.out.println(age);         
        System.out.println(height);  



    }


}



public class demo4 {
        public static void main(String[] args) {
            Shadowing1 a = new Shadowing1("Sushant", 30, 5.5);

            a.display();

        }


}
