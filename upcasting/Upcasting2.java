package upcasting;
class Developer1{

    void work() {
        System.out.println("Developer Working");
    }

    void project()

        {

        System.out.println("Developer doing project");

        }

    

}

class JavaDeveloper1 extends Developer1 {

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

class PythonDeveloper1 extends Developer1 {


        @Override

        void work()

        {

        System.out.println("PythonDeveloper  is working");

        }



@Override

        void project()

        {

        System.out.println("Python is  doing project");

        }

}





public class Upcasting2 {
    public static void main(String[] args) {
        
        
        Developer1 dev1 = new JavaDeveloper1();

       
        
        dev1.work();

        dev1.project();

        Developer1 dev2 = new PythonDeveloper1();

        dev2.work();

        dev2.project();


    }
}
