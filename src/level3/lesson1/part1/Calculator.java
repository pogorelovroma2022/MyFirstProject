package level3.lesson1.part1;

public class Calculator {
    void sum(int... numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sum(1, 2, 7);
        calculator.sum(1, 2);
        calculator.sum(1, 2, 10, 20, 17, 200);

        int[] numbers = {1, 2, 3};
        calculator.sum(numbers);
    }
}
