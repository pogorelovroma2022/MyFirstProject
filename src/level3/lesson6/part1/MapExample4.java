package level3.lesson6.part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample4 {
    public static void main(String[] args) {
        Map<String, Citizen> citizens = new HashMap<>();
        Citizen johnny = new Citizen("Johnny", "Depp", "Ab123", 3);
        Citizen arnold = new Citizen("Arnold", "Schwarzenegger", "123b", 5);
        Citizen jim = new Citizen("Jim", "Carrey", "777 abc", 0);
        Citizen emma = new Citizen("Emma", "Watson", "xyz78", 7);

        citizens.put(johnny.passportNumber, johnny);
        citizens.put(arnold.passportNumber, arnold);
        citizens.put(jim.passportNumber, jim);
        citizens.put(emma.passportNumber, emma);

//        System.out.println(citizens);
        System.out.println(citizens.get("123b"));
    }
}

class Citizen {
    String name;
    String familyName;
    String passportNumber;
    int childrenQuantity;

    public Citizen(String name, String familyName, String passportNumber, int childrenQuantity) {
        this.name = name;
        this.familyName = familyName;
        this.passportNumber = passportNumber;
        this.childrenQuantity = childrenQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return childrenQuantity == citizen.childrenQuantity && Objects.equals(name, citizen.name) && Objects.equals(familyName, citizen.familyName) && Objects.equals(passportNumber, citizen.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName, passportNumber, childrenQuantity);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", childrenQuantity=" + childrenQuantity +
                '}';
    }
}