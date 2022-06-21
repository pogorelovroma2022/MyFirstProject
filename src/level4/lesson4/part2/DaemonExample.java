package level4.lesson4.part2;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Начало main");

        MyThread3 thread1 = new MyThread3();
        thread1.start();

        System.out.println("Конец main");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("Начало отдельного потока");

        for (int i = 0; i < 1_000; i++) {
            System.out.println(i);
        }

        System.out.println("Конец отдельного потока");
    }
}