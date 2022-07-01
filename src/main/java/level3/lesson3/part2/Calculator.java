package level3.lesson3.part2;

public class Calculator {
    void sum(int x, int y) {
        System.out.println(x + y);
    }

    void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(10, 20);
        calculator.sum(10, 20, 30);
    }
}
