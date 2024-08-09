
public class Main {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.err.println("Caught in main: " + e);
            System.err.println("Original cause: " + e.getCause());
        }
    }

    public static void methodA() throws Exception {
        try {
            methodB();
        } catch (Exception e) {
            // Wrapping the original exception with additional context
            throw new Exception("Exception occurred in method A", e);
        }
    }

    public static void methodB() throws Exception {
        try {
            methodC();
        } catch (Exception e) {
            // Wrapping the original exception with additional context
            throw new Exception("Exception occurred in method B", e);
        }
    }

    public static void methodC() throws Exception {
        // Simulate an exception
        throw new Exception("Root cause: Something went wrong in method C");
    }
}