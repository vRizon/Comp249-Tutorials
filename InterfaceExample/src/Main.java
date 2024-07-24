
//1. defintiion of interface Test
interface Test1{
    final static int x=10;
    void method1();

    void method2();
}

//6. Second interface
interface Test2{
    void function1();

    void function2();

    //public static
    public static void function3(){
        System.out.println("Static Function from inerface Test2");
    }
}



//2. ERROR because the methods are not overrriden so abstract keyword is required
//class MyClass implements Test{
//
//}

 class MyClass implements Test1, Test2{

    //Overriding these methods -> runtime polymorphism
    public void method1() {
        System.out.println("Method 1 of MyClass");

    }

    public void method2() {
        System.out.println("Method 2 of MyClass");

    }

     public void method3() {
         System.out.println("Method 3 of MyClass");

     }

     //
     public void function1(){
         System.out.println("Function 1 of MyClass");
     }

     public void function2(){
         System.out.println("Function 2 of MyClass");
     }




}

public class Main {
    public static void main(String[] args) {

        //3. creating reference of interface
        //Test1 t;

        //4. YOu cannot create an object of interface
        //Test1 t22 = new Test1();

        //5. Reference of interface = new Object of Subclass
        Test1 t = new MyClass();
        //child reference = new parent class object NOT ALLOWED!!!!!!!
//        MyClass cl = new MyClass();
        t.method1();
        t.method2();
        //t.method3();

        System.out.println("\n\n");

        Test2.function3();


        System.out.println("\n\n");

        //7.
        MyClass myClass = new MyClass();
        //t.function1();
        //t.function2();
        myClass.method1();
        myClass.method2();
        myClass.method3();

        myClass.function1();
        myClass.function2();
        //myClass.function3();





    }
}