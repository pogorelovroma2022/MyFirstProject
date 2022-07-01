package level2.lesson5;

public class StringExample2 {
    public static void main(String[] args) {
        // indexOf
        String name = "Ivan Ivanov";
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));

        // substring
        String phrase = "Hello, my name is Alex";
        System.out.println(phrase.substring(7, 14));

        // isEmpty
        String string = "";
        String string2 = "     ";
        System.out.println(string.isEmpty());
        System.out.println(string2.trim().isEmpty());

        // trim
        String string4 = "   a   ";
        System.out.println(string4);
        System.out.println(string4.trim());

        // replace
        String string5 = "Hillo, my name is Alex. Hillo, Hillo";
        System.out.println(string5.replace("Hillo", "Hello"));

        // startWith / endWith
        String string6 = "Котёнок";
        System.out.println(string6.startsWith("кот"));
        System.out.println(string6.startsWith("Кат"));

        // contains
        System.out.println(string6.contains("Кот"));
        System.out.println(string6.contains("тён"));
        System.out.println(string6.contains("Кат"));

        // repeat
        String string7 = "abc";
        System.out.println(string7.repeat(5));
    }
}
