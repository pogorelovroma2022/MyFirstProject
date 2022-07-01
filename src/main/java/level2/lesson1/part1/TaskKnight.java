package level2.lesson1.part1;

/*
    Создать класс, в нём создать три своих метода: “идти налево”, “идти направо”, “идти прямо”,
     каждый должен выводить на экран соответствующую информацию. Что выводить на экран берём из сказки Змей Горыныча:
      Налево пойдёшь - богатым будешь, направо - женатым, а кто прямо пойдёт, тот к камню вернётся.
        В main, вызвать методы “идтиПрямо” 2 раза и 1 раз вызвать любой другой свой метод.
*/

public class TaskKnight {
    public static void main(String[] args) {
        goForward();
        goForward();
        goRight();
    }

    static void goLeft() {
        System.out.println("You'll be rich.");
    }
    static void goRight() {
        System.out.println("You'll be married.");
    }
    static void goForward() {
        System.out.println("Go back to the stone.");
    }
}
