package com.learn.java8.lamda;


import java.util.Arrays;
import java.util.stream.Collectors;

public class StringFruitFilterExample {

    private static String[] filterStringsArray(String[] strings){

        // Call Functional Interface
        StringFilter stringFilter = str -> str.startsWith("S") || str.startsWith("s");

        // Perform the filter operation by iterating using the stream()
        return Arrays.stream(strings)
                //.filter(str -> stringFilter.isStringStartWithS(str)) // same as below
                .filter(stringFilter::isStringStartWithS)
                //.collect(Collectors.toList()) //same as below
                .toList()
                .toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] fruitStringarray = {"Apple","Banana", "SweetPotato","Mango", "strawberry"};
        System.out.println("All Fruits Start from 'S' Are : ");
        Arrays.stream(filterStringsArray(fruitStringarray)).forEach(System.out::println);
    }
}

/*Added FunctionalInterface to understand use and concepts
*  This FI take string as an input and return the boolean result
*/
@FunctionalInterface
interface StringFilter{
    boolean isStringStartWithS(String str);
}
