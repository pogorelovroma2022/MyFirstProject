package level4.lesson2.part1;

public class HeapStackExample2 {
    public static void main(String[] args) {
        Person alla = new Person("Alla", "Pugacheva", 70);
        Person alla2 = new Person("Alla", "Pugacheva", 70);

        showFullName(alla);
    }

    static void showFullName(Person person) {
        String fullName = person.name + " " + person.surname;
        System.out.println(fullName);
    }
}

class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
