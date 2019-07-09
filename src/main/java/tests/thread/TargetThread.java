package tests.thread;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TargetThread  extends TestClass implements Runnable{
    @Override
    public void run() {
        System.out.println("MyThread run.");
    }

    public static void runThread() {
        TargetThread targetThread = new TargetThread();
        Thread thread = new Thread(targetThread);
        thread.run();
    }

    public static void executorServieTest() {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        while (true) {
            threadPool.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " is running...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public static void main(String[] args) {
        //runThread();
        executorServieTest();
    }
}
