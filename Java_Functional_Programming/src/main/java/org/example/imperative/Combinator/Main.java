package org.example.imperative.Combinator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Joe","jon@gmail.com","+098765567",
                LocalDate.of(2000,1,1)
        );
 //       System.out.println(new CustomerValidatorService().isValid(customer));
//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        validatorService.isValid(customer);

        //Using Combinator Pattern
      CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isAnAdult())
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .apply(customer);
        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }

}
