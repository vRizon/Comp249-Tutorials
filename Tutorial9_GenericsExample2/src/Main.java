
import java.util.Scanner;

//Generic printer for whatever type we want
class Printer<T>{
    //Type T
    T typeObj;

    public Printer(T temp){
        this.typeObj=temp;
    }

    @Override
    public String toString() {
        return typeObj.toString();
    }


    public void printType() {
        if (typeObj != null) {
            System.out.println("The type of the object is: " + typeObj.getClass().getSimpleName());
        } else {
            System.out.println("The object is null.");
        }
    }
}



public class Main {
    public static void main(String[] args) {

        userType2();

    }

    public static void userType2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input something: ");
        String input = scanner.nextLine();

        Printer<?> printer = null;      //!!!!
//        In Java, the ? symbol is a wildcard in generics. It represents an unknown type. When you declare a variable with a wildcard,
//        it means that the variable can hold an instance of any generic type,
//        but you don’t know (or care) what the specific type is at that point.

        // Try to determine the type of the input
        try {
            Integer intValue = Integer.parseInt(input);
            printer = new Printer<>(intValue);
        } catch (NumberFormatException e1) {
            try {
                Double doubleValue = Double.parseDouble(input);
                printer = new Printer<>(doubleValue);
            } catch (NumberFormatException e2) {
                if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                    Boolean boolValue = Boolean.parseBoolean(input);
                    printer = new Printer<>(boolValue);
                } else {
                    printer = new Printer<>(input);
                }
            }
        }

        printer.printType();

        scanner.close();
    }


    //    public static void userType(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Choose the type of object to put in the Printer:");
//        System.out.println("1. Integer");
//        System.out.println("2. String");
//        System.out.println("3. Double");
//        System.out.println("4. Boolean");
//
//        int choice = scanner.nextInt();
//        scanner.nextLine(); // Consume newline left-over
//
//        switch (choice) {
//            case 1:
//                System.out.print("Enter an Integer: ");
//                int intValue = scanner.nextInt();
//                Printer<Integer> intPrinter = new Printer<>(intValue);
//                intPrinter.printType();
//                break;
//
//            case 2:
//                System.out.print("Enter a String: ");
//                String strValue = scanner.nextLine();
//                Printer<String> strPrinter = new Printer<>(strValue);
//                strPrinter.printType();
//                break;
//
//            case 3:
//                System.out.print("Enter a Double: ");
//                double doubleValue = scanner.nextDouble();
//                Printer<Double> doublePrinter = new Printer<>(doubleValue);
//                doublePrinter.printType();
//                break;
//
//            case 4:
//                System.out.print("Enter a Boolean: ");
//                boolean boolValue = scanner.nextBoolean();
//                Printer<Boolean> boolPrinter = new Printer<>(boolValue);
//                boolPrinter.printType();
//                break;
//
//            default:
//                System.out.println("Invalid choice.");
//        }
//
//        scanner.close();
//    }


}