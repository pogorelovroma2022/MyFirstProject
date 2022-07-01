package level3.lesson3.part1;

public class Person {
    public String name;
    private int salary;

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class PersonUsage {
    public static void main(String[] args) {
        Person fred = new Person("Fred", 10_000);

        System.out.println(fred.name);
//        System.out.println(fred.salary);

//        fred.printInfo();
    }
}
