package org.example.imperative.FunctionInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal Java Function
    Customer maria =   new Customer("Maria","08977876");
         greetCustomer(maria);

         // Consumer Function Interface
         greetCustomerCustomer.accept(maria);
         greetCustomerCustomerV2.accept(maria,false);
        greetCustomerCustomerV2.accept(maria,true);
    }

      //Consumer
    static Consumer<Customer> greetCustomerCustomer = customer -> System.out.println("Hello" + customer.customerName + ", thanks for registering phone number" + (customer.customerPhoneNumber));
    static BiConsumer<Customer,Boolean> greetCustomerCustomerV2 = (customer, showPhoneNum) -> System.out.println("Hello" + customer.customerName + ", thanks for registering phone number" + (showPhoneNum ?customer.customerPhoneNumber: "*********"));
    static void greetCustomer(Customer customer){
        System.out.println("Hello" + customer.customerName + ", thanks for registering phone number" + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer,Boolean showPhoneNum){
        System.out.println("Hello" + customer.customerName + ", thanks for registering phone number" + (showPhoneNum ?customer.customerPhoneNumber: "*********"));
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
