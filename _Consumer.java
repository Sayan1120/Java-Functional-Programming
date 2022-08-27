package com.functional.interfaces_java.sys;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
// Use of Consumer and BiConsumer
public class _Consumer {
    public static void main(String[] args){
        // Normal approach using methods.
        Customer custom= new Customer("Sayan", "3546789");
        greetCustomer(custom);
        greetCustomer1(custom, true);

        // Use of Consumer Functional Interface..
        greetCustomerConsum.accept(custom);

        // Calling a BiConsumer Function
        greetCustomerConsum1.accept(custom, false);
    }
    // Use of Functional Interface
    static Consumer<Customer> greetCustomerConsum = customer ->
            System.out.println("Hello " + customer.customerName + ", Thanks for Registering phone number "
                    + customer.customerPhoneNum);

// Use of BiConsumer Functional Interface
    static BiConsumer<Customer, Boolean> greetCustomerConsum1 = (customer, showPhoneNum) ->
            System.out.println("Hello " + customer.customerName + ", Thanks for Registering phone number "
                    + (showPhoneNum ? customer.customerPhoneNum : "*******"));

    // Normal Approach
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", Thanks for Registering phone number "
                + customer.customerPhoneNum);
    }
    static void greetCustomer1(Customer customer, boolean showPhoneNum){
        System.out.println("Hello " + customer.customerName + ", Thanks for Registering phone number "
                + (showPhoneNum ? customer.customerPhoneNum : "*******"));
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNum;

        Customer(String customerName, String customerPhoneNum){
            this.customerName = customerName;
            this.customerPhoneNum = customerPhoneNum;
        }

    }

}
