package level4.lesson4.part2;

public class ThreadExample3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread();
            System.out.println(thread.getName());
        }
    }
}
