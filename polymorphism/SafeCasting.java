// package polymorphism;


// class Parent1 {

// void disp1() {

// System.out.println("Inside Parent disp1");

// }

// void disp2()

// {

// System.out.println("Inside Parent disp2");

// }

// }


// class Child1 extends Parent{

// @Override

// void disp2()

// {

// System.out.println("Inside Child1 disp2");

// }



// void disp3()

// {

// System.out.println("Inside Child1 disp3");

// }

// }





















// public class SafeCasting {
//     public static void main(String[] args) {

// Child1 c1 = new Child1();

// accessMethod(c1);

// Child2 c2= new Child2();

// accessMethod(c2);

// }

// static void accessMethod(Parent ref)

// {

// ref.disp1();

// ref.disp2();

// if(ref instanceof Child1)

// {

// ((Child1)(ref)).disp3();

// }

// else

// {

// ((Child2)(ref)).disp3();

// }

// }
// }
