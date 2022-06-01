package level2.exam;

import java.util.Arrays;

/*
    5*. Написать метод, который принимает 2 строковых аргумента.
    Метод должен вернуть сколько раз встречается 1 аргумент во 2 аргументе.
*/
public class Task5 {
    public static void main(String[] args) {
        String string = "abcabc xabc y abc, abc abcabcabcabc";
        String substring = "abc";
        countMatch(substring, string);
    }

    static void countMatch(String substring, String string) {
        int quantity = 0;
        int currentIndex = 0;
        while (currentIndex >= 0) {
            currentIndex = string.indexOf(substring, currentIndex + 1);
            quantity++;
        }
        System.out.println(quantity);
    }
}
