package level3.lesson4.part2;

import java.util.Objects;

public class EqualsExample {
    // equals
    public static void main(String[] args) {
//        Person ivan = new Person(30, "Ivan");
//        Person marya = new Person(25, "Marya");
//
//        System.out.println(ivan);
//        System.out.println(marya);

        Person petya = new Person(32, "Petr", "Ivanov");
        Person petya2 = new Person(32, "Petr", "Ivanov");
        Person marya = new Person(32, "Marya", "Petrova");
        System.out.println(petya.equals(petya2));
        System.out.println(marya.equals(petya2));
    }
}

class Person {
    int age;
    String name;
    String surname;

    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname);
    }
}