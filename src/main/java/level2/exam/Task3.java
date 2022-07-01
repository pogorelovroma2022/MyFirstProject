package level2.exam;
/*
    Написать метод, который получает 2 числа и возвращает разницу между ними.
    Например(2,7), разница 5, 2й пример(7,2), разница тоже 5. Метод возвращает только
    положительное число.
*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println(getDifference(2, 7));
        System.out.println(getDifference(7, 2));
    }

    static int getDifference(int first, int second) {
        return Math.abs(first-second);
    }
}
