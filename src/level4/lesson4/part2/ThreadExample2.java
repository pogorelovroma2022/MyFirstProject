package level4.lesson4.part2;

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        Thread.sleep(1_000);
        System.out.println(thread.getState());
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Привет из 2го потока!!! Ехууууу!!");
    }
}