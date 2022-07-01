package level3.lesson5.part2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class HashVSTreeSet {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Set<Human> names = new HashSet<>();
        // 1
        for (int i = 0; i < 100_000; i++) {
            names.add(new Human("Name: " + i, i));
        }
        for (Human human: names) {}
        long end = System.currentTimeMillis();
        System.out.println("HashSet: " + (end - start));

        start = System.currentTimeMillis();
        names = new TreeSet<>();
        // log n
        // 1_000_000
        // 20
        for (int i = 0; i < 100_000; i++) {
            names.add(new Human("Name: " + i, i));
        }
        for (Human human: names) {}
        end = System.currentTimeMillis();
        System.out.println("TreeSet: " + (end - start));
    }
}

class Human implements Comparable<Human>{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name) + (this.age - o.age);
    }
}
