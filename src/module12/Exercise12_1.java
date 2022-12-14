package module12;

import java.util.concurrent.*;

public class Exercise12_1 {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.scheduleAtFixedRate(new Consumer(), 5, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new Producer(), 1, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        executor.shutdown();

    }

    public static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public static class Producer implements Runnable{
        int currValue;
        @Override
        public void run() {
            try {
                queue.put("notification #" + currValue);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currValue++;
            System.out.println(currValue + " sec");
        }
    }

    public static class Consumer implements Runnable{
        @Override
        public void run() {
            System.out.println("5 second passed....");
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }
    }
}
