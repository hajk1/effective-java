package me.hajk1;

import java.util.concurrent.locks.*;

public class ReentrantLockSample {

  private final Lock lock = new ReentrantLock();
  private final Condition available = lock.newCondition();
  private boolean isAvailable = false;

  public static void main(String[] args) {
    ReentrantLockSample resource = new ReentrantLockSample();

    Thread producer = new Thread(resource::produce);
    Thread consumer =
        new Thread(
            () -> {
              try {
                resource.consume();
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            });

    producer.start();
    consumer.start();
  }

  public void produce() {
    lock.lock();
    try {
      isAvailable = true;
      available.signal(); // Signals one waiting thread
    } finally {
      lock.unlock();
    }
  }

  public void consume() throws InterruptedException {
    lock.lock();
    try {
      while (!isAvailable) {
        available.await(); // Waits safely
      }
      isAvailable = false;
    } finally {
      lock.unlock();
    }
  }
}
