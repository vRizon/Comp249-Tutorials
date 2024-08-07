
class A{}
class B extends A{}

class C extends B{}


//1
class myArray<T>{
    T data[]  = (T[]) new Object[10];

    int length=0;

    public void addData(T t){
        //
        data[length++]=t;
    }

    public void print(){
        for(T temp:data){
            System.out.println(temp);
        }
    }
}


public class Main {

    //2.
    //generic method that will take list of Elements and print
    //it can work for any number of arguments (E... list)
    static <E> void printGeneric(E[] list){
        for(E temp:list){
            System.out.println(temp);
        }

    }

    //3. add bounds by extending Number

    //4.
    //to define generics as argument we use unbounded wildcard
    static void test(myArray<? super B> obj){
        obj.print();
    }

    //Unbounded Windcard (which is the same as using any Object)

    //5.
    // upper bound extends/super A


    public static void main(String[] args) {

        //2.
//        printGeneric(new String[]{"cat","dog", "snake"});
//        printGeneric(new Integer[]{11,5,98});


        //4.
        myArray<B> arr1 = new myArray<>();
//        arr1.addData("Cat");
//        arr1.addData("Dog");

//
        myArray<C> arrInt = new myArray<>();
//        arrInt.addData(87);
//        arrInt.addData(42);
//
        test(arr1);
//        test(arrInt);




    }


}