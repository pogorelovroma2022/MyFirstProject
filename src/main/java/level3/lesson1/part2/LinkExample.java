package level3.lesson1.part2;

public class LinkExample {
    public static void main(String[] args) {
        // primitives(8 types) & object/link
        int x = 10;
        int y = x; // y = 10;
        System.out.println("x: " + x + ", y: " + y);
        x = 11;
        System.out.println("x: " + x + ", y: " + y);

        System.out.println("=".repeat(20));

        Box box1 = new Box();
        box1.value = 10;

        Box box2 = box1;
        System.out.println("box1: " + box1.value + ", box2: " + box2.value);
        box2.value = 11;
        System.out.println("box1: " + box1.value + ", box2: " + box2.value);
    }
}
