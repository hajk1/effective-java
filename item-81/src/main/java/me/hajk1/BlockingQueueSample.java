package me.hajk1;

import java.util.concurrent.*;

public class BlockingQueueSample {

  private static final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    executor.submit(
        () -> { // Producer
          try {
            for (int i = 1; i <= 5; i++) {
              queue.put(i);
              System.out.println("Produced: " + i);
              Thread.sleep(500);
            }
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        });

    executor.submit(
        () -> { // Consumer
          try {
            for (int i = 1; i <= 5; i++) {
              int data = queue.take();
              System.out.println("Consumed: " + data);
            }
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        });

    executor.shutdown();
  }
}
