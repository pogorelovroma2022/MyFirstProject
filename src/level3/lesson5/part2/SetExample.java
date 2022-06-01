package level3.lesson5.part2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        List<Type> name = new List<Type>();
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        System.out.println(numbers);

        Set<Student> students = new TreeSet<>();
        students.add(new Student("Alexander", 35));
        students.add(new Student("Vika", 25));
        students.add(new Student("Anton", 25));
//        students.add(new Student("Vika", 20));
        System.out.println(students.size());
        System.out.println(students);
        for(Student student: students) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
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
        Student person = (Student) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
