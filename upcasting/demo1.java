package upcasting;



class Developer {

void work()

        {

                System.out.println("Developer working");

        }



void project()

        {

        System.out.println("Developer doing project");

        }

}
class JavaDeveloper extends Developer

{

        @Override

        void work()

        {

        System.out.println("JavaDeveloper working");
        
        

        }

        @Override
        

        void project()

        {

        System.out.println("JavaDeveloper doing project");

        }

}


class PythonDeveloper extends Developer

{

@Override

        void work()

        {

        System.out.println("PythonDeveloper  is working");

        }



@Override

        void project()

        {

        System.out.println("PythonDeveloper  is doing project");

        }

}







public class demo1 {
    public static void main(String[] args) {
        

           Developer dev1 = new JavaDeveloper();

       

        dev1.work();

        dev1.project();

        Developer dev2 = new PythonDeveloper();

        dev2.work();

        dev2.project();
    }
}
