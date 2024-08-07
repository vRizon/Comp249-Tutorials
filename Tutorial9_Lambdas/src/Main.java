
//When interface has only one abstract method - it's called functional interface
//best practice, adding @FunctionalInterface, compiler enforces that u have one abtract method in interface
//@FunctionalInterface
interface Printable{


//    void print();
    void print(String s);

    //void test();
}

// class Person implements Printable{
//    //implementation of print
//    public String name;
//    public int age;
//
//    @Override
//    public void print() {
//        System.out.println("Hello there!");
//    }
//}

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
        //1. use print method from interface
        //person.print();
//        printFunction(person);

        //System.out.println("\n\n");

        //2. use printFunction and passing object
//        printFunction(
//                public void print() {
//                    System.out.println("Hello there!");
//        });


        //3.
        //so Instead of doing all that coding we can pass only print method from Person
//

        //One way
//        printFunction(
//                public void print() {
////        System.out.println("Hello there!");
////    }
//        });





        //Another way: w/o {} because we only have one line
//        printFunction(() -> System.out.println("Hello there!"));
//
//        System.out.println("\n\n");
//
//        //here we are passing the method like an argument as we did with variables
//        //we can actually save this method into a variable
//        Printable lambdaTest = ()-> System.out.println("Hello there from lambda!");
//        printFunction(lambdaTest);

        //Lambda allow us make method implementation into objects


        Printable lambdaTest = s -> System.out.println("Hello there from lambda" );
        printFunction(lambdaTest);

    }

    //method that we pass any object of Printable interface
    public static void printFunction(Printable p){
//        p.print();
        p.print("?");
    }
}