package level4.lesson2.part1;

public class HeapStackExample1 {
    public static void main(String[] args) { // String 2 byte * 4
        int x = 1; // 4 byte
        int y = 2; // 4 byte
        sum(x, y); // 10 byte
    }

    static void sum(int x, int y) {
        int result = x + y;
        System.out.println(result);
    }
}
