package com.learn.java8.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

/*
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
*/
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Sachin";

        String str = supplier.get();
        System.out.println(str);

        Supplier<String> defailtSupplier = () -> "default";
        //List<String> nameList = List.of("abc","zyx");
        List<String> nameList = List.of();
        System.out.println(nameList.stream().findAny().orElseGet(defailtSupplier));
    }
}
