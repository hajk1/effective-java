package me.hajk1;

import java.util.concurrent.*;

public class CountDownLatchSample {

  public static void main(String[] args) throws InterruptedException {
    CountDownLatch latch = new CountDownLatch(3);
    ExecutorService executor = Executors.newFixedThreadPool(3);

    for (int i = 1; i <= 3; i++) {
      int taskId = i;
      executor.submit(
          () -> {
            System.out.println("Task " + taskId + " completed.");
            latch.countDown(); // Decrease the latch count
          });
    }

    latch.await(); // Waits until all tasks finish
    System.out.println("All tasks finished!");

    executor.shutdown();
  }
}
