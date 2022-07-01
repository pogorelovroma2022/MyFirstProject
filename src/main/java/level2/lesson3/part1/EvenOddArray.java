package level2.lesson3.part1;

import java.util.Arrays;

/*
Создать массив размером 15 с типом элементов String.
Записать в массив слова “чётный”, “нечётный” в зависимости от индекса,
если индекс чётный, то должно быть слова “чётный”.
Вывести полученный результат на экран.
*/
public class EvenOddArray {
    public static void main(String[] args) {
        String[] array = new String[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = i % 2 == 0 ? "Чётный" : "Нечётный";
        }
        System.out.println(Arrays.toString(array));
    }
}
