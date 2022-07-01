package level2.exam;
/*
    6*. Написать метод, который принимает 2 числа и возвращает наибольший
     общий делитель для обоих чисел.
*/
public class Task6 {
    public static void main(String[] args) {
        System.out.println(calculateGCD(60, 12));
    }

    private static int calculateGCD(int firstNumber, int secondNumber) {
        int gcd = 1;
        int min = Math.min(firstNumber, secondNumber);
        for (int i = 2; i <= min; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
