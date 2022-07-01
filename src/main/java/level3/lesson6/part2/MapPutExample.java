package level3.lesson6.part2;

import java.util.HashMap;
import java.util.Map;

public class MapPutExample {
    public static void main(String[] args) {
        // map.put(k, v);

        // 1. hashcode()
        // 2. hash() - вычисляется номер "бакета" (ячейка массива)
        // 3. Идёт проверка пустая ли ячейка
            // a. equals()
                // a.1 equals == true: замена
                // a.2 equals == false: linkedlist (-> treeset)

        Map<String, String> numbers = new HashMap<>();
        // 0 = zero, 1 = one, 2 = two, 11 = eleven
        numbers.put("0", "zero");
        // 1. hashcode = 48
        // 2. hash -> 0
        System.out.println(1568 % 16);
        numbers.put("1", "one");
        numbers.put("2", "two");
        numbers.put("11", "eleven");
    }
}
