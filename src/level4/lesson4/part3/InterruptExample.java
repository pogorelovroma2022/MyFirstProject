package level4.lesson4.part3;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        System.out.println(thread.isInterrupted());

        Thread.sleep(3_000);

        thread.interrupt();

        System.out.println(thread.isInterrupted());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}