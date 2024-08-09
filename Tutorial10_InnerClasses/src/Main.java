class OuterClass_1 {
    class InnerClass {
        void display() {
            System.out.println("Inside InnerClass");
        }
    }
}

class OuterClass_2 {
    static class StaticInnerClass {
        void display() {
            System.out.println("Inside StaticInnerClass");
        }
    }
}

class OuterClass_3 {
    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Inside LocalInnerClass");
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }
}



class OuterClass_4 {
    void outerMethod() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside AnonymousInnerClass");
            }
        };
        r.run();
    }
}

public class Main {
    public static void main(String[] args) {

        //1
//        OuterClass_1 outer1 = new OuterClass_1();
//        OuterClass_1.InnerClass inner = outer1.new InnerClass();
//        inner.display();

        //2
//        OuterClass_2.StaticInnerClass inner = new OuterClass_2.StaticInnerClass();
//        inner.display();

        //3
//        OuterClass_3 outer = new OuterClass_3();
//        outer.outerMethod();

        //4
        OuterClass_4 outer = new OuterClass_4();
        outer.outerMethod();

    }


}