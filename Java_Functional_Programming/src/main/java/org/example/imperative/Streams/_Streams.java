package org.example.imperative.Streams;

import java.util.List;

import static org.example.imperative.Streams._Streams.Gender.FEMALE;
import static org.example.imperative.Streams._Streams.Gender.PREFER_NOT_TO_SAY;


public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("john", Gender.MALE),
                new Person("joe", FEMALE),
                new Person("josh", Gender.MALE),
                new Person("honey", FEMALE),
                new Person("jolly",PREFER_NOT_TO_SAY)
        );
        // Details Explanation
//        Function<Person,String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = System.out::println;
//
//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);
       boolean containsOnlyFemales =   people.stream().allMatch(
                person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);

        boolean containsAllGendersV1 =   people.stream().anyMatch(
                person -> FEMALE.equals(person.gender));
        System.out.println(containsAllGendersV1);

        boolean containsAllGendersV2 =   people.stream().anyMatch(
                person -> FEMALE.equals(person.gender));
        System.out.println(containsAllGendersV2);

        boolean containsAllGendersV3 =   people.stream().noneMatch(
                person -> FEMALE.equals(person.gender));
        System.out.println(containsAllGendersV3);
    }

    static class Person{
        private final String name;
        private final Gender gender;
        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE,PREFER_NOT_TO_SAY
    }
}
