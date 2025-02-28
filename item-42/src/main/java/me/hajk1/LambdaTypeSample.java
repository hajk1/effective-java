package me.hajk1;

import java.util.function.BiFunction;

public class LambdaTypeSample {
    public static void main(String[] args){
        // Explicit parameter types (Unnecessary in most cases)
        BiFunction<Integer, Integer, Integer> add = (Integer a, Integer b) -> a + b;

        System.out.println(add.apply(5, 10)); // Output: 15
        // Type inference used
        BiFunction<Integer, Integer, Integer> add2 = (a, b) -> a + b;

        System.out.println(add2.apply(5, 10)); // Output: 15

        // Without types: Less clear
        BiFunction<String, Integer, String> repeat = (s, n) -> s.repeat(n);

        // With explicit types: More readable
        BiFunction<String, Integer, String> repeat2 = (String s, Integer n) -> s.repeat(n);


    }
}
