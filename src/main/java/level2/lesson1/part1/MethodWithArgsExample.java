package level2.lesson1.part1;

public class MethodWithArgsExample {
    public static void main(String[] args) {
        add(10, 20);
        add(15, 25);

        sayHello("Darya");
        sayHello("Victoria", 23);
        sayHello("Denis", 30);
        sayHello2("Roma");
        Math.sqrt(16);
    }

    static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void sayHello2(String name) {
        System.out.print("Hello 2. ");
        System.out.println("I'm " + name + ". I'm a Java developer. ");
    }

    static void sayHello(String name) {
        System.out.print("Hello. ");
        System.out.println("I'm " + name + ". I'm a Java developer. ");
    }

    static void sayHello(String name, int age) {
        System.out.print("Hello. ");
        System.out.println("I'm " + name + ". I'm " + age + " years old. I'm a Java developer. ");
    }
}
