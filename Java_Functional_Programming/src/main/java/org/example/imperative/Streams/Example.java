package org.example.imperative.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
       // list.add("Mango");
        System.out.println(streamOf(list).toList());

        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> streamOfCollection = collection.stream();
        System.out.println(streamOfCollection.toList());

        String[] arr = new String[]{"a","b","c"};
        Stream<String> strArrayFull = Arrays.stream(arr);
        System.out.println(strArrayFull.toList());
        Stream<String> strArrayPart = Arrays.stream(arr,1,3);
        System.out.println(strArrayPart.toList());
        Stream<String> stream = Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println(stream.toList());
        Stream<String> stringStream = Stream.generate(()->"element").limit(10);
        System.out.println(stringStream.toList());
        Stream<Integer> streamIterate = Stream.iterate(40,n->n+10).limit(20);
        System.out.println(streamIterate.toList());
        IntStream streamOfChars = "abbc".chars();
        System.out.println(streamOfChars.count());
        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");
        System.out.println(streamOfString.toList());
    }

    public static Stream<String> streamOf(List<String> list){
        return list==null || list.isEmpty() ? Stream.empty():list.stream();
    }
}
