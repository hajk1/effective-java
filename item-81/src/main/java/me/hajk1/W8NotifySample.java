package me.hajk1;

public class W8NotifySample {
  private boolean available = false;

  public static void main(String[] args) {
    W8NotifySample resource = new W8NotifySample();

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

  public synchronized void produce() {
    available = true;
    notify(); // Notifies one waiting thread
  }

  public synchronized void consume() throws InterruptedException {
    while (!available) {
      wait(); // Waits until available
    }
    available = false;
  }
}
