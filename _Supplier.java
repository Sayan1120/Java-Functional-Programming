package com.functional.interfaces_java.sys;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args){
        System.out.println(getDbConnect());
        // Calling a Supplier Functional Interface
        System.out.println(getDbConnectSup.get());
    }
// Supplier is the supplier of results.
    static String getDbConnect(){
        return "jdbc://localhost:6969/users";
    }

    static Supplier<List<String>> getDbConnectSup = () -> // List is not necessary, it is optional
            List.of("jdbc://localhost:6969/users"); // This will return a list

}
