
public class Main {
    public static void main(String[] args) {

        //1.
        GenericArray<String> myArray = new GenericArray<>();
//        myArray.addData("Hi");
//        myArray.addData("ByeBye");

        //2. No Parameters
        //if parameter is not given by default as an object -> so i can store anything
//        GenericArray myArray2 = new GenericArray();
//
//        myArray2.addData("Hi");
//        myArray2.addData(10);
//        myArray2.addData("ByeBye");
//
//        myArray2.print();


        //3. Multiple Parameters
        //Key-Value pairs
        // Creating a pair of Integer and String
        Pair<Integer, String> intStringPair = new Pair<>(1, "One");
        intStringPair.printTypes();

        // Creating a pair of String and Double
        Pair<String, Double> stringDoublePair = new Pair<>("Pi", 3.14);
        stringDoublePair.printTypes();

        // Creating a pair of Boolean and Character
        Pair<Boolean, Character> boolCharPair = new Pair<>(true, 'C');
        boolCharPair.printTypes();



    }
}