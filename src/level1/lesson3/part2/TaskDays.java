package level1.lesson3.part2;

import java.util.Arrays;

public class TaskDays {
    public static void main(String[] args) {
//        System.out.println(5);
//        System.out.println("Ivan");

        String phrase = "Hello, my Hello name is Hello";
        String substring = "Hello";
        String[] hellos = phrase.split(substring);
        System.out.println(hellos.length);
        System.out.println(Arrays.toString(hellos));

        System.out.println((phrase.length() - phrase.replace(substring, "").length())/substring.length());
    }
}
