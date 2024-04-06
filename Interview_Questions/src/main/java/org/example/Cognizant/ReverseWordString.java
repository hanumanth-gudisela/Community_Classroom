package org.example.Cognizant;

import java.util.Arrays;

// write a program to reverse the given words of a string
public class ReverseWordString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String[] words = str.split("\\s+");
        String reverse ="";

        for (int i= words.length-1;i>=0;i--){
            reverse = reverse+words[i];
            if (i!=0){
                reverse= reverse+" ";
            }
        }
        System.out.println("the original String is: "+ str);
        System.out.println("the reverse of a String is: "+ reverse);

        // using streams
        String reversedString = String.valueOf(Arrays.stream(str.split("\\s+")).reduce((word1, word2)-> word2 +" "+word1).orElse(""));
        System.out.println(reversedString);
    }
}
