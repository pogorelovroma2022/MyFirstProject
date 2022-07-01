package level4.lesson3.part1;

public class ExceptionExample2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        sum(x, y);
    }

    private static void sum(int x, int y) {
        if (y == 0) {
            throw new RuntimeException("Гугл сказал, что делить на 0 нельзя!!!! Попробуйте другое число.");
        }

        System.out.println(x / y);
    }
}
