package com.learn.java8.lamda;

import java.util.Arrays;

@FunctionalInterface
interface FilterString{
    boolean isRequiredIncluded(String  str);
}

public class StringFilterAdvanceExample {
    public static void main(String[] args) {
        String[] fruitStringArray = {"Apple","Banana", "SweetPotato","Mango", "strawberry"};
        System.out.println("All Fruits Start from 'S' or 's' Are : ");
        FilterString filterString = str -> str.startsWith("S") || str.startsWith("s");
        Arrays.stream(filterStringArray(fruitStringArray, filterString)).forEach(System.out::println);
    }

     private static String[] filterStringArray(String[] stringArray, FilterString filterString){
        return Arrays.stream(stringArray)
                .filter(filterString::isRequiredIncluded)
                .toList().toArray(new String[0]);
    }
}

