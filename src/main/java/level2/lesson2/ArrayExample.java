package level2.lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // type[] name = new type[length];
        /*
            Создайте внутри метода main массив String на 4 ячейки.
            Дайте имя переменной созданного массива - names.
            Заполните массив произвольными именами.
            После этого выведите каждую ячейку на консоль.
        */

        String[] names = new String[4];
        names[0] = "A";
        names[1] = "B";
        names[2] = "C";
        names[3] = "D";
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
        // 0, 1, 2, 3
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
