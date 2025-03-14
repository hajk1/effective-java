package me.hajk1;

import java.util.concurrent.*;

public class ConcurrentHashMapExample {
  public static void main(String[] args) {
    ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    ExecutorService executor = Executors.newFixedThreadPool(3);

    // Writer Thread
    executor.submit(
        () -> {
          for (int i = 1; i <= 5; i++) {
            map.put("Key" + i, i);
            System.out.println("Added: Key" + i);
          }
        });

    // Reader Threads
    executor.submit(
        () -> {
          for (int i = 1; i <= 5; i++) {
            System.out.println("Read: " + map.getOrDefault("Key" + i, -1));
          }
        });

    executor.shutdown();
  }
}
