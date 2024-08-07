import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String BREAK= "----------------------------------------";

    public static void main(String[] args) {

        //1.
//        Object obj1 = new String("Greetings");
//        //obj = new Integer(10);
//
//        String str = (String) obj1;
//
//        System.out.println(str.toString());
//
//        //break
//        System.out.println(BREAK);
//
//        //2.
//        //we have array of type object
//        Object obj2[]=new Object[4];
//
//        obj2[0]= "hello";
//        obj2[1] = "goodbye";
//        //obj2[2] = 10;
//        //obj2[3]=true;
//
//        String str2;
//
//        for(int i =0; i< obj2.length; i++){
//            str2 = (String) obj2[i];
//
//
//            //System.out.println(str2);  //causes runtime error
//
//            //System.out.println(obj2[i]);  //prints out everything in the array
//        }

        //It allows you to store all objects -> no restrictions
        //as a programmer i made a mistake

        //there is no type safety, compiler does not check


        //3. Where generics come in
        //We want to have array of any time but only that type
//        String strings[]=new String[3];
//        Integer integers[] = new Integer[3];


        //break
        System.out.println(BREAK);

        //4.
        //Using GenericDemo generic class
        GenericTypeArray<String> gd = new GenericTypeArray<>();
        gd.data="Hello";
        //gd.data[1]="Bye";
        //gd.data[2]=11;      //cause incompetible error
        //gd.data[2]=new Integer(11);

        String str3 = gd.data;   //don't need typecasting
        System.out.println(str3);

    }
}