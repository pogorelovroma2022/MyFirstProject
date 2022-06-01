package level3.lesson5.part2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainsExample {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//
//        System.out.println(numbers.contains(2));
//        System.out.println(numbers.contains(3));

//        List<String> names = new ArrayList<>();
//        names.add("Petr");
//
//        System.out.println("Vera: " + names.contains("Vera"));
//        System.out.println("Petr: " + names.contains("Petr"));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Vika", 20));
        people.add(new Person("Vika", 20));

        System.out.println(people);
        System.out.println(people.contains(new Person("Vika", 20)));
        // equals
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
