package org.example.imperative.Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null).orElseGet(()-> "default value");

        System.out.println(value);
    }
}
