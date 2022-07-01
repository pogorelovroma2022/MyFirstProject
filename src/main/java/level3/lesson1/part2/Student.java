package level3.lesson1.part2;

public class Student {
    String name;
    int age;
    boolean hasMoney;

    public static void main(String[] args) {
        // default
        Student vasya = new Student();
        vasya.hasMoney = true;
        vasya.age = 28;
        vasya.name = "Vasiliy";
    }
}
