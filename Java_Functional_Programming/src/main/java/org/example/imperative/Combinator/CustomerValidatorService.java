package org.example.imperative.Combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    public boolean isEmailValid(String email){
        return email.contains("@");
    }
    public boolean isPhoneNumber(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }
    public boolean isAdult(LocalDate date){
        return Period.between(date,LocalDate.now()).getYears()>16;
    }


    public  boolean isValid(Customer customer){
        return  isEmailValid(customer.getEmail()) &&
                isPhoneNumber(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());

    }

}
