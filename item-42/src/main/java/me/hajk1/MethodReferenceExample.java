package me.hajk1;

import java.util.*;

public class MethodReferenceExample {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

    // Sorting using a method reference
    words.sort(Comparator.comparingInt(String::length));

    System.out.println("Sorted by length (Method Reference): " + words);
  }
}
