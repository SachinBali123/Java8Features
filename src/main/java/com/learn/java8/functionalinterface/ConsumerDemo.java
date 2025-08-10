package com.learn.java8.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.print(" \nPrinting Provided Data as : Name= " + t.split("-")[0]);
        Consumer<String> ages = age -> System.out.print(" And Age Is : " + age.split("-")[1]);
        Consumer<String> nameSize = age -> System.out.print(" And Name Size Is : " + age.split("-")[0].length());

        List<String> list = List.of("Spruha-3", "Sachin-34", "Payal-25", "Shree-0");
        list.forEach(consumer.andThen(ages).andThen(nameSize));

        demoConsumerInterface();
    }

    private static void demoConsumerInterface(){
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println();
        list.forEach(t -> System.out.println("Printing : " + t));
    }
}
