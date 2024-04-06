package org.example.imperative.finalSection;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
     hello("john","Maria",value->{
         System.out.println("no Last name not provided for " + value);
     });
        hello2("john",null, () ->{
            System.out.println("no Last name not provided");
        });
    }
    static void hello(String firstName, String lastName, Consumer<String> callBack){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }else {
            callBack.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callBack){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        }else {
            callBack.run();
        }
    }
}
