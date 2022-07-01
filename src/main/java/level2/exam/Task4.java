package level2.exam;

import java.util.Random;

/*
    4. Создать метод, который принимает boolean массив и проверяет, что массив однородной,
    т.е. в нём все эл-ты это только true, либо только false. Метод возвращает true,
    если массив однородный, в противоположном случае false.
*/
public class Task4 {
    public static void main(String[] args) {
        boolean[] array = new boolean[7];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            if (random.nextInt() % 2 == 0) {
                array[i] = true;
            } else {
                array[i] = false;
            }

            array[i] = random.nextBoolean();
        }
    }

    static boolean checkMonoArray(boolean[] array) {
        boolean isMono = true;
        boolean firstElement = array[0];

        for (boolean element: array) {
            if (firstElement != element) {
                isMono = false;
                break;
            }
        }

        return isMono;
    }
}
