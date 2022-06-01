package level1.lesson3.part2;

public class TaskDoubleAnd {
    public static void main(String[] args) {
//        Написать программу, в которой 2 boolean переменных isHungry, hasFood,
//        использовать “if” и “&&”, если обе переменные true, то вывести “Завтракаем”.
//        В любом случае в конце программы должен быть вывод “Иду на работу”.
        boolean isHungry = false;
        boolean hasFood = true;
        if (isHungry && hasFood) {
            System.out.println("Have breakfast");
        }
        System.out.println("Go work");
    }
}
