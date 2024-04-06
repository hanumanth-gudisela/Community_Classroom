package org.example.imperative.finalSection;

import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lamdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = name->{
                if(name.isBlank())
                    throw new IllegalStateException("");
                return name.toUpperCase();
        };
        BiFunction<String, Integer, String> upperCaseName1 = (name, age)->{
            if(name.isBlank())
                throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName1.apply("Alex",30));
  }
}
