package me.hajk1;

interface StringProcessor {
  String process(String str);
}

public class FunctionalInterfaceExample {
  public static void main(String[] args) {
    // Using an anonymous class
    StringProcessor uppercaseProcessor =
        new StringProcessor() {
          @Override
          public String process(String str) {
            return str.toUpperCase();
          }
        };

    System.out.println(uppercaseProcessor.process("hello"));

    // Using a lambda
    StringProcessor lambdaProcessor = str -> str.toUpperCase();
    System.out.println(lambdaProcessor.process("hello"));
  }
}
