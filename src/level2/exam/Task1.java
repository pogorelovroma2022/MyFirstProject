package level2.exam;

// 1. Написать метод, который возвращает сумму чисел от 1 до 5.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    static int sum() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            // sum += i;
            sum = sum + i;
        }
        return sum;
    }
}
