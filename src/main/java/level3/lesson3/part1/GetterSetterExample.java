package level3.lesson3.part1;

public class GetterSetterExample {
    // Getter
    // Setter
    public static void main(String[] args) {
        Person2 will = new Person2(35);
    }
}

class Person2 {
    private int age;
    private String name;

    public Person2(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}