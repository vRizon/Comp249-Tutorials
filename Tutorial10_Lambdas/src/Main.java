
@FunctionalInterface
interface MyInterface{
    public void print();



//    public int subtract(int x,int y);

}


//6
class MyClass2{
    int temp =10;   //Can I access & modify this 10 inside lambda expression, similar to inner classes
                    //they don’t need to be final, final are only local to the method
    public void method(){
        MyInterface m = () -> {

            System.out.println("Line 1");
            System.out.println("Line 2 "+ (temp++) );
        };

        m.print();

    }
}



//class MyClass implements MyInterface{
//    public void print(){
//        System.out.println("Hello World!");
//    }
//}
public class Main {

    public static void main(String[] args) {
        //1
//        MyInterface i = new MyClass();
//        i.print();

        //2
        //Writing anonymous inner class
//        MyInterface m = new MyInterface() {
//            @Override
//            public void print() {
//                System.out.println("Hello World from Anonymous class");
//            }
//        };

        //3
        //Now we convert this into lambda expression
        // ...............

//        MyInterface m = ()-> System.out.println("Hello World from Lambda expression");
//        m.print();


        //4
        //Now we adding parameters and returning an expression
        // ...............

//        MyInterface m = (x,y)-> x-y;
//        int ans = m.subtract(20,5);
//        System.out.println(ans);



        //5
        //method + local variables
//        method();


        //6
        // Class and class parameters


        //7
        //Passing lambda expression as parameter
        method2( () -> System.out.println("Hello"));	//passing lambda expression as a parameter
                                                        //so we are passing method as an object
        

    }

    //5
    public static void method(){

        int counter=0;

        MyInterface m = () -> {
            //int temp = 0;
            System.out.println("Line 1");
            System.out.println("Line 2 " );
        };

        m.print();

    }


    //7
    public static void method2(MyInterface mI){	//this method needs a parameter of this type MyInterface mI
        mI.print();
    }



}