package me.hajk1;

import java.util.concurrent.*;

public class CompletableFutureSample {

  public static void main(String[] args) {
    CompletableFuture.supplyAsync(
            () -> {
              return "Task Completed!";
            })
        .thenAccept(System.out::println);

    System.out.println("Main thread is free!");
  }
}
