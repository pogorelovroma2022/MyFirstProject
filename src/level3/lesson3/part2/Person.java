package level3.lesson3.part2;

public class Person {
    void earnMoney() {
        System.out.println("Hard work");
    }
}

class Child extends Person {
    @Override
    void earnMoney() {
        System.out.println("Просить денег у родителей");
    }

    public static void main(String[] args) {
        Person child = new Child();
        child.earnMoney();
    }
}
