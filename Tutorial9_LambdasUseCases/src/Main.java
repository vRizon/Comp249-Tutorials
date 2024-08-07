import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface StringFunction {
    String run(String str);
}

public class Main {
    public static void main(String[] args) {
        //1.
        //sortFunction();

        //2.
        //printArray();

        //3.
        //java.lang.Runnable is an interface that is to be implemented by a class
        // whose instances are intended to be executed by a thread.
        // Traditional way
//        Runnable runnable1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello from a traditional Runnable!");
//            }
//        };
//
//        // Lambda way
//        Runnable runnable2 = () -> System.out.println("Hello from a lambda Runnable!");

        // Running the Runnables
//        runnable1.run();
//        runnable2.run();

        //4.
        //Passing lambda as argument
//        StringFunction exclaim = (s) -> s + "!";
//        StringFunction ask = (s) -> s + "?";
//        printFormatted("Hello", exclaim);
//        printFormatted("Hello", ask);

    }

    public static void sortFunction(){
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("Before sorting: " + strings);

        // Sort the list using a lambda expression
        strings.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println("After sorting: " + strings);
    }

    public static void printArray(){
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}