package level1.lesson3.part1;

public class TaskTemperature {
    public static void main(String[] args) {
//        З-ча с if:
//        создать класс
//        создать переменную temperature, присвоить любое значение от -30 до 30.
//        создать переменную isCold, в ней должна быть проверка temperature, меньше ли она 15.
//        использовать “if”, если isCold равняется true, то вывести “Одеваю пальто”
//        в конце программы должен быть вывод “Иду гулять.”
//        подумать, нужно ли делать проверку isCold на true или можно упростить?

        int temperature = 16;
        boolean isCold = temperature < 15;
        if (temperature < 15) {
            System.out.println("Put on a coat");
        }
        System.out.println("Go outside");
    }
}
