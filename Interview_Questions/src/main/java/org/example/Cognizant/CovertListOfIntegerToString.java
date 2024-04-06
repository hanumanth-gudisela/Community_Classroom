package org.example.Cognizant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//write a program to convert list of integer to string
public class CovertListOfIntegerToString {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5);

        String result = "";
         for (int i=0; i<integerList.size();i++){
             result = result+integerList.get(i);
             if (i!=integerList.size()-1){
                 result = result+","; // add a comma and space if it's not the last element
             }
         }
        System.out.println(result);


    // using streams
    List<Integer> list = List.of(1,2,3,4,5);
   // String result1 = list.stream().map(Objects::toString).collect(Collectors.joining(","));
        System.out.println(list.stream().map(Objects::toString));

    }
}
