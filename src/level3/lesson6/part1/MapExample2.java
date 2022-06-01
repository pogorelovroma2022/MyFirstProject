package level3.lesson6.part1;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String, String> translator = new HashMap<>();

        translator.put("яблоко", "apple");
        translator.put("арбуз", "watermelon");
        translator.put("машина", "car");

        System.out.println(translator);

        System.out.println(translator.get("машина"));
    }
}
