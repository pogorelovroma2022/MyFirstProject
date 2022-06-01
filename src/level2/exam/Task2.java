package level2.exam;

/*
    2. Написать метод, который возвращает
    среднее арифметическое от 1 до 9.
*/
public class Task2 {
    public static void main(String[] args) {

    }

    static double calculateAverage() {
        int sum = 0;
        // index
        for (int i = 1; i <= 9; i++) {

            sum += i;
        }
        return (double) sum / 9;
    }
}
