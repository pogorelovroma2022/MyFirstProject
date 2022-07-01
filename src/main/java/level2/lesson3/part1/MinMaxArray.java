package level2.lesson3.part1;

import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
        /*
            Создать массив размером 20, заполнить случайными числами.
            Написать 2 метода, которые принимают массив и 1 метод возвращает минимальное,
            2 метод возвращает максимальное число этого массива.
        */
        int[] array = new int[20];
        Random generator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println(findMin(array));
        System.out.println(findMax(array));
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
