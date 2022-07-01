package level2.lesson1.part2;

public class TaskWithParameters {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Victoria";
        int age = 33;

        hello(name, age);
    }
}
