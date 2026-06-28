package Constructor;
class CopyCons{
        String name ;
        int age;

        CopyCons(String name , int age)
        {
                this.name = name;
                this.age= age;  
        }

        CopyCons(CopyCons ref)
        {
            this.name = ref.name;    //don't confuse in copying and referencing
            this.age= ref.age;
        }
        void display()
        {
            System.out.println(name);
            System.out.println(age);
            System.out.println(this);
        }
}
public class demo6 {
    public static void main(String[] args) {
            CopyCons c1 = new CopyCons("Ritesh Kumar", 33);

            c1.display();

            CopyCons c2 = new CopyCons(c1);  //passing object reference 

            c2.display();

            System.out.println(c1);
            System.out.println(c2);
    }
}
