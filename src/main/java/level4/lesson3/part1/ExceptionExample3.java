package level4.lesson3.part1;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ангелина");
        names.add("Вера");
        names.add("Дмитрий");

        System.out.println(names.get(10));
    }
}
