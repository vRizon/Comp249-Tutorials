import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //1.
        //example1_Greeting(5);


        //2.
//        int ans;
//        ans = factorial(5);
//        System.out.println("Final result of factorial of 5: " +ans);


        //3.
        //Scanner scanner = new Scanner(System.in);

        //Getting user input
//        int input;
//        System.out.println("Enter number: ");
//        input = scanner.nextInt();
//        //System.out.println(input);
//
//        //return fibonacci number starting from 0
//        System.out.println(fibonacciMethod(input));;
//
//        //return n fibonacci numbers in the sequence:
//        System.out.println("First " + input + " Fibonacci numbers:");
//        for (int i = 0; i < input; i++) {
//            System.out.print(fibonacciMethod(i) + " ");
//        }

    }

    //1
    public static void example1_Greeting(int i){
        System.out.println("Greetings");

        if(i <=3){
            return; //exit
        }

        example1_Greeting(i-1);
    }

    //2
    public static int factorial(int n){
        //int res;

        // This is a base case
        if (n == 1) {
            return 1;
        } else {
            //res = n * factorial(n - 1);
            //System.out.println(res);
            //return res;

            return n * factorial(n - 1); //recursive call to itself

            //without using recursive
            // Loop from 1 to n and multiply the result by each number
//            for (int i = 1; i <= n; i++) {
//                res *= i;
//            }
        }
    }

    //3
    public static int fibonacciMethod(int n){
        //base case
        if(n<=1){
            return n;
        }

        //calculate sum between two number before n
        return fibonacciMethod(n-1) + fibonacciMethod(n-2);


    }
}
