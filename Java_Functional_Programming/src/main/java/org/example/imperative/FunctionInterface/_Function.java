package org.example.imperative.FunctionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes one argument and produces one argument
       int increment = increment(1);
        System.out.println(increment);
        Integer increment2= incrementByOneFunction.apply(2);
        System.out.println(increment2);
        Integer multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        Function<Integer,Integer> addBy1AndThenMultiplyBy10= incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addBy1AndThenMultiplyBy10 .apply(4));

        //Bi-Function takes two argument and produces one argument
        System.out.println(incrementBy1andMultiply(4,100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }
    static Function<Integer,Integer> incrementByOneFunction = number-> number+1;
    static Function<Integer,Integer> multiplyBy10 = number->number*10;
    static int increment(int number){
        return number+1;
    }

    //Bi-Function

   static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiply)-> (numberToIncrementByOne+1)* numberToMultiply;

     static int incrementBy1andMultiply(int number, int numToMultiply){
        return (number+1)*numToMultiply;
    }
}
