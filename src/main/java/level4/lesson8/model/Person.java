package level4.lesson8.model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int age;
    public String name;
    @ManyToOne
    public City city;

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(int age, String name, City city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public Person(int id, int age, String name, City city) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
