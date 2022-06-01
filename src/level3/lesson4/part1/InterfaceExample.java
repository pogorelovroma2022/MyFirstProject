package level3.lesson4.part1;

public interface InterfaceExample {
    // contract
    // opportunity

    // public abstract for methods
    // public final static for fields
}

class InterfaceUsage {
    public static void main(String[] args) {
        CanEat[] aliveCreatures = {
          new Cow(), new Cow(), new Wolf(), new Person()
        };

        for (CanEat currentCreature: aliveCreatures) {
            currentCreature.eat();
        }
    }
}

interface CanEat {
    void eat();
}

class Cow implements CanEat {
    @Override
    public void eat() {
        System.out.println("Жую траву");
    }
}

class Wolf implements CanEat {
    @Override
    public void eat() {
        System.out.println("Найти добычу, убить и съесть");
    }
}

class Person implements CanEat {
    @Override
    public void eat() {
        System.out.println("Что-то приготовить и затем съесть");
    }
}