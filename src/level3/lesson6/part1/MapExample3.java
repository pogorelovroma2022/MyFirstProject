package level3.lesson6.part1;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer, String> deals = new HashMap<>();

        deals.put(10, "Проснуться");
        deals.put(2, "Умыться");
        deals.put(3, "Поесть");
        deals.put(4, "Потрудиться");
        deals.put(5, "Лечь спать");

        System.out.println(deals);
        System.out.println(deals.get(3));
    }
}
