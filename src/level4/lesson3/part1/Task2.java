package level4.lesson3.part1;

/*
    Создайте класс Человек с полем age, сделайте поле закрытым, создайте геттер и сеттер к полю, в сеттер добавьте проверку,
    если переданный аргумент меньше нуля выкиньте исключение RuntimeException с сообщением “Возраст должен быть больше нуля”.
    Создайте метод main, в нём объект класса Человек и вызовите сеттер дважды, 1й раз с корректным значением, 2й раз с
    некорректным.
*/
public class Task2 {
    public static void main(String[] args) {
        Person vasiliy = new Person();
        try {
            vasiliy.setAge(10);
            vasiliy.setAge(-10);
        } catch (IncorrectAgeException e) {
            System.out.println("Произошла ошибка: " + e);
        }
    }
}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 0) {
            throw new MyException();
        }
        this.age = age;
    }
}

class MyException extends RuntimeException {

}