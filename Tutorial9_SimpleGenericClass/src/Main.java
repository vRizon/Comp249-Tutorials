//2.
//Generics give you the ability ti have a class is flexible for many different types
//avoid code duplication
//Type parameter in angle brackets, by convention T but it can be whatever
//T stands for type which is type of thing that this class is able to hold and do operations on
//we cannot anticipate what type user wants to pass in

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


}

public class Main {
    public static void main(String[] args) {

        //When instantiating, we put type that we want in <>
        Printer<Integer> p = new Printer<>(11);

        Printer<String> p2 = new Printer<>("greetings");

        System.out.println(p.toString());
        System.out.println(p2.toString());

        //userType();
    }

}