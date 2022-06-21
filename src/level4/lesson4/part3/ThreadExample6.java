package level4.lesson4.part3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample6 {
    public static void main(String[] args) throws InterruptedException {
        MyResource resource = new MyResource();
        MyThread2 thread1 = new MyThread2(resource);
        MyThread2 thread2 = new MyThread2(resource);
        System.out.println("Before: " + resource.x);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("After: " + resource.x);
    }
}

// synchronized

class MyResource {
    int x;

    Lock lock = new ReentrantLock();

    void increment() {
        lock.lock();
        try {
            x++;
        } finally {
            lock.unlock();
        }
    }
}

class MyThread2 extends Thread {
    MyResource resource;

    public MyThread2(MyResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
            resource.increment();
        }
    }
}