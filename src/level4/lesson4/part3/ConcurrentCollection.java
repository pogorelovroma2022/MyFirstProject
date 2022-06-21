package level4.lesson4.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrentCollection {
    volatile int age;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // ...

        List<String> newNames = Collections.synchronizedList(names);

        // ThreadLocal variable
    }
}
