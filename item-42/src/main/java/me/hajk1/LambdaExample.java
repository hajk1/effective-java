package me.hajk1;

import java.util.*;

public class LambdaExample {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

    // Sorting using a lambda expression
    words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

    System.out.println("Sorted by length (Lambda): " + words);
  }
}
