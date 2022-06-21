package level4.lesson4.part2;

public class ThreadExample4 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();

        Thread thread1 = new Thread(task2, "thread1");
        Thread thread2 = new Thread(task2, "thread2");

        thread1.start();
        thread2.start();
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}