package level3.lesson1.part2;

/*
    По картинке создать класс с полями и методами. В main создать объекты этого класса также
    по картинке и присвоить полям значения с картинки. В методах выводить что делает метод,
    например для метода “eat” выводить “я ем”, либо по английски “I eat”
    https://www.guru99.com/images/java/052016_0704_ObjectsandC6.jpg
*/

/*
    Добавить в этот класс конструктор с аргументами и методом printInfo() и в методе
    main проинициализировать все поля через конструктор и вызвать метод printInfo для объектов.
*/
public class Dog {
    String breed;
    String size;
    int age;
    String color;

    void printInfo() {
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    void doAllActions() {
        eat();
        sleep();
        sit();
        run();
    }

    void eat() {
        System.out.println("I eat");
    }

    void sleep() {
        System.out.println("I sleep");
    }

    void sit() {
        System.out.println("I sit");
    }

    void run() {
        System.out.println("I run");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.breed = "Neapolitan Mastiff";
        dog1.size = "Large";
        dog1.age = 5;
        dog1.color = "Black";

        Dog dog2 = new Dog();
        dog2.breed = "Maltese";
        dog2.size = "Small";
        dog2.age = 2;
        dog2.color = "White";

        Dog dog3 = new Dog();

        dog3.doAllActions();
    }
}
