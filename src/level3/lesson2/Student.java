package level3.lesson2;

public class Student {
    String name;
    int groupNumber;

    Student(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
        System.out.println("Hi, from Student constructor");
    }

    // super
    public static void main(String[] args) {
//        Student student = new Student("Margarita", 356);
//        System.out.println(student.name + ", " + student.groupNumber);
        Aspirant aspirant = new Aspirant("Ivan", 555, "Programming languages");
//        System.out.println(aspirant.name + ", " + aspirant.groupNumber + ", " + aspirant.scienceTopic);
    }
}

class Aspirant extends Student {
    String scienceTopic;

    Aspirant(String name, int groupNumber, String scienceTopic) {
        super(name, groupNumber);
        this.scienceTopic = scienceTopic;
        System.out.println("Hi, from Aspirant constructor");
    }
}
