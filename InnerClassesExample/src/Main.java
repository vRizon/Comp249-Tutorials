
//1.
class OuterClass{
    int x = 5;

    //7. create an object before class definition
    //InnerClass inner = new InnerClass();

    //2.
    class InnerClass{
        int y = 2;
        public void printInnerClass(){
            System.out.println("Print Inner Class:");
            System.out.println("x=" + x + "\ny="+y);
        }
    }

    //3. this method creates an object of inner class
    public void printOuterClass(){
        //5.
        InnerClass i = new InnerClass();
        i.printInnerClass();

        //6. Access value from inner class
        System.out.println("Print Outer Class:");
        System.out.println(i.y);
    }
}


public class Main {
    public static void main(String[] args) {

        //4.
        //unless i create object of outer class i cannot use inner class
        //OuterClass outerClass = new OuterClass();
        //outerClass.printOuterClass();


        //8.
        OuterClass.InnerClass oi = new OuterClass().new InnerClass();
        oi.printInnerClass();

    }
}