package me.hajk1;

public class StringInternExampleOriginal {
  public static void main(String[] args) {
    String s1 = new String("hello");
    String s2 = new String("hello");

    System.out.println(s1 == s2); // false (Different heap objects)

    String s3 = s1.intern();
    String s4 = s2.intern();

    System.out.println(s3 == s4); // true (Same reference from String Pool)
  }
}
