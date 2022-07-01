package level1.exam;

/*
*       Дано целое число N (> 0).
        Используя операции деления нацело и взятия остатка от деления,
        найти число, полученное при прочтении числа N справа налево.
*/
public class Task6 {
    public static void main(String[] args) {
        int n = 123456;
        int reversedNumber = 0;
        for (;n != 0; n /= 10) {
            reversedNumber = reversedNumber * 10 + n % 10;
        }
        System.out.println(reversedNumber);
    }
}
