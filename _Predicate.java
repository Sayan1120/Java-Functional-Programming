package com.functional.interfaces_java.sys;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args){
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumValid("7400000045"));
        System.out.println(isPhoneNumValid("8694037623"));
        System.out.println();

        // Calling the Predicate function.
        System.out.println("With Predicates");
        System.out.println(isPhoneNumValidPred.test("7400000345"));

        // Checking the number is valid and contains the needed value.
        System.out.println(isPhoneNumValidPred.and(containsNum).test("7458392392")); //true
    }
    static boolean isPhoneNumValid(String PhoneNum){
        // Checking the Validity of the phone number.
        return PhoneNum.startsWith("74") && PhoneNum.length() == 10;
    }

    // Using the Predicate Functional Interface
    static Predicate<String> isPhoneNumValidPred = PhoneNum ->
            PhoneNum.startsWith("74") && PhoneNum.length() == 10;

    static Predicate<String> containsNum = PhoneNum -> PhoneNum.contains("4");

}
