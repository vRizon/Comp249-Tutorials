import java.util.List;

public class Main {

    public static <T> T echo(T input) {
        return input;
    }

    public static <T extends Number> void printDouble(T number) {
        System.out.println(number.doubleValue());
    }

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        //1
//        String echoedString = echo("Hello");
//        Integer echoedInteger = echo(123);
//
//        System.out.println(echoedString);  // Output: Hello
//        System.out.println(echoedInteger); // Output: 123

        //2
//        printDouble(10);        // Output: 10.0 (Integer as Number)
//        printDouble(5.5);       // Output: 5.5 (Double as Number)
//        printDouble(3.14f);     // Output: 3.14 (Float as Number)

        //3
//        List<String> stringList = List.of("apple", "banana", 23);
//        List<String> stringList = List.of("apple", "banana", "cherry");
        //List<Integer> intList = List.of(1, 2, 3);

//        printList(stringList);  // Output: apple, banana, cherry
        //printList(intList);     // Output: 1, 2, 3
    }
}