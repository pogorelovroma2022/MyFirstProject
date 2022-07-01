package level3.lesson3.part2;

public class OverloadingExample {
    static void hello() {
        System.out.println("Hello");
    }

    static void hello(String name) {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        hello();
        hello("Robert");
    }
}
