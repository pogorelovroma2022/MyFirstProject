package level3.lesson5.part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            names.add("some-name: " + i);
        }
        for (int i = 0; i < 10_000; i++) {
            names.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        names = new LinkedList<>();
        for (int i = 0; i < 10_000; i++) {
            names.add("some-name: " + i);
        }
        for (int i = 0; i < 10_000; i++) {
            names.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - start));
    }
}
