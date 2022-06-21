package level4.lesson4.part2;

public class ThreadExample5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начало main");

        MyThread thread1 = new MyThread();
        MyThread2 thread2 = new MyThread2();

        System.out.println(thread1.isAlive());

        thread1.start();

        System.out.println(thread1.isAlive());

        thread2.start();

        thread1.join();

        System.out.println(thread1.isAlive());

        thread2.join();

//        thread1.run();
//        thread2.run();

        System.out.println("Конец main");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello 1");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello 2");
    }
}
