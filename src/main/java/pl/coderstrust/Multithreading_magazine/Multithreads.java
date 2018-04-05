package pl.coderstrust.Multithreading_magazine;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Multithreads {

    public static void main(String[] args) {
        BlockingQueue<String> box = new LinkedBlockingQueue<>(10);

        Runnable factoryOfChocolate_1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i) {
                    try {
                        box.put("chocolate brown number " + i);
                        System.out.println("chocolate brown number " + i + " has been produced");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(factoryOfChocolate_1).start();

        Runnable factoryOfChocolate_2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; ++i) {
                    try {
                        box.put("chocolate white number " + i);
                        System.out.println("chocolate white number " + i + " has been produced");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(factoryOfChocolate_2).start();

        Runnable consumer = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; ++i) {
                    try {
                        System.out.println(box.take() + " has been eaten chocolate ");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(consumer).start();
    }
}
