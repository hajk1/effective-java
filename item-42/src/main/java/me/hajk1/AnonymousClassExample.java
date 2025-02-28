package me.hajk1;

import java.util.*;

public class AnonymousClassExample {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

    // Sorting using an anonymous class
    Collections.sort(
        words,
        new Comparator<String>() {
          @Override
          public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
          }
        });

    System.out.println("Sorted by length (Anonymous Class): " + words);
  }
}
