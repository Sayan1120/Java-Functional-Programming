package com.functional.interfaces_java.sys;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println("Method Call: "+increment(3));

        // Calling the Functional Interface
        int inc = increBy1.apply(3);
        System.out.println("Functional Interface Call: "+inc);

        // Chaining Function (Basic Way)
        int multiply = multiplyBy10.apply(inc);
        System.out.println("After chaining of Function for multiplication " +
                "purpose: " + multiply); // it is 3*10

        // The better approach for chaining functions is to use andThen()
        Function<Integer, Integer> addAndMultiply = increBy1.andThen(multiplyBy10);
        System.out.println("Better way of Chaining: " + addAndMultiply.apply(3));

        // BiFunction
        System.out.println("Use of BiFunction for Adding and Multiplying: "
                + increAndMultiplyBiFunc.apply(4, 100));

        // Normal way, without using BiFunction
        System.out.println("Normal way without the use of BiFunction: "
                +increBy1AndMultiplyBy(4, 100));
    }

    // Use of Function Interface
    static Function<Integer, Integer> increBy1 = num -> num++; // This is the same as increment method
                    //Input, Output
    static Function<Integer, Integer> multiplyBy10 = num -> num*10;

    static int increment(int num){
        return num + 1;
    }
    // Usage of BiFunction
    static BiFunction<Integer, Integer, Integer> increAndMultiplyBiFunc =
            (num, numMultiply) -> (num + 1) * numMultiply;

    static int increBy1AndMultiplyBy(int num, int numMultiply){
        return (num + 1) * numMultiply;
    }
}
/*
 * BiFunction is typically a Function but unlike a Function, it takes two inputs and gives one output.
 */
