package level3.lesson5.part1;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//         add()
//        names.add("Ivan");
//        System.out.println(names);
//        names.add("Alexander");
//        System.out.println(names);

        // set()
//        names.set(1, "Alex");
//        System.out.println(names);

        // remove()
//        names.remove("Alex");
//        System.out.println(names);

        // get()
//        System.out.println(names.get(0));

//        List<Person> people = new ArrayList<>();
//        Person margarita = new Person("Margarita", 28);
//        people.add(margarita);
//        people.add(new Person("Olga", 25));
//        System.out.println(people);

        // Generics
        // Дженерики, Обобщенные типы данных.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(7);
        numbers.add(88);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            Integer currentNumber = numbers.get(i);
            System.out.println(currentNumber);
        }
        System.out.println("===============");
        for (Integer currentNumber: numbers) {
            System.out.println(currentNumber);
        }
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
}