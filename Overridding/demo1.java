package Overridding;

public class demo1 {
    
}


class Parent {

   public void display1() {

        System.out.println("I am inside parent display1");
    }


}

class Child extends Parent {
        @Override
      public void display1()
        {

        }
    

}