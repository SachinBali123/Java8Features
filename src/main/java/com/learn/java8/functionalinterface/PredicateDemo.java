package com.learn.java8.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        //Predicate<Integer> predicate = (t) -> t % 2 == 0;
        Predicate<Integer> predicate = (t) -> t % 2 == 0;
        System.out.println(predicate.test(7));
        demoPredicate(predicate);
    }

    private static void demoPredicate(Predicate<Integer> predicate){
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println("Given List :" + list.toString());
        System.out.println("Print Only Even Numbers :" );
        list.stream().filter(predicate).forEach(System.out::println);

        System.out.println("Print Only Odd Numbers :" );
        Predicate<Integer> oddPredicate = t -> !(t % 2 == 0);
        list.stream().filter(oddPredicate).forEach(System.out::println);
    }
}

//@FunctionalInterface
//public interface Predicate<T> { // IT IS USED FOR CONDITIONAL CHECK

    // boolean test(T t);
    // default java.util.function.Predicate<T> and(java.util.function.Predicate<? super T> other)
    // default Predicate<T> negate() { return (t) -> !test(t); }
    // default java.util.function.Predicate<T> or(java.util.function.Predicate<? super T> other)
    // static <T> java.util.function.Predicate<T> isEqual(Object targetRef)
    // static <T> java.util.function.Predicate<T> not(java.util.function.Predicate<? super T> target)
//}