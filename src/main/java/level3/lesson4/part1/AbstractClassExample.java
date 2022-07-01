package level3.lesson4.part1;

public class AbstractClassExample {
    // class vs abstract class:
    // no object, no instances
    // can have abstract methods
    public static void main(String[] args) {
        Transport[] transports = {
                new Bus(100, 40, 150_000),
                new Bus(20, 70, 250_000),
                new Airplane(100, 1_000, 100_000_000),
                new Train(500, 400, 100_000_000)
        };
        for (Transport transport: transports) {
            transport.printInfo();
            transport.move();
            System.out.println();
        }
    }
}

abstract class Transport {
    int passengerQuantity;
    int averageSpeed;
    int cost;

    public Transport(int passengerQuantity, int averageSpeed, int cost) {
        this.passengerQuantity = passengerQuantity;
        this.averageSpeed = averageSpeed;
        this.cost = cost;
    }

    abstract void move();

    void printInfo() {
        System.out.println("Passenger quantity: " + passengerQuantity);
        System.out.println("Average speed: " + averageSpeed);
        System.out.println("Cost: " + cost);
    }
}

class Bus extends Transport {
    public Bus(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    @Override
    void move() {
        System.out.println("Еду по дороге, но останавливаюсь только на остановках");
    }
}

class Airplane extends Transport {
    public Airplane(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    @Override
    void move() {
        System.out.println("Лечу");
    }
}

class Car extends Transport {
    public Car(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    @Override
    void move() {
        System.out.println("Едем по дороге");
    }
}

class Train extends Transport {
    public Train(int passengerQuantity, int averageSpeed, int cost) {
        super(passengerQuantity, averageSpeed, cost);
    }

    @Override
    void move() {
        System.out.println("Едем по рельсам");
    }
}
