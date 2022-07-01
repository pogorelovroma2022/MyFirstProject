package level1.lesson3.part2;

public class StringComparison {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 11;
//        System.out.println(a == b);

//        String name = new String("Ivan");
//        String name2 = new String("Ivan");
//        System.out.println("Ivan".equals("Ivan"));

        String phrase = "Привет1";
//        ==
        if ("Привет".equals(phrase)) {
            System.out.println("И тебе, привет!");
        } else if ("Пока".equals(phrase)) {
            System.out.println("И тебе, пока");
        } else {
            System.out.println("Я тебя не понимаю");
        }
    }
}
