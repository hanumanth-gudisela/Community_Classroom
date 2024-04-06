package org.example.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("john", Gender.MALE),
                new Person("joe", FEMALE),
                new Person("josh", Gender.MALE),
                new Person("honey", FEMALE)
        );
        System.out.println("imperative Approach");
        // imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female:females){
            System.out.println(female);
        }
        System.out.println("Declarative Approach");
        // Declarative Approach
        List<Person> females2=   people.stream().filter(person ->
            FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
