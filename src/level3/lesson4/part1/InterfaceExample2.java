package level3.lesson4.part1;

public class InterfaceExample2 {
}

interface CanFly {
    void fly();
}

interface CanWalk {
    void walk();
}

interface CanSwim {
    void swim();
}

class Penguin implements CanWalk, CanSwim {
    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }
}

class Seagull implements CanSwim, CanWalk, CanFly {
    @Override
    public void fly() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }
}

class GoldenFish implements CanSwim {
    @Override
    public void swim() {
        System.out.println("Плаваю");
    }
}

class Crocodile implements CanSwim, CanWalk {
    @Override
    public void walk() {
        System.out.println("");
    }

    @Override
    public void swim() {
        System.out.println();
    }
}