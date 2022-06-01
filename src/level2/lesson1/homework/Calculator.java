package level2.lesson1.homework;
/*
    Создать класс Калькулятор, в нём 4 метода для арифметических операций:
    сложение, вычитание, умножение и деление.
    Каждый метод должен принимать 2 параметра типа double и возвращать значение типа double.
*/
public class Calculator {
    static double add(double x, double y) {
        return x + y;
    }
    // i, j, k
    static double sub(double i, double j) {
        return i - j;
    }
    static double umnogenie(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
    static double delenie(double number1, double number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {
    }
}
