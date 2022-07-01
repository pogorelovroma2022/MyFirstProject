package level4.lesson2.part2;

public class StringFormat {
    // String.format(pattern, args)
    // System.out.printf(); souf(pattern, args)
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        // a = 1, b = 2, c = 3
//        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
//        System.out.printf("a = %d, b = %d, c = %d", a, b, c);

        String name = "Bender";
        int age = 12;
        String friend = "Fry";
        int weight = 200;
        // User = {name: Bender, age: 12, friend: Fry, weight: 200kg}
//        System.out.println("User = {name: " + name + ", age: " + age + ", friend: " + friend + ", weight: " + weight + "kg}");
//        System.out.printf("User = {name: %s, age: %d, friend: %s, weight: %dkg}", name, age, friend, weight);
        String fullText = String.format("User = {name: %s, age: %d, friend: %s, weight: %dkg}", name, age, friend, weight);
        System.out.println(fullText);
    }
}
